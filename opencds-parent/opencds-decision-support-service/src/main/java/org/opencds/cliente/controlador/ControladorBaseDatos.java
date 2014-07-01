package org.opencds.cliente.controlador;

import java.awt.Choice;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.opencds.cliente.modelo.Paciente;

public class ControladorBaseDatos {
	private static final ControladorBaseDatos unicaInstancia = new ControladorBaseDatos();
	private Connection bd;

	public static ControladorBaseDatos getUnicainstancia() {
		return unicaInstancia;
	}

	public void conectar() {

		try {
			Class.forName("org.postgresql.Driver");
			bd = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/TFG", "postgres", "root");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void desconectar() {
		try {
			bd.close();
		} catch (SQLException e) {

		}
	}

	/**
	 * Obtiene el paciente de la id pasada
	 * 
	 * @param idPaciente
	 *            La id del paciente que se busca
	 * @return El paciente con la id mencionada. El paciente sera el objeto
	 *         "intermedio" que se ha creado, y no solo los datos de la base de
	 *         datos
	 */
	public Paciente obtenerPaciente(int idPaciente) {
		// TODO el paciente tiene que estar completo
		// por ahora que obtenga la edad, temperatura y leucocitos

		Paciente paciente = new Paciente();
		paciente.setIdentificador(String.valueOf(idPaciente));

		try {
			this.rellenarDatosPaciente(paciente);
			this.rellenarTemperatura(paciente);
			this.rellenarLeucocitos(paciente);

		} catch (SQLException e) {

		}
		this.desconectar();
		return paciente;
	}

	/**
	 * Rellena el campo de leucocitos del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellena el campo
	 * @throws SQLException
	 */
	private void rellenarLeucocitos(Paciente paciente) throws SQLException {
		this.conectar();
		Statement st = bd.createStatement();
		// buscamos en la historia clinica el valor de los leucocitos mas
		// reciente
		// TODO ¿que habria que hacer en realidad?
		// a lo mejor en lugar de seleccionar pacientes habria que seleccionar
		// diagnosticos
		ResultSet rs = st
				.executeQuery("SELECT ana.fecha, an01_leucocitos FROM tfg.datos_analitica ana WHERE ana.id_paciente="
						+ paciente.getIdentificador() + "");

		Date masReciente = new Date(1);
		int ultimosLeucocitos = 0;
		while (rs.next()) { // si en ese diagnostico se ha registrado leucocitos
			if (rs.getString(2) != null) {
				Date fecha = rs.getDate(1);
				if (fecha.after(masReciente)) {
					ultimosLeucocitos = rs.getInt(2);
					masReciente = fecha;
				}
			}
		}

		// ponemos el atributo leucocitos
		paciente.setLeucocitos(ultimosLeucocitos);
		this.desconectar();
	}

	/**
	 * Metodo que rellena la edad y el sexo del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellenan los datos
	 * @throws SQLException
	 */
	private void rellenarDatosPaciente(Paciente paciente) throws SQLException {
		this.conectar();
		Statement st = bd.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT pac.dc00_sexo, pac.dc01_edad FROM tfg.paciente pac WHERE pac.id_paciente="
						+ paciente.getIdentificador() + "");
		// iteramos sobre la primera devolucion. Como esa tabla tiene 1
		// entrada por cada paciente no habran entradas repetidas
		rs.next();
		// en esta columna tenemos la edad
		paciente.setEdad(rs.getDouble(2));
		// en esta columna tenemos el sexo
		if (rs.getString(1).equals("hombre")) {
			paciente.setSexo("M");
		} else if (rs.getString(1).equals("mujer")) {
			paciente.setSexo("F");
		}
		this.desconectar();
	}

	/**
	 * Metodo que rellena la temperatura del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellena la temperatura
	 * @throws SQLException
	 */
	private void rellenarTemperatura(Paciente paciente) throws SQLException {
		this.conectar();
		Statement st = bd.createStatement();
		// buscamos en la historia clinica el valor de la temperatura de
		// fiebre mas reciente
		// TODO ¿que habria que hacer en realidad?
		// a lo mejor en lugar de seleccionar pacientes habria que seleccionar
		// diagnosticos
		ResultSet rs = st
				.executeQuery("SELECT cli.fecha, cli.dc02b_temperatura_valor FROM tfg.datos_clinicos cli WHERE cli.id_paciente="
						+ paciente.getIdentificador() + "");

		Date masReciente = new Date(1);
		double ultimaTemperatura = 0.0;
		while (rs.next()) { // si en ese diagnostico se ha registrado una
							// temperatura
			if (rs.getString(2) != null) {
				Date fecha = rs.getDate(1);
				if (fecha.after(masReciente)) {
					ultimaTemperatura = rs.getDouble(2);
					masReciente = fecha;
				}
			}
		}

		// ponemos el atributo temperatura
		paciente.setTemperatura(ultimaTemperatura);
		this.desconectar();
	}

	/**
	 * Hace la conexion con la base de datos, y obtiene la lista de pacientes
	 * que hay disponible
	 * 
	 * @param choice
	 */
	public void listarPacientes(Choice desplegablePacientes) {
		this.conectar();

		try {
			Statement st = bd.createStatement();
			ResultSet rs = st
					.executeQuery("SELECT id_paciente FROM tfg.paciente ");
			while (rs.next()) {
				desplegablePacientes.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.desconectar();
	}

}

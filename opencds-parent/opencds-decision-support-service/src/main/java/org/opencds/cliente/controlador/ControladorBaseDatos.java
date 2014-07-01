package org.opencds.cliente.controlador;

import java.awt.Choice;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.sql.DATE;

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
		// por ahora que obtenga la edad y la temperatura

		Paciente paciente = new Paciente();
		paciente.setIdentificador(String.valueOf(idPaciente));

		try {
			this.conectar();
			Statement st = bd.createStatement();
			ResultSet rs = st
					.executeQuery("SELECT pac.dc00_sexo, pac.dc01_edad FROM tfg.paciente pac WHERE pac.id_paciente="
							+ idPaciente + "");
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

			// buscamos en la historia clinica el valor de la temperatura de
			// fiebre mas reciente
			// TODO ¿que habria que hacer en realidad?
			// a lo mejor en lugar de seleccionar pacientes habria que
			// seleccionar
			// diagnosticos
			rs = st.executeQuery("SELECT cli.fecha, cli.dc02b_temperatura_valor FROM tfg.datos_clinicos cli WHERE cli.id_paciente="
					+ idPaciente + "");

			Date masReciente = new Date(1);
			double ultimaTemperatura = 0.0;
			while (rs.next()) {
				// si en ese diagnostico se ha registrado una temperatura
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

		} catch (SQLException e) {

		}
		this.desconectar();
		return paciente;
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

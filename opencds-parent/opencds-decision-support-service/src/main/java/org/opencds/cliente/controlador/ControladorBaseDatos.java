package org.opencds.cliente.controlador;

import java.awt.Choice;
import java.sql.Connection;
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
	 * Obtiene los datos el paciente de la id pasada
	 * 
	 * @param idPaciente
	 *            La id del paciente que se busca
	 * @param idClinic
	 *            La id de sus datos clinicos
	 * @param idAnalit
	 *            La id de sus datos de analitica
	 * @param idMicro
	 *            La id de sus datos de microbiologia
	 * @param idVenti
	 *            La id de sus datos de ventilacion
	 * @param idTrat
	 *            La id de sus datos de tratamiento
	 * @return El paciente con la id mencionada. El paciente sera el objeto
	 *         "intermedio" que se ha creado, y no solo los datos de la base de
	 *         datos
	 */
	public Paciente obtenerPaciente(int idPaciente, int idClinic, int idAnalit,
			int idMicro, int idVenti, int idTrat) {
		// TODO el paciente tiene que estar completo
		// por ahora que obtenga la edad, temperatura y leucocitos

		Paciente paciente = new Paciente();
		paciente.setIdentificador(String.valueOf(idPaciente));

		try {
			this.rellenarDatosPaciente(paciente);
			// comprobar con -1 es que ese dato esta relleno
			if (idClinic != -1) {
				this.rellenarTemperatura(paciente, idClinic);
			}
			if (idAnalit != -1)
				this.rellenarLeucocitos(paciente, idAnalit);
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
	 * @param identificador
	 *            El identificador de la analitica que se va a usar
	 * @throws SQLException
	 */
	private void rellenarLeucocitos(Paciente paciente, int identificador)
			throws SQLException {
		this.conectar();
		Statement st = bd.createStatement();
		// buscamos en la historia clinica el valor de los leucocitos de los
		// datos de la analitica del identificador
		ResultSet rs = st
				.executeQuery("SELECT an01_leucocitos FROM tfg.datos_analitica ana WHERE ana.id_dato="
						+ identificador);

		rs.next();
		// ponemos el atributo leucocitos
		paciente.setLeucocitos(rs.getInt(1));
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
	 * @param identificador
	 *            El identificador de los datos clinicos que se van a usar
	 * @throws SQLException
	 */
	private void rellenarTemperatura(Paciente paciente, int identificador)
			throws SQLException {
		this.conectar();
		Statement st = bd.createStatement();
		// buscamos en la historia clinica el valor de la temperatura de
		// fiebre dentro de los datos clinicos del identificador
		ResultSet rs = st
				.executeQuery("SELECT cli.dc02b_temperatura_valor FROM tfg.datos_clinicos cli WHERE cli.id_dato="
						+ identificador);

		rs.next();
		// ponemos el atributo leucocitos
		paciente.setTemperatura(rs.getDouble(1));
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
		desplegablePacientes.add("");
		try {
			Statement st = bd.createStatement();
			ResultSet rs = st
					.executeQuery("SELECT id_paciente FROM tfg.paciente ");
			while (rs.next()) {
				desplegablePacientes.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		this.desconectar();
	}

	/**
	 * Hace la conexion a la base de datos y obtiene la lista de diagnosticos
	 * del paciente pedido
	 * 
	 * @param idPaciente
	 *            El paciente para el que se obtienen los diagnosticos
	 * @param desplegableEHR
	 */
	public void listarEHR(String idPaciente, Choice desplegableEHR) {
		// limpiar lo que ya hay
		desplegableEHR.removeAll();
		// primer campo vacio por si se decide no usar este dato
		desplegableEHR.add("");
		if (idPaciente != "") {

			this.conectar();
			try {
				Statement st = bd.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT cli.id_dato, cli.fecha FROM tfg.datos_clinicos cli WHERE cli.id_paciente="
								+ idPaciente + " ORDER BY cli.fecha DESC");
				while (rs.next()) {
					desplegableEHR.add("Fecha: " + rs.getDate(2)
							+ " Historial Nº: " + rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.desconectar();
		}
	}

	/**
	 * Hace una conexion a la base de datos y recupera los datos de analitica
	 * del paciente pedido
	 * 
	 * @param idPaciente
	 *            El paciente para el que se recuperan los datos
	 * @param desplegableAnalitica
	 */
	public void listarAnalitica(String idPaciente, Choice desplegableAnalitica) {
		// limpiar lo que ya hay
		desplegableAnalitica.removeAll();
		// primer campo vacio por si se decide no usar este dato
		desplegableAnalitica.add("");
		if (idPaciente != "") {
			this.conectar();
			try {
				Statement st = bd.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT cli.id_dato, cli.fecha FROM tfg.datos_analitica cli WHERE cli.id_paciente="
								+ idPaciente + " ORDER BY cli.fecha DESC");
				while (rs.next()) {
					desplegableAnalitica.add("Fecha: " + rs.getDate(2)
							+ " Historial Nº: " + rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.desconectar();
		}
	}

	/**
	 * Hace una conexion a la base de datos y recupera los datos de
	 * microbiologia
	 * 
	 * @param idPaciente
	 *            Paciente para el que se recuperan los datos de microbiologia
	 * @param desplegableMicro
	 */
	public void listarMicro(String idPaciente, Choice desplegableMicro) {
		// limpiar lo que ya hay
		desplegableMicro.removeAll();
		// primer campo vacio por si se decide no usar este dato
		desplegableMicro.add("");
		if (idPaciente != "") {
			this.conectar();
			try {
				Statement st = bd.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT cli.id_dato, cli.fecha FROM tfg.datos_microbiologia cli WHERE cli.id_paciente="
								+ idPaciente + " ORDER BY cli.fecha DESC");
				while (rs.next()) {
					desplegableMicro.add("Fecha: " + rs.getDate(2)
							+ " Historial Nº: " + rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.desconectar();
		}
	}

	/**
	 * Metodo se conecta a la base de datos y recupera la lista de tratamientos
	 * de un paciente
	 * 
	 * @param idPaciente
	 *            Paciente para el que se recupera los datos
	 * @param desplegableTratamiento
	 */
	public void listarTratamiento(String idPaciente,
			Choice desplegableTratamiento) {
		// limpiar lo que ya hay
		desplegableTratamiento.removeAll();
		// primer campo vacio por si se decide no usar este dato
		desplegableTratamiento.add("");
		if (idPaciente != "") {
			this.conectar();
			try {
				Statement st = bd.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT cli.id_dato, cli.fecha_inicio FROM tfg.datos_tratamientos cli WHERE cli.id_paciente="
								+ idPaciente
								+ " ORDER BY cli.fecha_inicio DESC");
				while (rs.next()) {
					desplegableTratamiento.add("Fecha Inicio: " + rs.getDate(2)
							+ " Historial Nº: " + rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.desconectar();
		}
	}

	/**
	 * Metodo que se conecta a la base de datos y recupera los datos de
	 * ventilacion de un paciente
	 * 
	 * @param idPaciente
	 *            Paciente para el que se recuperan los datos de ventilacion
	 * @param desplegableVentilacion
	 */
	public void listarVentilacion(String idPaciente,
			Choice desplegableVentilacion) {
		// limpiar lo que ya hay
		desplegableVentilacion.removeAll();
		// primer campo vacio por si se decide no usar este dato
		desplegableVentilacion.add("");
		if (idPaciente != "") {
			this.conectar();
			try {
				Statement st = bd.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT cli.id_dato, cli.fecha FROM tfg.datos_ventilacion cli WHERE cli.id_paciente="
								+ idPaciente + " ORDER BY cli.fecha DESC");
				while (rs.next()) {
					desplegableVentilacion.add("Fecha: " + rs.getDate(2)
							+ " Historial Nº: " + rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.desconectar();
		}
	}

}

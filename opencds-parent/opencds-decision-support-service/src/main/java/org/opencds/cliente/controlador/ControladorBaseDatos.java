package org.opencds.cliente.controlador;

import java.awt.Choice;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.opencds.cliente.modelo.Booleano;
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
	 * 
	 * @return El paciente con la id mencionada. El paciente sera el objeto
	 *         "intermedio" que se ha creado, y no solo los datos de la base de
	 *         datos
	 */
	public Paciente obtenerPaciente(int idPaciente, int idClinic) {

		Paciente paciente = new Paciente();
		paciente.setIdentificador(String.valueOf(idPaciente));

		// llama a los diferentes metodos para que rellene los datos del
		// paciente usando la base de datos

		this.rellenarDatosPaciente(paciente);
		// comprobar con -1 es que ese dato esta relleno
		Date fechaClin = new Date(0);
		if (idClinic != -1) {
			fechaClin = this.rellenarDatosClinicos(paciente, idClinic);
		} else {
			JOptionPane.showMessageDialog(null,
					"No se han seleccionado los datos clínicos del paciente",
					"AVISO", JOptionPane.WARNING_MESSAGE);
		}

		if (!this.rellenarDatosAnalitica(paciente, fechaClin))
			// mostrar warning indicando que no se ha encontrado analitica
			JOptionPane
					.showMessageDialog(
							null,
							"No se han encontrado datos de analítica de los 15 días anteriores",
							"AVISO", JOptionPane.WARNING_MESSAGE);

		if (!this.rellenarDatosVentilacion(paciente, fechaClin))
			// mostrar warning indicando que no se ha encontrado datos
			// de
			// ventilacion
			JOptionPane
					.showMessageDialog(
							null,
							"No se han encontrado datos de ventilación de los 15 días anteriores",
							"AVISO", JOptionPane.WARNING_MESSAGE);

		if (!this.rellenarDatosMicro(paciente, fechaClin))
			// mostrar warning indicando que no se ha encontrado datos
			// de
			// microbiologia
			JOptionPane
					.showMessageDialog(
							null,
							"No se han encontrado datos de microbiología de los 15 días anteriores",
							"AVISO", JOptionPane.WARNING_MESSAGE);

		return paciente;
	}

	/**
	 * Metodo que rellena los datos de microbiologia del paciente
	 * 
	 * @param paciente
	 *            Paciente al que se le rellenan los campos
	 * @param fechaClin
	 *            La fecha de los datos clinicos, la analitica sera la mas
	 *            reciente en los 15 dias anteriores
	 * @return True si encuentra datos de microbiologia, false sino
	 */
	private boolean rellenarDatosMicro(Paciente paciente, Date fechaClin) {
		try {
			this.conectar();
			Statement st = bd.createStatement();
			// buscamos en la historia microbiologica el valor de same bacteria
			// de los
			// datos de la microbiologia de 15 dias anteriores mas moderno
			ResultSet rs = st
					.executeQuery("SELECT micro.cu04_mismo_micro_repetido FROM tfg.datos_microbiologia micro WHERE micro.id_paciente="
							+ paciente.getIdentificador()
							+ " AND DATE_PART('day','"
							+ fechaClin
							+ "'- micro.fecha) <= 15 AND DATE_PART('day','"
							+ fechaClin
							+ "'- micro.fecha) >= 0 ORDER BY micro.fecha DESC ");
			if (rs.next()) {
				if (rs.getBoolean(1) == true)
					paciente.setMisma_bacteria(Booleano.TRUE);
				else if (rs.getBoolean(1) == false)
					paciente.setMisma_bacteria(Booleano.FALSE);
				if (rs.wasNull())
					paciente.setMisma_bacteria(Booleano.NONE);
				this.desconectar();
				return true;
			}
		} catch (SQLException e) {
		}
		return false;
	}

	/**
	 * Metodo que rellena datos de ventilacion del paciente
	 * 
	 * @param paciente
	 *            Paciente al que se le rellenan los campos
	 * @param fechaClin
	 *            La fecha de los datos clinicos, la analitica sera la mas
	 *            reciente en los 15 dias anteriores
	 * @return True si encuentra datos de ventilacion, false sino
	 */

	private boolean rellenarDatosVentilacion(Paciente paciente, Date fechaClin) {
		try {
			this.conectar();
			Statement st = bd.createStatement();
			// buscamos en la historia clinica
			// el valor de los leucocitos de
			// los datos de la analitica de
			// 15 dias anteriores
			ResultSet rs = st
					.executeQuery("SELECT venti.vent7a_oxigenacion_valor, venti.vent7b_ards FROM tfg.datos_ventilacion venti WHERE venti.id_paciente="
							+ paciente.getIdentificador()
							+ " AND DATE_PART('day','"
							+ fechaClin
							+ "'- venti.fecha) <= 15 AND DATE_PART('day','"
							+ fechaClin
							+ "'- venti.fecha) >= 0 ORDER BY venti.fecha DESC ");
			// ponemos los atributos obtenidos
			if (rs.next()) {
				paciente.setOxigenacion(rs.getInt(1));
				if (rs.getBoolean(2) == true)
					paciente.setARDS(Booleano.TRUE);
				else if (rs.getBoolean(2) == false)
					paciente.setARDS(Booleano.FALSE);
				if (rs.wasNull())
					paciente.setARDS(Booleano.NONE);
				this.desconectar();
				return true;
			}

		} catch (SQLException e) {
		}
		return false;
	}

	/**
	 * Rellena los campos de analitica del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellena el campo
	 * @param fechaClin
	 *            La fecha de los datos clinicos, la analitica sera la mas
	 *            reciente en los 15 dias anteriores
	 * @return True si encuentra datos de analitica, false sino
	 */
	private boolean rellenarDatosAnalitica(Paciente paciente, Date fechaClin) {
		try {
			this.conectar();
			Statement st = bd.createStatement();
			// buscamos en la historia clinica el valor de los leucocitos de los
			// datos de la analitica de 15 dias anteriores mas moderno
			ResultSet rs = st
					.executeQuery("SELECT an01_leucocitos FROM tfg.datos_analitica ana WHERE ana.id_paciente="
							+ paciente.getIdentificador()
							+ " AND DATE_PART('day','"
							+ fechaClin
							+ "'- ana.fecha) <= 15 AND DATE_PART('day','"
							+ fechaClin
							+ "'- ana.fecha) >= 0 ORDER BY ana.fecha DESC ");
			if (rs.next()) {
				paciente.setLeucocitos(rs.getInt(1));
				this.desconectar();
				return true;
			}
		} catch (SQLException e) {
		}
		return false;
	}

	/**
	 * Metodo que rellena datos demograficos del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellenan los datos
	 */
	private void rellenarDatosPaciente(Paciente paciente) {

		try {
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
		} catch (SQLException e) {
		}
	}

	/**
	 * Metodo que rellena datos clinicos del paciente
	 * 
	 * @param paciente
	 *            El paciente para el que se rellena la temperatura
	 * @param identificador
	 *            El identificador de los datos clinicos que se van a usar
	 * @return La fecha de los datos clinicos
	 */
	private Date rellenarDatosClinicos(Paciente paciente, int identificador) {
		try {
			this.conectar();
			Statement st = bd.createStatement();
			// buscamos en la historia clinica el valor de la temperatura de
			// fiebre dentro de los datos clinicos del identificador
			ResultSet rs = st
					.executeQuery("SELECT cli.fecha, cli.dc02b_temperatura_valor, cli.dc16_secrecion_traqueal, cli.dc14_rx_torax_infiltrado, dc15_rx_torax_evolucion, dc17_crecimiento_de_et FROM tfg.datos_clinicos cli WHERE cli.id_dato="
							+ identificador);

			rs.next();
			// ponemos los atributos obtenidos
			paciente.setTemperatura(rs.getDouble(2));
			paciente.setSecrecion_traqueal(rs.getString(3));
			paciente.setRayos_x_pecho(rs.getString(4));

			if (rs.getBoolean(5) == true)
				paciente.setProgresion_infiltracion_rayos_x_pecho(Booleano.TRUE);
			else if (rs.getBoolean(5) == false)
				paciente.setProgresion_infiltracion_rayos_x_pecho(Booleano.FALSE);
			if (rs.wasNull())
				paciente.setProgresion_infiltracion_rayos_x_pecho(Booleano.NONE);

			if (rs.getBoolean(6) == true)
				paciente.setEtCultivo(Booleano.TRUE);
			else if (rs.getBoolean(6) == false)
				paciente.setEtCultivo(Booleano.FALSE);
			if (rs.wasNull())
				paciente.setEtCultivo(Booleano.NONE);

			this.desconectar();
			return rs.getDate(1);
		} catch (SQLException e) {
		}

		return null;
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

}

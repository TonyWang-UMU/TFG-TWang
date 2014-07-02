package org.opencds.cliente.vista;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import org.opencds.cliente.controlador.ControladorBaseDatos;
import org.opencds.cliente.controlador.ControladorCliente;
import org.opencds.cliente.modelo.Paciente;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class VistaCliente extends JFrame {

	private JPanel contenedorPrincipal;
	private Choice desplegablePacientes = new Choice();
	private Choice desplegableKM = new Choice();
	private Choice desplegableEHR = new Choice();
	private Choice desplegableAnalitica = new Choice();
	private Choice desplegableMicro = new Choice();
	private Choice desplegableTratamiento = new Choice();
	private Choice desplegableVentilacion = new Choice();

	private TextArea textoEntrada;
	private TextArea textoSalida;
	private JTextField textFieldId;
	private JTextField textFieldEdad;
	private JTextField textFieldSexo;
	private JTextField textFieldTemperatura;
	private JTextField textFieldLeucocitos;

	/**
	 * Create the frame.
	 */
	public VistaCliente() {
		setTitle("TFG Tony Wang - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setLocationRelativeTo(null);

		JMenuBar menuBarra = new JMenuBar();
		setJMenuBar(menuBarra);

		JMenu menuBarraArchivo = new JMenu("Archivo");
		menuBarra.add(menuBarraArchivo);

		JMenu menuBarraEditar = new JMenu("Editar");
		menuBarra.add(menuBarraEditar);

		JMenu menuBarraAyuda = new JMenu("Ayuda");
		menuBarra.add(menuBarraAyuda);

		JMenuItem subMenuAyudaAcercaDe = new JMenuItem("Acerca de");
		subMenuAyudaAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorCliente.getUnicainstancia().mostrarAcercaDe();
			}
		});
		menuBarraAyuda.add(subMenuAyudaAcercaDe);

		JSeparator separadorAyuda = new JSeparator();
		menuBarraAyuda.add(separadorAyuda);

		JMenuItem subMenuAyudaSalir = new JMenuItem("Salir");
		subMenuAyudaSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorCliente.getUnicainstancia().terminar();
			}
		});

		menuBarraAyuda.add(subMenuAyudaSalir);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		contenedorPrincipal.setLayout(new BorderLayout(0, 0));

		JPanel panelNortePrincipal = new JPanel();
		panelNortePrincipal.setBorder(new TitledBorder(null, "",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contenedorPrincipal.add(panelNortePrincipal, BorderLayout.NORTH);
		panelNortePrincipal.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel etiquetaSeleccionPaciente = new JLabel("Seleccionar Paciente");
		etiquetaSeleccionPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(etiquetaSeleccionPaciente);
		desplegablePacientes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// cada vez que se cambia de paciente hay que comunicarlo a la
				// base de datos para que cambie los diagnosticos
				ControladorBaseDatos.getUnicainstancia().listarEHR(
						desplegablePacientes.getSelectedItem(), desplegableEHR);
				ControladorBaseDatos.getUnicainstancia().listarAnalitica(
						desplegablePacientes.getSelectedItem(),
						desplegableAnalitica);
				ControladorBaseDatos.getUnicainstancia().listarMicro(
						desplegablePacientes.getSelectedItem(),
						desplegableMicro);
				ControladorBaseDatos.getUnicainstancia().listarTratamiento(
						desplegablePacientes.getSelectedItem(),
						desplegableTratamiento);
				ControladorBaseDatos.getUnicainstancia().listarVentilacion(
						desplegablePacientes.getSelectedItem(),
						desplegableVentilacion);
			}
		});

		panelNortePrincipal.add(desplegablePacientes);

		// muestra los usuarios que hay en la base de pacientes
		ControladorBaseDatos.getUnicainstancia().listarPacientes(
				desplegablePacientes);

		JLabel lblSeleccionarHistorialClnico = new JLabel(
				"Seleccionar Datos Cl\u00EDnicos");
		lblSeleccionarHistorialClnico
				.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(lblSeleccionarHistorialClnico);

		panelNortePrincipal.add(desplegableEHR);
		// listados iniciales del paciente por defecto
		ControladorBaseDatos.getUnicainstancia().listarEHR(
				desplegablePacientes.getSelectedItem(), desplegableEHR);
		ControladorBaseDatos.getUnicainstancia().listarAnalitica(
				desplegablePacientes.getSelectedItem(), desplegableAnalitica);
		ControladorBaseDatos.getUnicainstancia().listarMicro(
				desplegablePacientes.getSelectedItem(), desplegableMicro);
		ControladorBaseDatos.getUnicainstancia().listarTratamiento(
				desplegablePacientes.getSelectedItem(), desplegableTratamiento);

		JLabel labelAnalitica = new JLabel("Seleccionar Datos Anal\u00EDtica");
		labelAnalitica.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(labelAnalitica);

		panelNortePrincipal.add(desplegableAnalitica);

		JLabel labelMicrobiologia = new JLabel(
				"Seleccionar Datos Microbiolog\u00EDa");
		labelMicrobiologia.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(labelMicrobiologia);

		panelNortePrincipal.add(desplegableMicro);

		JLabel labelVentilacion = new JLabel(
				"Seleccionar Datos Ventilaci\u00F3n");
		labelVentilacion.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(labelVentilacion);
		ControladorBaseDatos.getUnicainstancia().listarVentilacion(
				desplegablePacientes.getSelectedItem(), desplegableVentilacion);

		panelNortePrincipal.add(desplegableVentilacion);

		JLabel labelTratamientos = new JLabel("Seleccionar Datos Tratamiento");
		labelTratamientos.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(labelTratamientos);

		panelNortePrincipal.add(desplegableTratamiento);

		JLabel etiquetaSeleccionKM = new JLabel(
				"Seleccionar Base de Conocimiento");
		etiquetaSeleccionKM.setHorizontalAlignment(SwingConstants.CENTER);
		panelNortePrincipal.add(etiquetaSeleccionKM);

		panelNortePrincipal.add(desplegableKM);
		// muestra las bases de conocimiento
		ControladorCliente.getUnicainstancia().listarBasesConocimiento(
				desplegableKM);

		JPanel panelBotones = new JPanel();
		contenedorPrincipal.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton botonDatosPaciente = new JButton("Obtener Datos de Paciente");
		botonDatosPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (desplegablePacientes.getSelectedItem() != "") {

					// la vista a lo mejor no deberia de tener informacion
					// del
					// modelo Paciente
					// pero por simplificar se hace asi (para poder mostrar los
					// datos en la vista
					Paciente paciente = ControladorBaseDatos
							.getUnicainstancia().obtenerPaciente(
									Integer.parseInt(desplegablePacientes
											.getSelectedItem()),
									getId(desplegableEHR.getSelectedItem()),
									getId(desplegableAnalitica
											.getSelectedItem()),
									getId(desplegableMicro.getSelectedItem()),
									getId(desplegableVentilacion
											.getSelectedItem()),
									getId(desplegableTratamiento
											.getSelectedItem()));
					ControladorCliente.getUnicainstancia().generarXML(paciente);

					ControladorCliente.getUnicainstancia().mostrarEntrada(
							textoEntrada,
							desplegablePacientes.getSelectedItem());
					// mostrar en pantalla los datos
					if (paciente.tieneIdentificador())
						textFieldId.setText(paciente.getIdentificador());
					else
						textFieldId.setText("N/D");
					if (paciente.tieneEdad())
						textFieldEdad.setText(String.valueOf(paciente.getEdad()));
					else
						textFieldEdad.setText("N/D");
					if (paciente.tieneLeucocitos())
						textFieldLeucocitos.setText(String.valueOf(paciente
								.getLeucocitos()));
					else
						textFieldLeucocitos.setText("N/D");
					if (paciente.tieneSexo())
						textFieldSexo.setText(String.valueOf(paciente.getSexo()));
					else
						textFieldSexo.setText("N/D");
					if (paciente.tieneTemperatura())
						textFieldTemperatura.setText(String.valueOf(paciente
								.getTemperatura()));
					else
						textFieldTemperatura.setText("N/D");
				} else {
					JOptionPane.showMessageDialog(null,
							"No hay paciente seleccionado", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panelBotones.add(botonDatosPaciente);

		JButton botonEnviarXML = new JButton("Enviar al CDSS");
		botonEnviarXML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textoEntrada.getText().isEmpty()) {
					ControladorCliente.getUnicainstancia().mostrarEntrada(
							textoEntrada,
							desplegablePacientes.getSelectedItem());
				}
				// Esto es para mostrar simplemente la ventana de espera
				final JDialog loading = new JDialog(VistaCliente.this);
				JPanel p1 = new JPanel(new BorderLayout());

				JLabel textoEspera = new JLabel(
						"Procesando la solicitud, espera por favor...");
				textoEspera.setFont(new Font("Tahoma", Font.PLAIN, 28));
				p1.add(textoEspera, BorderLayout.CENTER);
				loading.setUndecorated(true);
				loading.getContentPane().add(p1);
				loading.pack();
				loading.setLocationRelativeTo(VistaCliente.this);
				loading.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
				loading.setModal(true);

				SwingWorker<String, Void> worker = new SwingWorker<String, Void>() {
					@Override
					protected String doInBackground()
							throws InterruptedException {
						textoSalida.setText(ControladorCliente
								.getUnicainstancia().enviarXML(
										desplegablePacientes.getSelectedItem(),
										desplegableKM.getSelectedItem()));
						return "";
					}

					@Override
					protected void done() {
						loading.dispose();
					}
				};
				worker.execute();
				loading.setVisible(true);
				try {
					worker.get();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panelBotones.add(botonEnviarXML);

		JPanel panelInformacion = new JPanel();
		contenedorPrincipal.add(panelInformacion, BorderLayout.CENTER);
		panelInformacion.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panelDatosInterior = new JPanel();
		panelInformacion.add(panelDatosInterior);
		panelDatosInterior.setLayout(new BorderLayout(0, 0));

		JLabel lblDatosDelPaciente = new JLabel("Datos del Paciente");
		lblDatosDelPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelDatosInterior.add(lblDatosDelPaciente, BorderLayout.NORTH);

		JPanel panelDatos = new JPanel();
		panelDatosInterior.add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new MigLayout("", "[158.00][::200px,grow]",
				"[25px:n][][][][][]"));

		JLabel lblId = new JLabel("Identificador");
		panelDatos.add(lblId, "cell 0 1,alignx center");

		textFieldId = new JTextField();
		textFieldId.setEditable(false);
		panelDatos.add(textFieldId, "cell 1 1,growx");
		textFieldId.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		panelDatos.add(lblEdad, "cell 0 2,alignx center");

		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		panelDatos.add(textFieldEdad, "cell 1 2,growx");
		textFieldEdad.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo");
		panelDatos.add(lblSexo, "cell 0 3,alignx center");

		textFieldSexo = new JTextField();
		textFieldSexo.setEditable(false);
		panelDatos.add(textFieldSexo, "cell 1 3,growx");
		textFieldSexo.setColumns(10);

		JLabel lblTemperatura = new JLabel("Temperatura (\u00BAC)");
		panelDatos.add(lblTemperatura, "cell 0 4,alignx center");

		textFieldTemperatura = new JTextField();
		textFieldTemperatura.setEditable(false);
		panelDatos.add(textFieldTemperatura, "cell 1 4,growx");
		textFieldTemperatura.setColumns(10);

		JLabel lblLeucocitos = new JLabel("Leucocitos");
		panelDatos.add(lblLeucocitos, "cell 0 5,alignx center");

		textFieldLeucocitos = new JTextField();
		textFieldLeucocitos.setEditable(false);
		panelDatos.add(textFieldLeucocitos, "cell 1 5,growx");
		textFieldLeucocitos.setColumns(10);

		JPanel panelEntradaInterior = new JPanel();
		panelInformacion.add(panelEntradaInterior);
		panelEntradaInterior.setLayout(new BorderLayout(0, 0));

		JLabel tituloEntrada = new JLabel("Paciente en vMR");
		tituloEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tituloEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		panelEntradaInterior.add(tituloEntrada, BorderLayout.NORTH);

		textoEntrada = new TextArea();
		textoEntrada.setEditable(false);
		panelEntradaInterior.add(textoEntrada, BorderLayout.CENTER);

		JPanel panelSalidaInterior = new JPanel();
		panelInformacion.add(panelSalidaInterior);
		panelSalidaInterior.setLayout(new BorderLayout(0, 0));

		JLabel tituloSalida = new JLabel("Respuesta del CDSS");
		tituloSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tituloSalida.setHorizontalAlignment(SwingConstants.CENTER);
		panelSalidaInterior.add(tituloSalida, BorderLayout.NORTH);

		textoSalida = new TextArea();
		textoSalida.setEditable(false);
		panelSalidaInterior.add(textoSalida, BorderLayout.CENTER);

	}

	/**
	 * Metodo que devuelve el identificador de los datos pedidos
	 * 
	 * @param tituloDatos
	 *            La cadena de titulo de los datos. Sera del tipo Fecha: fecha
	 *            Historial N�: id
	 * @return El valor id y -1 si no existe
	 */
	private int getId(String tituloDatos) {
		if (tituloDatos != "") {
			String[] partesTitulo = tituloDatos.split(" ");
			return Integer.parseInt(partesTitulo[partesTitulo.length - 1]);
		}
		return -1;
	}
}

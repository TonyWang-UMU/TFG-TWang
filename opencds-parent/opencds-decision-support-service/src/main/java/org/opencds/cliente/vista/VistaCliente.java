package org.opencds.cliente.vista;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.*;

import org.opencds.cliente.controlador.ControladorBaseDatos;
import org.opencds.cliente.controlador.ControladorCliente;
import org.opencds.cliente.modelo.Booleano;
import org.opencds.cliente.modelo.Paciente;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class VistaCliente extends JFrame {

	private JPanel contenedorPrincipal;
	private Choice desplegablePacientes = new Choice();
	private Choice desplegableEHR = new Choice();

	private TextArea textoEntrada;
	private TextArea textoSalida;
	private JTextField textFieldId;
	private JTextField textFieldEdad;
	private JTextField textFieldSexo;
	private JTextField textFieldTemperatura;
	private JTextField textFieldLeucocitos;
	private JTextField textFieldSecrecionTraqueal;
	private JTextField textFieldXRayos;
	private JTextField textFieldEvolucionX;
	private JTextField textFieldARDS;
	private JTextField textFieldOxygenation;
	private JTextField textFieldETCulture;
	private JTextField textFieldSameBacteria;
	private List listaKMSeleccionadas;
	private List listaKM;

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
		panelNortePrincipal.setLayout(new GridLayout(1, 1, 0, 0));

		JPanel panelDatosClinicos = new JPanel();
		panelDatosClinicos.setBorder(new BevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		panelNortePrincipal.add(panelDatosClinicos);
		panelDatosClinicos.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etiquetaSeleccionPaciente = new JLabel("Seleccionar Paciente");
		panelDatosClinicos.add(etiquetaSeleccionPaciente);
		etiquetaSeleccionPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosClinicos.add(desplegablePacientes);
		desplegablePacientes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// cada vez que se cambia de paciente hay que comunicarlo a la
				// base de datos para que cambie los diagnosticos
				ControladorBaseDatos.getUnicainstancia().listarEHR(
						desplegablePacientes.getSelectedItem(), desplegableEHR);

			}
		});

		// muestra los usuarios que hay en la base de pacientes
		ControladorBaseDatos.getUnicainstancia().listarPacientes(
				desplegablePacientes);

		JLabel lblSeleccionarHistorialClnico = new JLabel(
				"Seleccionar Datos Cl\u00EDnicos");
		panelDatosClinicos.add(lblSeleccionarHistorialClnico);
		lblSeleccionarHistorialClnico
				.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosClinicos.add(desplegableEHR);
		// listados iniciales del paciente por defecto
		ControladorBaseDatos.getUnicainstancia().listarEHR(
				desplegablePacientes.getSelectedItem(), desplegableEHR);

		JPanel panelKMs = new JPanel();
		panelKMs.setBorder(new EmptyBorder(0, 10, 10, 10));
		panelNortePrincipal.add(panelKMs);
		panelKMs.setLayout(new BorderLayout(0, 0));

		JLabel etiquetaSeleccionKM = new JLabel("Bases de Conocimiento");
		panelKMs.add(etiquetaSeleccionKM, BorderLayout.NORTH);
		etiquetaSeleccionKM.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panelCentralKM = new JPanel();
		panelKMs.add(panelCentralKM, BorderLayout.SOUTH);
		panelCentralKM.setLayout(new GridLayout(0, 3, 0, 0));

		Panel panelListadoKM = new Panel();
		panelCentralKM.add(panelListadoKM);
		panelListadoKM.setLayout(new BorderLayout(0, 0));

		JLabel lblKMDispo = new JLabel(" Bases Disponibles");
		lblKMDispo.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
		lblKMDispo.setHorizontalAlignment(SwingConstants.CENTER);
		panelListadoKM.add(lblKMDispo, BorderLayout.NORTH);

		listaKM = new List();
		panelListadoKM.add(listaKM);

		ControladorCliente.getUnicainstancia().listarBasesConocimiento(listaKM);

		JPanel panelBotonesKM = new JPanel();
		panelBotonesKM.setBorder(new EmptyBorder(30, 0, 0, 0));
		panelCentralKM.add(panelBotonesKM);
		panelBotonesKM.setLayout(new BorderLayout(0, 0));

		JPanel panelBotonesCentro = new JPanel();
		panelBotonesKM.add(panelBotonesCentro, BorderLayout.NORTH);

		JButton btnIzda = new JButton("<<");
		btnIzda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// comprobar que hay algo seleccionado en la lista izquierda y
				// ponerlo en la derecha
				if (listaKMSeleccionadas.getSelectedIndex() != -1) {
					listaKM.add(listaKMSeleccionadas.getSelectedItem());
					listaKMSeleccionadas.remove(listaKMSeleccionadas
							.getSelectedIndex());
				}
			}

		});
		panelBotonesCentro.add(btnIzda);

		JButton btnDcha = new JButton(">>");
		btnDcha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// comprobar que hay algo seleccionado en la lista derecha y
				// ponerlo en la izquierda
				if (listaKM.getSelectedIndex() != -1) {
					listaKMSeleccionadas.add(listaKM.getSelectedItem());
					listaKM.remove(listaKM.getSelectedIndex());
				}

			}
		});
		panelBotonesCentro.add(btnDcha);

		JPanel panelKMAUsar = new JPanel();
		panelCentralKM.add(panelKMAUsar);
		panelKMAUsar.setLayout(new BorderLayout(0, 0));

		JLabel lblKMUsados = new JLabel("Bases a utilizar");
		lblKMUsados.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
		lblKMUsados.setHorizontalAlignment(SwingConstants.CENTER);
		panelKMAUsar.add(lblKMUsados, BorderLayout.NORTH);

		listaKMSeleccionadas = new List();
		panelKMAUsar.add(listaKMSeleccionadas);

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
									getId(desplegableEHR.getSelectedItem()));
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
					if (paciente.tieneSecTraq())
						textFieldSecrecionTraqueal.setText(paciente
								.getSecrecion_traqueal());
					else
						textFieldSecrecionTraqueal.setText("N/D");

					if (paciente.tieneXRayosPecho())
						textFieldXRayos.setText(paciente.getRayos_x_pecho());
					else
						textFieldXRayos.setText("N/D");

					if (paciente.tieneOxigenacion())
						textFieldOxygenation.setText(String.valueOf(paciente
								.getOxigenacion()));
					else
						textFieldOxygenation.setText("N/D");

					if (paciente.tieneEvolucionXRayos())
						textFieldEvolucionX.setText("si");
					else {
						if (paciente.getProgresion_infiltracion_rayos_x_pecho() == Booleano.FALSE)
							textFieldEvolucionX.setText("no");
						else {
							textFieldEvolucionX.setText("N/D");
						}
					}
					if (paciente.tieneARDS())
						textFieldARDS.setText("si");
					else {
						if (paciente.getARDS() == Booleano.FALSE)
							textFieldARDS.setText("no");
						else {
							textFieldARDS.setText("N/D");
						}
					}

					if (paciente.tieneEtCultivo())
						textFieldETCulture.setText("si");
					else {
						if (paciente.getEtCultivo() == Booleano.FALSE)
							textFieldETCulture.setText("no");
						else {
							textFieldETCulture.setText("N/D");
						}
					}

					if (paciente.tieneSameBacteria()) {
						textFieldSameBacteria.setText("si");
					} else {
						if (paciente.getMisma_bacteria() == Booleano.FALSE)
							textFieldSameBacteria.setText("no");
						else
							textFieldSameBacteria.setText("N/D");
					}

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

				if (desplegablePacientes.getSelectedItem() != "") {
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
							LinkedList<String> listaKMString = ControladorCliente
									.getUnicainstancia()
									.obtenerBasesConocimiento(
											listaKMSeleccionadas);

							if (listaKMString.size() > 0) {
								// limpiar el texo
								textoSalida.setText("");
								ControladorCliente.getUnicainstancia()
										.enviarXML(
												desplegablePacientes
														.getSelectedItem(),
												listaKMString, textoSalida);
							} else {
								JOptionPane
										.showMessageDialog(
												null,
												"No se han seleccionado bases de conocimiento",
												"ERROR",
												JOptionPane.ERROR_MESSAGE);
							}
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
				} else {
					JOptionPane.showMessageDialog(null,
							"No hay paciente seleccionado", "ERROR",
							JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		panelBotones.add(botonEnviarXML);

		JPanel panelInformacion = new JPanel();
		panelInformacion.setBorder(new EmptyBorder(10, 10, 10, 10));
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
				"[25px:n][][][][][][][][][][][][]"));

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

		JLabel lblSeqTraq = new JLabel("Secreci\u00F3n Traqueal");
		panelDatos.add(lblSeqTraq, "cell 0 6,alignx center");

		textFieldSecrecionTraqueal = new JTextField();
		textFieldSecrecionTraqueal.setEditable(false);
		panelDatos.add(textFieldSecrecionTraqueal, "cell 1 6,growx");
		textFieldSecrecionTraqueal.setColumns(10);

		JLabel lblXRay = new JLabel("Rayos X en el Pecho");
		panelDatos.add(lblXRay, "cell 0 7,alignx center");

		textFieldXRayos = new JTextField();
		textFieldXRayos.setEditable(false);
		panelDatos.add(textFieldXRayos, "cell 1 7,growx");
		textFieldXRayos.setColumns(10);

		JLabel lblEvolucion = new JLabel("Evoluci\u00F3n en Infiltracion");
		panelDatos.add(lblEvolucion, "cell 0 8,alignx center");

		textFieldEvolucionX = new JTextField();
		textFieldEvolucionX.setEditable(false);
		panelDatos.add(textFieldEvolucionX, "cell 1 8,growx");
		textFieldEvolucionX.setColumns(10);

		JLabel lblARDS = new JLabel("ARDS");
		panelDatos.add(lblARDS, "cell 0 9,alignx center");

		textFieldARDS = new JTextField();
		textFieldARDS.setEditable(false);
		panelDatos.add(textFieldARDS, "cell 1 9,growx");
		textFieldARDS.setColumns(10);

		JLabel lblOxygenation = new JLabel("Oxigenaci\u00F3n");
		panelDatos.add(lblOxygenation, "cell 0 10,alignx center");

		textFieldOxygenation = new JTextField();
		textFieldOxygenation.setEditable(false);
		panelDatos.add(textFieldOxygenation, "cell 1 10,growx");
		textFieldOxygenation.setColumns(10);

		JLabel lblCrecimientoDeEt = new JLabel("Crecimiento de ET");
		panelDatos.add(lblCrecimientoDeEt, "cell 0 11,alignx center");

		textFieldETCulture = new JTextField();
		textFieldETCulture.setEditable(false);
		panelDatos.add(textFieldETCulture, "cell 1 11,growx");
		textFieldETCulture.setColumns(10);

		JLabel lblMismaBacteria = new JLabel("Misma Bacteria");
		panelDatos.add(lblMismaBacteria, "cell 0 12,alignx center");

		textFieldSameBacteria = new JTextField();
		textFieldSameBacteria.setEditable(false);
		panelDatos.add(textFieldSameBacteria, "cell 1 12,growx");
		textFieldSameBacteria.setColumns(10);

		JPanel panelEntradaInterior = new JPanel();
		panelInformacion.add(panelEntradaInterior);
		panelEntradaInterior.setLayout(new BorderLayout(0, 0));

		JLabel tituloEntrada = new JLabel("Paciente en vMR");
		tituloEntrada.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
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
		tituloSalida.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
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
	 *            Historial Nº: id
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

package org.opencds.cliente.vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import org.opencds.cliente.controlador.ControladorCliente;

public class VistaCliente extends JFrame {

	private JPanel contenedorPrincipal;
	private Choice desplegablePacientes = new Choice();
	private Choice desplegableKM = new Choice();
	TextArea textoEntrada;
	TextArea textoSalida;

	/**
	 * Create the frame.
	 */
	public VistaCliente() {
		setTitle("TFG Tony Wang - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
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
		panelNortePrincipal.add(desplegablePacientes);

		// muestra los usuarios que hay en la base de pacientes
		ControladorCliente.getUnicainstancia().listarPacientes(
				desplegablePacientes);

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

		JButton botonGenerarXML = new JButton("Generar XML");
		botonGenerarXML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorCliente.getUnicainstancia().generarXML(
						ControladorCliente.getUnicainstancia().obtenerPaciente(
								desplegablePacientes.getSelectedItem()));
				ControladorCliente.getUnicainstancia().mostrarEntrada(
						textoEntrada, desplegablePacientes.getSelectedItem());
			}
		});
		panelBotones.add(botonGenerarXML);

		JButton botonEnviarXML = new JButton("Enviar XML");
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
				p1.add(new JLabel(
						"Procesando la solicitud, espera por favor..."),
						BorderLayout.CENTER);
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
		panelInformacion.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panelEntradaInterior = new JPanel();
		panelInformacion.add(panelEntradaInterior);
		panelEntradaInterior.setLayout(new BorderLayout(0, 0));

		JLabel tituloEntrada = new JLabel("Entrada");
		tituloEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		panelEntradaInterior.add(tituloEntrada, BorderLayout.NORTH);

		textoEntrada = new TextArea();
		textoEntrada.setEditable(false);
		panelEntradaInterior.add(textoEntrada, BorderLayout.CENTER);

		JPanel panelSalidaInterior = new JPanel();
		panelInformacion.add(panelSalidaInterior);
		panelSalidaInterior.setLayout(new BorderLayout(0, 0));

		JLabel tituloSalida = new JLabel("Salida");
		tituloSalida.setHorizontalAlignment(SwingConstants.CENTER);
		panelSalidaInterior.add(tituloSalida, BorderLayout.NORTH);

		textoSalida = new TextArea();
		textoSalida.setEditable(false);
		panelSalidaInterior.add(textoSalida, BorderLayout.CENTER);

	}
}

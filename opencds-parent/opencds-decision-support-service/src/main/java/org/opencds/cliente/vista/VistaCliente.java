package org.opencds.cliente.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.opencds.cliente.controlador.ControladorCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Choice choice = new Choice();
	private Choice choice_1 = new Choice();

	/**
	 * Create the frame.
	 */
	public VistaCliente() {
		setTitle("TFG Tony Wang - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);

		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("Seleccionar Paciente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		panel.add(choice);

		JLabel lblNewLabel_1 = new JLabel("Seleccionar Base de Conocimiento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		panel.add(choice_1);

		ControladorCliente.getUnicainstancia()
				.listarBasesConocimiento(choice_1);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton = new JButton("Generar XML");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorCliente.getUnicainstancia().generarXML(
						ControladorCliente.getUnicainstancia().obtenerPaciente(
								choice.getSelectedItem()));
			}
		});
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Enviar XML");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorCliente.getUnicainstancia().enviarXML(
						choice.getSelectedItem());
			}
		});
		panel_1.add(btnNewButton_1);

		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}
}

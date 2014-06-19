package org.opencds.cliente.controlador;

import javax.swing.JFrame;

import org.opencds.cliente.vista.VistaCliente;

public class ControladorCliente {
	private static final ControladorCliente unicaInstancia = new ControladorCliente();
	private static VistaCliente ventanaPrincipal;

	public static void main(String[] args) {
		ventanaPrincipal = new VistaCliente();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setVisible(true);
	}

	public static ControladorCliente getUnicainstancia() {
		return unicaInstancia;
	}
}

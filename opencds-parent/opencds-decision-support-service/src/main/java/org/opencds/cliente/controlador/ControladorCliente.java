package org.opencds.cliente.controlador;

import java.awt.Choice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import org.opencds.cliente.modelo.Paciente;
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

	public Paciente obtenerPaciente(String identificador) {
		return new Paciente("pat001", 20, "años", "M", "2028-9", "Juan");
	}

	/**
	 * Genera un XML en formato vMR para poder enviarlo a través de la
	 * plataforma y obtener respuesta
	 * 
	 * @param paciente
	 *            Los datos del paciente para que el que se genera el XML
	 */

	public void generarXML(Paciente paciente) {
		// El directorio donde se guarda es fijo
		// Se crea un nuevo fichero de escritura
		PrintWriter writer;
		try {
			writer = new PrintWriter(
					"opencds-knowledge-repository-data/resources_v1.1/pacientes/"
							+ paciente.getIdentificador() + ".xml", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Envia el XML del paciente que este seleccionado como Paciente.
	 * Previamente se ha de haber generado el XML correspondiente o dará error
	 * 
	 * @param idPaciente
	 *            El identificador del paciente único
	 */
	public void enviarXML(String idPaciente) {

	}

	/**
	 * Metodo que obtiene de una ruta fija las bases de conocimiento y las lista
	 * para poder ser elegidas
	 * 
	 * @param objetoDesplegable
	 *            El objeto que contiene la lista de bases de conocimiento
	 */

	public void listarBasesConocimiento(Choice objetoDesplegable) {
		String directorioKM = "opencds-knowledge-repository-data/resources_v1.1/knowledgeModules";
		File directory = new File(directorioKM);

		// obtiene todos los ficheros de un directorio
		File[] fList = directory.listFiles();

		for (File file : fList) {
			if (file.isFile()) {
				objetoDesplegable.add(file.getName());
			}
		}
	}
}

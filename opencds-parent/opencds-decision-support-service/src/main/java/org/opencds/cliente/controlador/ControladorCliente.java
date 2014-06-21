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
			// cabeceras comunes
			writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			writer.println("<in:cdsInput xmlns:in=\"org.opencds.vmr.v1_0.schema.cdsinput\"");
			writer.println("\t\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
			writer.println("\t\txmlns:dt=\"org.opencds.vmr.v1_0.schema.datatypes\"");
			writer.println("\t\txsi:schemaLocation=\"org.opencds.vmr.v1_0.schema.cdsinput ..\\schema\\cdsInput.xsd\">");
			writer.println("\t<templateId root=\"2.16.840.1.113883.3.795.11.1.1\"/>");
			writer.println("\t<vmrInput>");
			writer.println("\t\t<templateId root=\"2.16.840.1.113883.3.795.11.1.1\"/>");
			writer.println("\t\t<patient>");

			// datos del paciente
			writer.println("\t\t\t<id root=\"2.16.840.1.113883.19.5\" extension=\""
					+ paciente.getIdentificador() + "\"/>");

			if (paciente.tieneDatos()) {
				writer.println("\t\t\t<demographics>");
				if (paciente.getNombre() != null) {

				}
				if (paciente.getUnidadEdad() != null) {
					if (paciente.getEdad() > 0.0) {

					}
				}

				if (paciente.getSexo() != null) {

				}

				if (paciente.getRaza() != null) {

				}

				writer.println("\t\t\t</demographics>");
			}

			// datos clinicos
			writer.println("\t\t\t<clinicalStatements>");

			writer.println("\t\t\t</clinicalStatements>");

			// final del documento, cerramos etiquetas
			writer.println("\t\t</patient>");
			writer.println("\t</vmrInput>");
			writer.println("</in:cdsInput>");

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

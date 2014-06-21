package org.opencds.cliente.controlador;

import java.awt.*;
import java.io.*;
import java.util.List;

import javax.swing.*;

import org.omg.dss.DSSRuntimeExceptionFault;
import org.omg.dss.EvaluationExceptionFault;
import org.omg.dss.InvalidDriDataFormatExceptionFault;
import org.omg.dss.InvalidTimeZoneOffsetExceptionFault;
import org.omg.dss.RequiredDataNotProvidedExceptionFault;
import org.omg.dss.UnrecognizedLanguageExceptionFault;
import org.omg.dss.UnrecognizedScopedEntityExceptionFault;
import org.omg.dss.UnsupportedLanguageExceptionFault;
import org.omg.dss.common.EntityIdentifier;
import org.omg.dss.common.InteractionIdentifier;
import org.omg.dss.common.ItemIdentifier;
import org.omg.dss.common.SemanticPayload;
import org.omg.dss.evaluation.Evaluate;
import org.omg.dss.evaluation.EvaluateResponse;
import org.omg.dss.evaluation.requestresponse.DataRequirementItemData;
import org.omg.dss.evaluation.requestresponse.EvaluationRequest;
import org.omg.dss.evaluation.requestresponse.FinalKMEvaluationResponse;
import org.omg.dss.evaluation.requestresponse.KMEvaluationRequest;
import org.opencds.cliente.modelo.Paciente;
import org.opencds.cliente.vista.VistaCliente;
import org.opencds.common.utilities.FileUtility;
import org.opencds.dss.evaluate.EvaluationImpl;
import org.opencds.knowledgeRepository.SimpleKnowledgeRepository;

public class ControladorCliente {
	private static final ControladorCliente unicaInstancia = new ControladorCliente();
	private static VistaCliente ventanaPrincipal;

	public static void main(String[] args) {
		ventanaPrincipal = new VistaCliente();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setVisible(true);
	}

	/**
	 * Metodo estatico que devuelve el controlador del DSS
	 * 
	 * @return El controlador del sistema
	 */
	public static ControladorCliente getUnicainstancia() {
		return unicaInstancia;
	}

	public Paciente obtenerPaciente(String identificador) {
		// TODO
		return new Paciente("pat001", 20, "anos", "M", "2028-9", "Juan");
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
			// añadir los datos que se dispongan
			if (paciente.tieneDatos()) {
				writer.println("\t\t\t<demographics>");
				if (paciente.getNombre() != null) {
					// TODO hay que arreglarlo y ponerlo bien respetando los
					// formatos ya que se permiten varios nombres y demás
					writer.println("\t\t\t\t<name use=\"ABC\">");
					writer.println("\t\t\t\t\t<part type=\"FAM\" value=\""
							+ paciente.getNombre() + "\"/>");
					writer.println("\t\t\t\t</name>");
				}
				if (paciente.getUnidadEdad() != null) {
					if (paciente.getEdad() > 0.0) {
						writer.println("\t\t\t\t<age value=\""
								+ paciente.getEdad() + "\" unit=\""
								+ paciente.getUnidadEdad() + "\"/>");
					} else {
						writer.println("\t\t\t\t<age unit=\""
								+ paciente.getUnidadEdad() + "\"/>");
					}
				}

				if (paciente.getSexo() != null) {
					// TODO El codesystem es asi?
					writer.println("\t\t\t\t<gender codeSystem=\"2.16.840.1.113883.5\" code=\""
							+ paciente.getSexo() + "\"/>");
				}

				if (paciente.getRaza() != null) {
					// TODO el codesystem es asi?
					writer.println("\t\t\t\t<race codeSystem=\"2.16.840.1.113883.5\" code=\""
							+ paciente.getRaza() + "\"/>");
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
	 * @param baseConocimiento
	 *            La base de conocimiento que se usa para el analisis
	 */
	public String enviarXML(String idPaciente, String baseConocimiento) {
		File paciente = new File(
				"opencds-knowledge-repository-data/resources_v1.1/pacientes/"
						+ idPaciente + ".xml");
		if (paciente.exists()) {
			try {
				// Inicializar los ficheros del sistema
				SimpleKnowledgeRepository
						.setFullPathToKRData("opencds-knowledge-repository-data/resources_v1.1");

				// Clase que contiene los parametros de la query
				Evaluate parameters = new Evaluate();

				// esta clase se crea y se le añade al evaluate para obtener
				// informacion de debug
				InteractionIdentifier ii = new InteractionIdentifier();
				ii.setInteractionId("testFromMain");
				ii.setScopingEntityId("scopingEntity");
				ii.setSubmissionTime(null);
				parameters.setInteractionId(ii);

				// Podemos añadir varias peticiones de una sola vez, para ello
				// se
				// crea el objeto ua vez
				// y se le van añadiendo los request
				EvaluationRequest er = new EvaluationRequest();

				// informacion para el debug
				er.setClientLanguage("Spanish");
				er.setClientTimeZoneOffset("GMT +1");

				// evaluacion 0
				er.getKmEvaluationRequest().add(new KMEvaluationRequest());
				er.getKmEvaluationRequest().get(0)
						.setKmId(new EntityIdentifier());

				// Esta parte es importante, es donde se le añade la base de
				// conocimiento que se va a usar

				// se obtiene del campo que hay para ello
				// el formado de una KM es entidad^nombre^version
				// por tanto hay que quitarle la extension .drl
				String[] splittedKM = obtenerBaseConocimientoDividida(baseConocimiento
						.substring(0, baseConocimiento.length() - 4));
				er.getKmEvaluationRequest().get(0).getKmId()
						.setBusinessId(splittedKM[1]);
				er.getKmEvaluationRequest().get(0).getKmId()
						.setScopingEntityId(splittedKM[0]);
				er.getKmEvaluationRequest().get(0).getKmId()
						.setVersion(splittedKM[2]);
				// indica el tipo de datos de paciente que usa
				// en este caso usamos el estandar vMR
				er.getDataRequirementItemData().add(
						new DataRequirementItemData());
				er.getDataRequirementItemData().get(0)
						.setDriId(new ItemIdentifier());
				er.getDataRequirementItemData().get(0).getDriId()
						.setItemId("testData");
				er.getDataRequirementItemData().get(0).getDriId()
						.setContainingEntityId(new EntityIdentifier());
				er.getDataRequirementItemData().get(0).getDriId()
						.getContainingEntityId()
						.setBusinessId("testDataStructure");
				er.getDataRequirementItemData().get(0).getDriId()
						.getContainingEntityId().setScopingEntityId("edu.utah");
				er.getDataRequirementItemData().get(0).getDriId()
						.getContainingEntityId().setVersion("1.0");
				er.getDataRequirementItemData().get(0)
						.setData(new SemanticPayload());
				er.getDataRequirementItemData().get(0).getData()
						.setInformationModelSSId(new EntityIdentifier());
				er.getDataRequirementItemData().get(0).getData()
						.getInformationModelSSId().setBusinessId("VMR");
				er.getDataRequirementItemData().get(0).getData()
						.getInformationModelSSId()
						.setScopingEntityId("org.opencds.vmr");
				er.getDataRequirementItemData().get(0).getData()
						.getInformationModelSSId().setVersion("1.0");
				parameters.setEvaluationRequest(er);

				// lectura de fichero de los datos del paciente
				String payloadString = null;

				payloadString = FileUtility.getInstance()
						.getFileContentsAsString(paciente);
				paciente = null;
				er.getDataRequirementItemData().get(0).getData()
						.getBase64EncodedPayload()
						.add(payloadString.getBytes());
				payloadString = null;

				String adapterClassPathName = "org.opencds.dss.evaluate.EvaluationImpl";
				Class<?> c;
				c = Class.forName(adapterClassPathName);
				adapterClassPathName = null;
				EvaluationImpl myEvaluationImpl = (EvaluationImpl) c
						.newInstance();
				EvaluateResponse evalResp = myEvaluationImpl
						.evaluate(parameters);

				// imprimimos la salida

				for (FinalKMEvaluationResponse kmer : evalResp
						.getEvaluationResponse().getFinalKMEvaluationResponse()) {
					// imprimos el fichero XML correspondiente a cada consulta
					List<byte[]> output = kmer.getKmEvaluationResultData()
							.get(0).getData().getBase64EncodedPayload();
					StringBuffer outputPayloadStringBuffer = new StringBuffer();
					for (byte[] byteList : output) {
						outputPayloadStringBuffer.append(new String(byteList,
								"UTF-8"));
					}
					String outputPayloadString = outputPayloadStringBuffer
							.toString();
					outputPayloadStringBuffer = null;
					output = null;
					return outputPayloadString.toString();

				}
				// limpiar memoria
				evalResp = null;
				myEvaluationImpl = null;
				c = null;

			} catch (DSSRuntimeExceptionFault e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvalidDriDataFormatExceptionFault e) {
				e.printStackTrace();
			} catch (UnrecognizedLanguageExceptionFault e) {
				e.printStackTrace();
			} catch (RequiredDataNotProvidedExceptionFault e) {
				e.printStackTrace();
			} catch (UnsupportedLanguageExceptionFault e) {
				e.printStackTrace();
			} catch (UnrecognizedScopedEntityExceptionFault e) {
				e.printStackTrace();
			} catch (EvaluationExceptionFault e) {
				e.printStackTrace();
			} catch (InvalidTimeZoneOffsetExceptionFault e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"No se ha generado archivo XML para el paciente "
							+ idPaciente, "Error en el envío del XML",
					JOptionPane.ERROR_MESSAGE);
		}

		return null;
	}

	private String[] obtenerBaseConocimientoDividida(String baseConocimiento) {
		return baseConocimiento.split("\\^");
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

	/**
	 * Metodo que muestra el contenido del archivo XML que se genera del
	 * paciente
	 * 
	 * @param idPaciente
	 *            La id del paciente del que se muestra el XML
	 * @param areaTexto
	 *            EL contenedor para mostrar el contenido
	 */
	public void mostrarEntrada(TextArea areaTexto, String idPaciente) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"opencds-knowledge-repository-data/resources_v1.1/pacientes/"
							+ idPaciente + ".xml"));
			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			String ls = System.getProperty("line.separator");

			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}

			areaTexto.setText(stringBuilder.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Hace la conexion con la base de datos, y obtiene la lista de pacientes
	 * que hay disponible
	 * 
	 * @param choice
	 */

	public void listarPacientes(Choice choice) {
		// TODO
		choice.add("pat001");
	}

	/**
	 * Termina la ejecucion del programa
	 */

	public void terminar() {
		ventanaPrincipal.setVisible(false);
		ventanaPrincipal.dispose();
	}

	/**
	 * Muestra la ventana de información del DSS
	 */

	public void mostrarAcercaDe() {
		JOptionPane
				.showMessageDialog(
						null,
						"Sistema de soporte a la decisión clínica en farmacovigilancia.\nPor Tony Wang",
						"Acerca de", JOptionPane.QUESTION_MESSAGE);

	}
}

package org.opencds.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

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
import org.opencds.common.utilities.FileUtility;
import org.opencds.dss.evaluate.EvaluationImpl;
import org.opencds.knowledgeRepository.SimpleKnowledgeRepository;

/**
 * Clase para la prueba de OpenCDS Consiste en un pequeño proyecto que prueba la
 * plataforma con un paciente sencillo y unas reglas sencillas Este ejemlo evita
 * el tener que usar una aplicacion web, y permite escoger manualmente el
 * fichero de paciente a evaluar asi como los modulos de conocimiento que se
 * quieran usar. Muestra el resultado XML por consola y no como salida de
 * fichero.
 * 
 * @author tony
 * 
 */

public class Main {
	public static void main(String[] args) {
		try {
			// Inicializar la base de conocimiento
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

			// Podemos añadir varias peticiones de una sola vez, para ello se
			// crea el objeto ua vez
			// y se le van añadiendo los request
			EvaluationRequest er = new EvaluationRequest();

			// er.setClientLanguage("");
			// er.setClientTimeZoneOffset("");

			// evaluacion 0
			er.getKmEvaluationRequest().add(new KMEvaluationRequest());
			er.getKmEvaluationRequest().get(0).setKmId(new EntityIdentifier());
			er.getKmEvaluationRequest().get(0).getKmId()
					.setBusinessId("AHRQ_PSI_02");
			er.getKmEvaluationRequest().get(0).getKmId()
					.setScopingEntityId("edu.utah");
			er.getKmEvaluationRequest().get(0).getKmId().setVersion("4.3.1");
			// evaluacion 1
			er.getKmEvaluationRequest().add(new KMEvaluationRequest());
			er.getKmEvaluationRequest().get(1).setKmId(new EntityIdentifier());
			er.getKmEvaluationRequest().get(1).getKmId()
					.setBusinessId("AHRQ_PSI_11");
			er.getKmEvaluationRequest().get(1).getKmId()
					.setScopingEntityId("edu.utah");
			er.getKmEvaluationRequest().get(1).getKmId().setVersion("4.3.1");
			// evaluacion 2
			er.getKmEvaluationRequest().add(new KMEvaluationRequest());
			er.getKmEvaluationRequest().get(2).setKmId(new EntityIdentifier());
			er.getKmEvaluationRequest().get(2).getKmId()
					.setBusinessId("AHRQ_PSI_12");
			er.getKmEvaluationRequest().get(2).getKmId()
					.setScopingEntityId("edu.utah");
			er.getKmEvaluationRequest().get(2).getKmId().setVersion("4.3.1");

			// indica el tipo de datos de paciente que usa
			// en este caso usamos el estandar vMR
			er.getDataRequirementItemData().add(new DataRequirementItemData());
			er.getDataRequirementItemData().get(0)
					.setDriId(new ItemIdentifier());
			er.getDataRequirementItemData().get(0).getDriId()
					.setItemId("testData");
			er.getDataRequirementItemData().get(0).getDriId()
					.setContainingEntityId(new EntityIdentifier());
			er.getDataRequirementItemData().get(0).getDriId()
					.getContainingEntityId().setBusinessId("testDataStructure");
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
			String filePath = null;
			filePath = "pacientes/ConstructedExampleNestedInputs.xml";
			try {
				payloadString = FileUtility.getInstance()
						.getFileContentsAsString(new File(filePath));
				filePath = null;
				er.getDataRequirementItemData().get(0).getData()
						.getBase64EncodedPayload()
						.add(payloadString.getBytes());
				// aqui podriamos imprimir el input que se recibe tal cual, en
				// string
				// System.out.println("input=" + payloadString);
				payloadString = null;
			} catch (DSSRuntimeExceptionFault e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			try {
				String adapterClassPathName = "org.opencds.dss.evaluate.EvaluationImpl";
				Class<?> c;
				c = Class.forName(adapterClassPathName);
				adapterClassPathName = null;
				EvaluationImpl myEvaluationImpl = (EvaluationImpl) c
						.newInstance();
				EvaluateResponse evalResp = myEvaluationImpl
						.evaluate(parameters);
				System.out.println("");

				// imprimimos la salida

				for (FinalKMEvaluationResponse kmer : evalResp
						.getEvaluationResponse().getFinalKMEvaluationResponse()) {
					/**
					 * print the kmid of the output. Uncomment the println()
					 * below to print just the kmid of each output
					 * 
					 */
					String kmid = kmer.getKmId().getBusinessId().toString();
					// imprimimos el kmid que se le asocio a cada consulta
					System.out.println("kmid=" + kmid);
					kmid = null;

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

					System.out.println("output="
							+ outputPayloadString.toString());

					outputPayloadString = null;
					outputPayloadStringBuffer = null;
					output = null;
				}

				// System.out.println("finished inner loop: " + i);

				// clear things we created
				evalResp = null;
				myEvaluationImpl = null;
				c = null;

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
		} catch (DSSRuntimeExceptionFault e) {
			e.printStackTrace();
		}

	}
}

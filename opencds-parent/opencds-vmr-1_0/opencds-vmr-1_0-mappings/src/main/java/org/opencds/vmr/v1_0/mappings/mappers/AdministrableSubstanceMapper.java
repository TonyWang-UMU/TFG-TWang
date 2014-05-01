/**
 * Copyright 2011 OpenCDS.org
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *	
 */

package org.opencds.vmr.v1_0.mappings.mappers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.opencds.common.exceptions.DataFormatException;
import org.opencds.common.exceptions.ImproperUsageException;
import org.opencds.common.exceptions.InvalidDataException;
import org.opencds.vmr.v1_0.internal.AdministrableSubstance;
import org.opencds.vmr.v1_0.mappings.in.FactLists;
import org.opencds.vmr.v1_0.mappings.out.structures.OrganizedResults;
import org.opencds.vmr.v1_0.mappings.utilities.MappingUtility;

/**
 * Mapper classes provide mapping in both directions between the external schema structure of the vMR
 * 		and the internal javabeans used by the rules.
 * 
 * @author Daryl Chertcoff
 *
 */
public class AdministrableSubstanceMapper extends EntityBaseMapper {
	
	private static Log logger = LogFactory.getLog(AdministrableSubstanceMapper.class); 

	public static AdministrableSubstance pullIn( 
			org.opencds.vmr.v1_0.schema.AdministrableSubstance source, 
			AdministrableSubstance				target,
			String								parentId, 
			org.opencds.vmr.v1_0.schema.CD		relationshipToParent,
			String								subjectPersonId,
			String								focalPersonId,
			FactLists							factLists
	) throws ImproperUsageException, DataFormatException, InvalidDataException {	
		
		String _METHODNAME = "pullIn(): ";		
		logger.trace(_METHODNAME + source.getClass().getSimpleName() + ", " + MappingUtility.iI2FlatId(source.getId()) + ", " + parentId);
		
		EntityBaseMapper.pullIn(source, target, parentId, relationshipToParent, subjectPersonId, focalPersonId, factLists);
		
		if ( source.getSubstanceCode() != null ) target.setSubstanceCode(MappingUtility.cD2CDInternal(source.getSubstanceCode()));
		if ( source.getStrength() != null ) target.setStrength(MappingUtility.rTO2RTOInternal(source.getStrength()));
		if ( source.getForm() != null ) target.setForm(MappingUtility.cD2CDInternal(source.getForm()));
		if ( source.getSubstanceBrandCode() != null ) target.setSubstanceBrandCode(MappingUtility.cD2CDInternal(source.getSubstanceBrandCode()));
		if ( source.getSubstanceGenericCode() != null ) target.setSubstanceGenericCode(MappingUtility.cD2CDInternal(source.getSubstanceGenericCode()));
		if ( source.getManufacturer() != null ) target.setManufacturer(MappingUtility.cD2CDInternal(source.getManufacturer()));
		if ( source.getLotNo() != null ) target.setLotNo(MappingUtility.sT2STInternal(source.getLotNo()));
		
		factLists.internalAdministrableSubstanceList.add(target);
		
		// pull in nested RelatedEntities
		if ( source.getRelatedEntity() != null ) {
			NestedObjectsMapper.pullInRelatedEntityNestedObjects(source, target.getId(), subjectPersonId, focalPersonId, factLists);
		}
		
		return target;
	}
	
		
	/**
	 * Populate external vMR object from corresponding internal vMR object
	 * 
	 * @param source
	 * @param target
	 * @param organizedResults
	 * @return target, fully populated including any nestedObjects
	 * @throws ImproperUsageException
	 * @throws DataFormatException
	 * @throws InvalidDataException
	 */
	public static org.opencds.vmr.v1_0.schema.AdministrableSubstance pushOut(
			AdministrableSubstance 								source, 
			org.opencds.vmr.v1_0.schema.AdministrableSubstance 	target, 
			OrganizedResults									organizedResults
		) throws ImproperUsageException, DataFormatException, InvalidDataException {
		
		String _METHODNAME = "pushOut(): ";
		
		if (source == null)
			return null;
		
		logger.trace(_METHODNAME + source.getClass().getSimpleName() + ", " + source.getId());		
		EntityBaseMapper.pushOut(source, target);
		
		if ( source.getSubstanceCode() != null ) target.setSubstanceCode(MappingUtility.cDInternal2CD(source.getSubstanceCode()));
		if ( source.getStrength() != null ) target.setStrength(MappingUtility.rTOInternal2RTO(source.getStrength()));
		if ( source.getForm() != null ) target.setForm(MappingUtility.cDInternal2CD(source.getForm()));
		if ( source.getSubstanceBrandCode() != null ) target.setSubstanceBrandCode(MappingUtility.cDInternal2CD(source.getSubstanceBrandCode()));
		if ( source.getSubstanceGenericCode() != null ) target.setSubstanceGenericCode(MappingUtility.cDInternal2CD(source.getSubstanceGenericCode()));
		if ( source.getManufacturer() != null ) target.setManufacturer(MappingUtility.cDInternal2CD(source.getManufacturer()));
		if ( source.getLotNo() != null ) target.setLotNo(MappingUtility.sTInternal2ST(source.getLotNo()));
		
		//look for nested related entities
		NestedObjectsMapper.pushOutRelatedEntityNestedObjects(source.getId(), target, organizedResults);
		
		return target;
		
	}
	
	
	/**
	 * Populate external vMR object from corresponding internal vMR object
	 * 
	 * @param source
	 * @param target
	 * @return target, fully populated including any nestedObjects
	 * @throws ImproperUsageException
	 * @throws DataFormatException
	 * @throws InvalidDataException
	 */
	public static org.opencds.vmr.v1_0.schema.AdministrableSubstance pushOut(
			AdministrableSubstance 								source, 
			org.opencds.vmr.v1_0.schema.AdministrableSubstance 	target
		) throws ImproperUsageException, DataFormatException, InvalidDataException {
		
		String _METHODNAME = "pushOut(): ";
		
		if (source == null)
			return null;
		
		logger.trace(_METHODNAME + source.getClass().getSimpleName() + ", " + source.getId());		
		EntityBaseMapper.pushOut(source, target);
		
		if ( source.getSubstanceCode() != null ) target.setSubstanceCode(MappingUtility.cDInternal2CD(source.getSubstanceCode()));
		if ( source.getStrength() != null ) target.setStrength(MappingUtility.rTOInternal2RTO(source.getStrength()));
		if ( source.getForm() != null ) target.setForm(MappingUtility.cDInternal2CD(source.getForm()));
		if ( source.getSubstanceBrandCode() != null ) target.setSubstanceBrandCode(MappingUtility.cDInternal2CD(source.getSubstanceBrandCode()));
		if ( source.getSubstanceGenericCode() != null ) target.setSubstanceGenericCode(MappingUtility.cDInternal2CD(source.getSubstanceGenericCode()));
		if ( source.getManufacturer() != null ) target.setManufacturer(MappingUtility.cDInternal2CD(source.getManufacturer()));
		if ( source.getLotNo() != null ) target.setLotNo(MappingUtility.sTInternal2ST(source.getLotNo()));
		
//		//look for nested related entities
//		NestedObjectsMapper.pushOutRelatedEntityNestedObjects(source.getId(), target, organizedResults);
		
		return target;
		
	}
}

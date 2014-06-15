<?xml version="1.0" encoding="UTF-8"?><?paramEnt_ent-2.16.840.1.113883.3.1829.11.1.1.1 publicid "null" systemid "file:/C:/OpenCDS/opencds-knowledge-repository-data/src/main/resources/templates/2.16.840.1.113883.3.1829.11.1.1.1.ent"?><?paramEnt_ent-2.16.840.1.113883.3.1829.11.1.2.1 publicid "null" systemid "file:/C:/OpenCDS/opencds-knowledge-repository-data/src/main/resources/templates/2.16.840.1.113883.3.1829.11.1.2.1.ent"?><schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3">
<lexev:comment xmlns:lexev="http://andrewjwelch.com/lexev/"> 
To use iso schematron instead of schematron 1.5, change the xmlns attribute from "http://www.ascc.net/xml/schematron" to "http://purl.oclc.org/dsdl/schematron"
</lexev:comment>

<title>Schematron schema for validating conformance to vMR templates</title>
<ns prefix="vmr" uri="urn:hl7-org:v3"/>

<phase id="errors">
    <active pattern="p-2.16.840.1.113883.3.1829.11.2.2.1-errors"/>
</phase>

<phase id="warning">
    <active pattern="p-2.16.840.1.113883.3.1829.11.2.2.1-warning"/>
</phase>

<phase id="manual">
    <active pattern="p-2.16.840.1.113883.3.1829.11.2.2.1-manual"/>
</phase>
    
    <lexev:comment xmlns:lexev="http://andrewjwelch.com/lexev/">  cdsInput v1.0 Templates Root: 2.16.840.1.113883.3.1829.11.1.1.1 </lexev:comment>
    <lexev:entity xmlns:lexev="http://andrewjwelch.com/lexev/" name="ent-2.16.840.1.113883.3.1829.11.1.1.1"><lexev:comment>  vMR v1.0 Templates Root: 2.16.840.1.113883.3.1829.11.1.1.1 </lexev:comment>

<lexev:comment> errors </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.1.1-errors" see="#p-2.16.840.1.113883.3.1829.11.1.1.1-errors">
	<title>vMR v1.0 cdsInput Templates Root - errors validation phase</title>
	<rule context="*[cdsInput:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.1.1&#34;]">
	<assert test="cdsInput:templateId[@root='2.16.840.1.113883.3.1829.11.1.1.1' and not(@extension)]">At least one cdsInput / templateId SHALL value cdsInput / templateId / @root with "2.16.840.1.113883.3.1829.11.1.1.1", and SHALL NOT contain cdsInput / templateId / @extension.</assert>
	<assert test="self::cdsInput:vmrInput">The root of a vMR cdsInput document must be vmrInput in the HL7 namespace</assert>
	</rule>
</pattern>

<lexev:comment> warning </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.1.1-warning" see="#p-2.16.840.1.113883.3.1829.11.1.1.1-warning">
	<title>vMR v1.0 cdsInput Templates Root - warning validation phase</title>
	<rule context="*[cdsInput:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.1.1&#34;]">
	<report test="."/>
	</rule>
</pattern>

<lexev:comment> manual </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.1.1-manual" see="#p-2.16.840.1.113883.3.1829.11.1.1.1-manual">
	<title>vMR v1.0 cdsInput Templates Root - manual validation phase</title>
	<rule context="*[cdsInput:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.1.1&#34;]">
	<report test="."/>
	</rule>
</pattern>

</lexev:entity>
    
    <lexev:comment xmlns:lexev="http://andrewjwelch.com/lexev/">  vMR v1.0 Templates Root: 2.16.840.1.113883.3.1829.11.1.2.1 </lexev:comment>
    <lexev:entity xmlns:lexev="http://andrewjwelch.com/lexev/" name="ent-2.16.840.1.113883.3.1829.11.1.2.1"><lexev:comment>  vMR v1.0 VMR Templates Root: 2.16.840.1.113883.3.1829.11.1.2.1 </lexev:comment>

<lexev:comment> errors </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.2.1-errors" see="#p-2.16.840.1.113883.3.1829.11.1.2.1-errors">
	<title>vMR v1.0 VMR  Templates Root - errors validation phase</title>
	<rule context="*[vmr:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.2.1&#34;]">
<lexev:comment>	&lt;assert test="self::vmr:ClinicalDocument"&gt;The root of a vMR document must be ClinicalDocument in the HL7 namespace&lt;/assert&gt;
	&lt;assert test="vmr:code[@code='34133-9'][@codeSystem='2.16.840.1.113883.6.1']"&gt;The ClinicalDocument/code element SHALL be present, and SHALL be valued with LOINC code 34133-9 (SUMMARIZATION OF EPISODE NOTE).&lt;/assert&gt;
	&lt;assert test="vmr:documentationOf/vmr:serviceEvent"&gt;A vMR SHALL contain exactly one ClinicalDocument / documentationOf / serviceEvent.&lt;/assert&gt;
	&lt;assert test="vmr:documentationOf/vmr:serviceEvent/@classCode='PCPR'"&gt;The value for "ClinicalDocument / documentationOf / serviceEvent / classCode" SHALL be "PCPR" "Care provision" 2.16.840.1.113883.5.6 ActClass STATIC.&lt;/assert&gt;
	&lt;assert test="vmr:documentationOf/vmr:serviceEvent/vmr:effectiveTime/vmr:low"&gt;ClinicalDocument / documentationOf / serviceEvent SHALL contain exactly one serviceEvent / effectiveTime / low and exactly one serviveEvent / effectiveTime / high.&lt;/assert&gt;
	&lt;assert test="vmr:documentationOf/vmr:serviceEvent/vmr:effectiveTime/vmr:high"&gt;ClinicalDocument / documentationOf / serviceEvent SHALL contain exactly one serviceEvent / effectiveTime / low and exactly one serviveEvent / effectiveTime / high.&lt;/assert&gt;
	&lt;assert test="count(vmr:languageCode)=1"&gt;vMR SHALL contain exactly one ClinicalDocument / languageCode.&lt;/assert&gt;
	&lt;assert test="count(vmr:templateId)&amp;gt;=1"&gt;vMR SHALL contain one or more ClinicalDocument / templateId.&lt;/assert&gt;
	&lt;assert test="vmr:templateId[@root='2.16.840.1.113883.10.20.1' and not(@extension)]"&gt;At least one ClinicalDocument / templateId SHALL value ClinicalDocument / templateId / @root with "2.16.840.1.113883.10.20.1", and SHALL NOT contain ClinicalDocument / templateId / @extension.&lt;/assert&gt;
	&lt;assert test="string-length(vmr:effectiveTime/@value) &amp;gt; 18"&gt;ClinicalDocument / effectiveTime SHALL be expressed with precision to include seconds.&lt;/assert&gt;
	&lt;assert test='contains(translate(vmr:effectiveTime/@value,"+-","ZZ"),"Z")'&gt;ClinicalDocument / effectiveTime SHALL include an explicit time zone offset.&lt;/assert&gt;
	&lt;assert test="count(vmr:recordTarget)&amp;lt;=2"&gt;vMR shall contain one to two ClinicalDocument / recordTarget.&lt;/assert&gt;
	&lt;assert test="vmr:author/vmr:assignedAuthor/vmr:assignedPerson | vmr:author/vmr:assignedAuthor/vmr:representedOrganization"&gt;vMR SHALL contain one or more ClinicalDocument / author / assignedAuthor / assignedPerson and/or ClinicalDocument / author / assignedAuthor / representedOrganization.&lt;/assert&gt;</lexev:comment>
	<assert test="count(.//vmrInput:templateId[@root=&#34;2.16.840.1.113883.3.1829.11.2.1.1&#34;]) &lt;= 1">vMR MAY contain exactly one and SHALL NOT contain more than one Demographic section (templateId 2.16.840.1.113883.3.1829.11.2.1.1).</assert>
<lexev:comment>	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.9"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Payers section (templateId 2.16.840.1.113883.10.20.1.9).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.1"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Advance directives section (templateId 2.16.840.1.113883.10.20.1.1).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.11"]) &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Problem section (templateId 2.16.840.1.113883.10.20.1.11). &lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.7"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Medical Equipment section (templateId 2.16.840.1.113883.10.20.1.7).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.6"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Immunizations section (templateId 2.16.840.1.113883.10.20.1.6).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.9"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Payers section (templateId 2.16.840.1.113883.10.20.1.9).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.1"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Advance directives section (templateId 2.16.840.1.113883.10.20.1.1).&lt;/assert&gt;
	&lt;assert test='count(.//vmr:templateId[@root="2.16.840.1.113883.10.20.1.5"])  &amp;lt;= 1'&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Functional status section (templateId 2.16.840.1.113883.10.20.1.5).&lt;/assert&gt;
	&lt;assert test="count(.//vmr:templateId[@root='2.16.840.1.113883.10.20.1.14']) &amp;lt;= 1"&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Results section (templateId 2.16.840.1.113883.10.20.1.14).&lt;/assert&gt;
	&lt;assert test="count(.//vmr:templateId[@root='2.16.840.1.113883.10.20.1.12']) &amp;lt;=1"&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Procedures section (templateId 2.16.840.1.113883.10.20.1.12). &lt;/assert&gt;
	&lt;assert test="count(.//vmr:templateId[@root='2.16.840.1.113883.10.20.1.3'])  &amp;lt;= 1"&gt;vMR SHOULD contain exactly one and SHALL NOT contain more than one Encounters section (templateId 2.16.840.1.113883.10.20.1.3). &lt;/assert&gt;</lexev:comment>
	</rule>
</pattern>

<lexev:comment> warning </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.2.1-warning" see="#p-2.16.840.1.113883.3.1829.11.1.2.1-warning">
	<title>vMR v1.0 VMR  Templates Root - warning validation phase</title>
	<rule context="*[vmr:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.2.1&#34;]">
	<report test="."/>
	</rule>
</pattern>

<lexev:comment> manual </lexev:comment>

<pattern id="p-2.16.840.1.113883.3.1829.11.1.2.1-manual" see="#p-2.16.840.1.113883.3.1829.11.1.2.1-manual">
	<title>vMR v1.0 VMR  Templates Root - manual validation phase</title>
	<rule context="*[vmr:templateId/@root=&#34;2.16.840.1.113883.3.1829.11.1.2.1&#34;]">
	<report test="."/>
	</rule>
</pattern>

</lexev:entity>
    
    
</schema>
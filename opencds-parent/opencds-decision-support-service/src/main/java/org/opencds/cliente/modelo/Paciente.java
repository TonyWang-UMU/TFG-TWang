package org.opencds.cliente.modelo;

/**
 * Esta clase Paciente es totalmente auxiliar. No representa datos en ningún
 * estándar. Simplemente se usa para poder encapsular todos los datos que se
 * obtienen de la base de datos, y poder luego mapearlas a sus correspondientes
 * objetos en el estándar vMR
 * 
 * @author tony
 * 
 */
public class Paciente {

	// demographics
	private String identificador;
	private double edad;
	private String unidadEdad;
	private String sexo;
	private String raza;
	private String nombre;

	// clinical statements
	// 1. observation results
	private double temperatura; // temperatura corporal en tiempo de diagnostico
	private int leucocitos; // numero de leucocitos del ultimo analisis
	private String secrecion_traqueal; // informacion sobre secrecion traqueal
	private String rayos_x_torax; // informacion sobre los rayos X en el pecho
	private Booleano progresion_infiltracion_rayos_x_torax; // progresion
															// de infiltraciones
															// de anteriores
															// rayos X
	private Booleano ARDS; // Síndrome de distrés respiratorio
							// agudo
	private int oxigenacion; // valor de la oxigenacion

	private Booleano misma_bacteria; // indica si tiene la misma
										// bacteria del
	// cultivo ET
	private Booleano etCultivo; // indica si ha habido un
								// crecimiento en el

	// cutivo ET

	// 2. encounter events
	// 3. substance administration events
	// 4. substance administration proposals
	// ... hay mas, hay que ver cuales se usan, como adverse event
	// TODO

	// constructor
	public Paciente() {
		this.progresion_infiltracion_rayos_x_torax = Booleano.NONE;
		this.ARDS = Booleano.NONE;
		this.misma_bacteria = Booleano.NONE;
		this.etCultivo = Booleano.NONE;
	}

	// metodos de comprobacion de atributos

	/**
	 * Metodo que comprueba si tiene indentificador
	 * 
	 * @return True si tiene identificador y false si no tiene
	 */
	public boolean tieneIdentificador() {
		return this.identificador != null;
	}

	/**
	 * Metodo que comprueba si esta la edad establecida
	 * 
	 * @return True si tiene el atributo edad, false si no
	 */
	public boolean tieneEdad() {
		return this.edad > 0;
	}

	/**
	 * Metodo que comprueba si tiene la unidad de edad establecida
	 * 
	 * @return True si tiene la unidad de edad y false si no
	 */
	public boolean tieneUnidadEdad() {
		return this.unidadEdad != null;
	}

	/**
	 * Metodo que comprueba si tiene el sexo establecido
	 * 
	 * @return True si tiene el sexo y false si no
	 */
	public boolean tieneSexo() {
		return this.sexo != null;
	}

	/**
	 * Metodo que comprueba si tiene la raza establecida
	 * 
	 * @return True si tiene la raza establecida y false si no
	 */
	public boolean tieneRaza() {
		return this.raza != null;
	}

	/**
	 * Metodo que comprueba si tiene el nombre establecido
	 * 
	 * @return True si tiene el nombre establecido y false sino
	 */
	public boolean tieneNombre() {
		return this.nombre != null;
	}

	/**
	 * Metodo que comprueba si tiene la temperatura como parametro
	 * 
	 * @return True si tiene la temperatura y false si no
	 */

	public boolean tieneTemperatura() {
		return this.temperatura > 0;
	}

	/**
	 * Metodo que comprueba si tiene los leucocitos establecidos como parametro
	 * 
	 * @return True si los tiene y false si no
	 */
	public boolean tieneLeucocitos() {
		return this.leucocitos > 0;
	}

	/**
	 * Metodo que comprueba si tiene secrecion traqueal establecida como
	 * parametro
	 * 
	 * @return True si lo tiene y false si no
	 */
	public boolean tieneSecTraq() {
		return this.secrecion_traqueal != null;
	}

	/**
	 * Metodo que comprueba si tiene informacion de rayos X de pecho
	 * 
	 * @return True si tiene y false si no
	 */

	public boolean tieneXRayosPecho() {
		return this.rayos_x_torax != null;
	}

	/**
	 * Metodo que comprueba si tiene evolucion de infiltracion en rayos X de
	 * pecho anteriores
	 * 
	 * @return True si tiene, false si no o si no se sabe
	 */
	public boolean tieneEvolucionXRayos() {
		return this.progresion_infiltracion_rayos_x_torax == Booleano.TRUE;
	}

	/**
	 * Metodo que comprueba si tiene ARDS
	 * 
	 * @return True si tiene, false si no o n/d
	 */
	public boolean tieneARDS() {
		return this.ARDS == Booleano.TRUE;
	}

	/**
	 * Metodo que comprueba si tiene la oxigenacion como valor
	 * 
	 * @return True si tiene, false sino
	 */
	public boolean tieneOxigenacion() {
		return this.oxigenacion > 0;
	}

	/**
	 * Metodo que comprueba si tiene misma bacteria a true
	 * 
	 * @return True si lo tiene, false en caso contrario
	 */
	public boolean tieneSameBacteria() {
		return this.misma_bacteria == Booleano.TRUE;
	}

	/**
	 * Metodo que comprueba si tiene misma et cultivo a true
	 * 
	 * @return True si lo tiene, false en caso contrario
	 */
	public boolean tieneEtCultivo() {
		return this.etCultivo == Booleano.TRUE;
	}

	/**
	 * Comprueba si tiene algun dato relleno, como no son obligatorios, con que
	 * tenga un dato ya devuelve true
	 * 
	 * @return true si tiene algun dato, false en caso contrario
	 */

	public boolean tieneDatos() {
		return this.tieneUnidadEdad() || this.tieneSexo() || this.tieneRaza()
				|| this.tieneNombre();
	}

	/**
	 * Comprueba si tiene algun observation result
	 * 
	 * @return False si no tiene, true si tiene
	 */
	public boolean tieneObservation() {
		return this.tieneTemperatura() || this.tieneLeucocitos()
				|| this.tieneSecTraq() || this.tieneXRayosPecho()
				|| this.tieneARDS() || this.ARDS == Booleano.FALSE
				|| this.progresion_infiltracion_rayos_x_torax == Booleano.FALSE
				|| this.tieneIdentificador() || this.tieneOxigenacion()
				|| this.tieneEtCultivo() || this.tieneSameBacteria()
				|| this.etCultivo == Booleano.FALSE
				|| this.misma_bacteria == Booleano.FALSE;
	}

	/**
	 * Comprueba si tiene algun encounter event
	 * 
	 * @return False si no tiene, true si tiene
	 */

	public boolean tieneEncounterEvents() {
		// TODO
		return false;
	}

	/**
	 * Comprueba si tiene algun substance administation event
	 * 
	 * @return True si tiene, false si no tiene
	 */
	public boolean tieneSubstanceAdministrationEvents() {
		// TODO
		return false;
	}

	/**
	 * Comprueba si tiene algun substance administration proposal
	 * 
	 * @return True si tiene, false si no tiene
	 */
	public boolean tieneSubstanceAdministrationProposals() {
		// TODO
		return false;
	}

	public String getIdentificador() {
		return identificador;
	}

	public double getEdad() {
		return edad;
	}

	public String getUnidadEdad() {
		return unidadEdad;
	}

	public String getSexo() {
		return sexo;
	}

	public String getRaza() {
		return raza;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setEdad(double edad) {
		this.edad = edad;
		this.unidadEdad = "Year";
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLeucocitos() {
		return leucocitos;
	}

	public void setLeucocitos(int leucocitos) {
		this.leucocitos = leucocitos;
	}

	public String getSecrecion_traqueal() {
		return secrecion_traqueal;
	}

	public void setSecrecion_traqueal(String secrecion_traqueal) {
		this.secrecion_traqueal = secrecion_traqueal;
	}

	public String getRayos_x_pecho() {
		return rayos_x_torax;
	}

	public void setRayos_x_pecho(String rayos_x_pecho) {
		this.rayos_x_torax = rayos_x_pecho;
	}

	public Booleano getProgresion_infiltracion_rayos_x_pecho() {
		return progresion_infiltracion_rayos_x_torax;
	}

	public void setProgresion_infiltracion_rayos_x_pecho(
			Booleano progresion_infiltracion_rayos_x_pecho) {
		this.progresion_infiltracion_rayos_x_torax = progresion_infiltracion_rayos_x_pecho;
	}

	public Booleano getARDS() {
		return ARDS;
	}

	public void setARDS(Booleano aRDS) {
		ARDS = aRDS;
	}

	public int getOxigenacion() {
		return oxigenacion;
	}

	public void setOxigenacion(int oxigenacion) {
		this.oxigenacion = oxigenacion;
	}

	public Booleano getMisma_bacteria() {
		return misma_bacteria;
	}

	public void setMisma_bacteria(Booleano misma_bacteria) {
		this.misma_bacteria = misma_bacteria;
	}

	public Booleano getEtCultivo() {
		return etCultivo;
	}

	public void setEtCultivo(Booleano etCultivo) {
		this.etCultivo = etCultivo;
	}

}

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

	private String identificador;
	private double edad;
	private String unidadEdad;
	private String sexo;
	private String raza;
	private String nombre;
	
	// atributos de la guia clinica
	private double temperatura;  // temperatura corporal en tiempo de diagnostico
	
	//TODO constructur de prueba
	public Paciente(double temperatura){
		this.temperatura=temperatura;
	}

	public Paciente(String identificador, double edad, String unidadEdad,
			String sexo, String raza, String nombre) {
		this.identificador = identificador;
		this.edad = edad;
		this.unidadEdad = unidadEdad;
		this.sexo = sexo;
		this.raza = raza;
		this.nombre = nombre;
	}

	/**
	 * Comprueba si tiene algun dato relleno, como no son obligatorios, con que
	 * tenga un dato ya devuelve true
	 * 
	 * @return true si tiene algun dato, false en caso contrario
	 */

	public boolean tieneDatos() {
		if (this.identificador != null || this.edad > 0
				|| this.unidadEdad != null || this.sexo != null
				|| this.raza != null || this.nombre != null)
			return true;
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
}

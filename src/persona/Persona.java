package persona;

public class Persona {

	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	
	
	
	/**
	 * constructor con los atributos del objeto
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	
	public Persona(String nombre, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	/**
	 * 
	 * @return the nombre
	 */
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * 
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * 
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
	
}

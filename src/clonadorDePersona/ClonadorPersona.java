package clonadorDePersona;

import java.util.ArrayList;
import java.util.List;

import factoryPersona.FactoryPersona;
import persona.Persona;


public class ClonadorPersona  {

	private String nombre;
	
	/**
	 * Constructor del clonadorPersona
	 * @param nombre
	 */

	public ClonadorPersona(String nombre) {
		this.nombre=nombre;
	}
	
	/**
	 * operacion para generar clones
	 * @return
	 */
	
	public List<Persona> generarClones(){
		
		List<Persona> personas = new ArrayList<Persona>();
		
		for (int i=0;i<=10;i++) {
			
			// creo una persona
			Persona p = FactoryPersona.getPersona(nombre);
			
			
			// Compruebo la persona
			boolean personaValida = ValidadorPersona.isValid(p);
			
			personas.add(0, p);
		}
		
		
		return personas;
	}

	
	public int getEdad() {
		return (int) (Math.random()*100);
	}
	
	public int getPeso() {
		return (int) (Math.random()*101);
	}
	public int getAltura() {
		return (int) (Math.random()*201);
	}
	
	


	

	
	
	
}

package clonadorDePersona;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Persona> p = new ArrayList<Persona>();
		
		for (int i=0;i<=10;i++) {
			p.add(new Persona("Pablo",getEdad(),getPeso(),getAltura()));
		}
		
		
		return p;
	}

	
	public int getEdad() {
		return (int) (Math.random()*25+1);
	}
	
	public int getPeso() {
		return (int) (Math.random()*80+1);
	}
	public int getAltura() {
		return (int) (Math.random()*80+1);
	}
	
	


	

	
	
	
}

package main;

import java.util.List;

import clonadorDePersona.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		
		ClonadorPersona cp = new ClonadorPersona("Pablo");
		List<Persona> personas = cp.generarClones();
		System.out.println(personas);
		

	}

}

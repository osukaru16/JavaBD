package org.appgrafica.main;

import org.appgrafica.modelo.Persona;
import org.appgrafica.modelo.PoolPersona;

public class PruebaPoolPersona {

	public static void main(String[] args) {
		Persona persona;
		String mike2 ="";
		String id="";
		//apellido;
		String nombre = "Kuromike";
		PoolPersona gente = new PoolPersona();
		persona = new Persona("id", "Mike","Tanpopo", 300, "gata", "castrada");
		gente.registrar(persona);
		
		persona = new Persona("idneko", "Kuro","Tanpopo", 300, "gata", "castrada");
		gente.registrar(persona);
		
		
		
		for(int i=0; i<10;i++){
			id = "m"+i;
			id = id.trim();
			nombre += "I";
			persona = new Persona(id, nombre,"Tanpopo", i, "gata", "castrada");
			gente.registrar(persona);
		}
		
		persona = gente.getPersona("m0");
		mike2 = persona.getNombre();
		
		System.out.println(mike2);

	}

}

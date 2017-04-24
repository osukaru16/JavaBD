package org.appgrafica.test;

import static org.junit.Assert.*;

import org.appgrafica.modelo.Persona;
import org.appgrafica.modelo.PoolPersona;
import org.junit.Test;

public class PoolPersonasTest {

	@Test
	public void testBuscaPersona() {
		Persona persona;
		//Persona mike2;
		PoolPersona gente = new PoolPersona();
		/*for(int i=0; i<10;i++){
			persona = new Persona("id"+i, "Mike"+i,"Tanpopo"+1, i, "gata", "castrada");
			gente.registrar(persona);
		}*/
		
		persona = new Persona("id", "Mike","Tanpopo", 300, "gata", "castrada");
		gente.registrar(persona);
		
		assertEquals("Mike", gente.getPersona("id").getNombre());
		 
	}
	
	
	
	@Test
	public void testBuscaPersonaV2() {
		Persona persona;
		//Persona mike2;
		PoolPersona gente = new PoolPersona();
		for(int i=1; i<11;i++){
			persona = new Persona("id"+i, "Mike"+i,"Tanpopo"+1, i, "gata", "castrada");
			gente.registrar(persona);
		}
		
		
		assertEquals("Mike2", gente.getPersona("id2").getNombre());
		
		assertEquals(10, gente.getLongitud());
				 
	}
	
	
	
	
	
	

}

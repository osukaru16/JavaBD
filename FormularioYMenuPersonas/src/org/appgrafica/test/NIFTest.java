package org.appgrafica.test;

import static org.junit.Assert.*;

import org.appgrafica.verificado.NIF;
import org.junit.Test;

public class NIFTest {

	@Test
	public void testDni() {
		NIF dni = new NIF("41503751K");
		
		assertEquals(true, dni.verificador());
		dni = new NIF("12345678Z");
		
		assertEquals(true, dni.verificador());
		
	}
	
	
	
	
	
	
	

	@Test
	public void testVerdura() {
		NIF dni = new NIF("esdc76yy8fgiyhfgbiigy");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("12345667888");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("12345678A");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("X12345678A");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("      ");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("12345678ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		assertEquals(false, dni.verificador());
		
		dni = new NIF("12345678Z XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		assertEquals(false, dni.verificador());
		
	}
	
	
	
	@Test
	public void testNie() {
		NIF nie = new NIF("Y2345678Z");
		
		assertEquals(true, nie.verificador());
		
		
	}
	
	
	@Test
	public void testNieFalso() {
		NIF nie = new NIF("Z2345678Z");
		
		assertEquals(false, nie.verificador());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package org.appgrafica.main;

import static org.junit.Assert.assertEquals;

import org.appgrafica.verificado.BuscaPatrones;
import org.appgrafica.verificado.Comprobador;
import org.appgrafica.verificado.NIF;


public class PruebaText {
	String dni = "41503751K";
	//String dni = "12345678K";

	public static void main(String[] args) {
		//String dni = "12345678K";
		String dni = "41503751K";
		//System.out.println(dni.substring(1, dni.length()));
		
		
		NIF dni2 = new NIF("41503751K");
		
		
		
		System.out.println(dni2.verificador());
		
		
		/*
		Character letas;
		
		for(int i=0; i<dni.length()-1; i++){
			letas = dni.charAt(i);
			//contador += Integer.parseInt(letas.toString());
			System.out.println(Integer.parseInt(letas.toString()));
			
		}
		*/
		
		if (dni.length()==9){
			System.out.println("OK");
		}else{
			System.out.println("NON");
		}
		
		
		PruebaText pt = new PruebaText();
		
		
		
		//System.out.println(pt.totalNif());
		
		
		dni2 = new NIF("12345678A");
		System.out.println(dni2.verificador());
		//assertEquals(false, dni.verificador());
		
		
		
		
		
		
		String dniLetras ="TRWAGMYFPDXBNJZSQVHLCKE";
		int contador =pt.totalNif();
		
		
		
	
		
		if(dniLetras.charAt(contador%23) == dni.charAt(dni.length()-1)){
			System.out.println("Hey");
		
		}
		
		
		/*
		
		
		System.out.println(contador%23);
		
		
		System.out.println(dniLetras.charAt(contador%23));
		
		
		
		
		
		
		
		
		
		System.out.println(dni.charAt(dni.length()-1));
		
		*/
		
		
		
		
		
		
		
		
		String nin = "12345678Z XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
		
		
		//System.out.println(nin.);
		
		
		
		nin="1";
		
		
		System.out.println(Comprobador.esSoloNumero(nin));
		
		nin="";
		System.out.println(Comprobador.estaVacio(nin,nin,nin,nin));
		
		
		
		
		
		

	}
	
	public PruebaText(){}
	
	public int totalNif(){
		return calcularNIF(dni, 0, 0);
	}
	
	

	/*
	
	private int calcularNIF(String numerosNif, int contador){
		Character letas;
		
		for(int i=0; i<numerosNif.length()-1; i++){
			letas = numerosNif.charAt(i);
			contador += Integer.parseInt(letas.toString());
			
		}
		
		
		return contador;
	}
	
	
	*/
	

	
	private int calcularNIF(String numerosNif, int contador,int posicion){
		String numeros;
		
		numeros = numerosNif.substring(posicion, numerosNif.length()-1);
		
		contador += Integer.parseInt(numeros);
		
		
		return contador;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private boolean compruebaNif(){
		String dniLetras ="TRWAGMYFPDXBNJZSQVHLCKE";
		int contador =0;
		
	
		
		if(dniLetras.charAt(contador%23) == this.nif.charAt(this.nif.length())){
		
		}

	}
	*/
	
	
	
	
	
	
	
	
	
	

}

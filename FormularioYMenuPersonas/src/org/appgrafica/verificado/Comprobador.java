package org.appgrafica.verificado;

public class Comprobador {
	//private int numero =0;
	//private String palabra ="";
	
	/*public Comprobador() {
	}*/
	
	public static boolean estaVacio(String palabra){
		if(palabra.isEmpty()){
			return true;
		}
		return false;
	}
	
	
	public static boolean estaVacio(String palabra1, String palabra2){
		return estaVacio(palabra1)||estaVacio(palabra2);
	}
	
	public static boolean estaVacio(String palabra1, String palabra2, String palabra3){
		return estaVacio(palabra1, palabra2)||estaVacio(palabra3);
	}
	
	public static boolean estaVacio(String palabra1, String palabra2, String palabra3, String palabra4){
		return estaVacio(palabra1, palabra2)||estaVacio(palabra3, palabra4);
	}
	
	
	
	public static boolean esSoloNumero(String palabra){
		String patron = "\\b\\d{3}\\b|\\b\\d{2}\\b|\\b\\d{1}\\b";
		BuscaPatrones comprobador = new BuscaPatrones(patron, palabra);
		if ((comprobador.getEncontrado())&&(palabra.length()<4)){
			return true;
		}
		return false;
	}
	
	public static boolean esValidoDNI(String dni){
		NIF nif = new NIF(dni);
		return nif.verificador();
	}
	

}

package org.appgrafica.verificado;



public class NIF {
	
	private String nif = "";
//	private String tipo ="";
	private int  valoLetraNie = 9;
	

	
	
	
	public NIF(String nif) {
		this.nif = nif;
		//compruevaTipo();
	}
	
	public String getNif(){
		return this.nif;
	}
	
	public boolean verificador(){
		if(compruebaLongitud()){
			return this.compruebaNif();
		}
		return false;
	}
	
	

	
	
	
	private boolean compruebaNif(){
		String patron = "\\b[XYZ]+\\d{7}+[A-Z&&[^IOUÑ]]\\b|\\b\\d{8}+[A-Z&&[^IOUÑ]]\\b";
		int contador =0;
		BuscaPatrones comprobador = new BuscaPatrones(patron, this.getNif());
		if((comprobador.getEncontrado())&&(this.esNie())){
			contador = this.calcularNIF(this.valoLetraNie+this.nif.substring(1, this.nif.length()));
			return comprobarLetra(contador);
		}
		else if(comprobador.getEncontrado()){
			contador = this.calcularNIF(this.nif.substring(0, this.nif.length()));
			return comprobarLetra(contador);
		}else{return false;}
	}
	
	
	
	private boolean comprobarLetra(int contador){
		String dniLetras ="TRWAGMYFPDXBNJZSQVHLCKE";
		if(dniLetras.charAt(contador%23) == this.nif.charAt(this.nif.length()-1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	private boolean compruebaLongitud(){
		if(this.getNif().length()==9){
			return true;
		}
		return false;
	}
	
	
	
	
	private int calcularNIF(String numerosNif){
		String numeros;
		int contador =0;
		numeros = numerosNif.substring(0, numerosNif.length()-1);
		
		contador += Integer.parseInt(numeros);
		
		
		return contador;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private boolean esNie(){
		String letras ="XYZ";
		for(int i=0; i<letras.length(); i++){
			if(this.getNif().charAt(0) == letras.charAt(i)){
				//this.tipo = "nie";
				this.valoLetraNie = i;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

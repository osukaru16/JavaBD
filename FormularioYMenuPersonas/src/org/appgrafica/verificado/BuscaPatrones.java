package org.appgrafica.verificado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaPatrones {
	
	private String patron="";
	private String texto="";

	
	
	public BuscaPatrones(String patron, String texto){
		this.patron = patron;
		this.texto = texto;
	}
	
	
	//Gets
	
	public String getTexto(){
		return this.texto;
	}
	
	public String getPatron(){
		return this.patron;
	}
	
	
	public boolean getEncontrado(){
		return this.comprovador();
	}
	
	public int getPrincipio(){
		return this.encontradoStart();
	}
	
	public int getFinal(){
		return this.encontradoEnd();
	}
	
	
	public String getValorEncontrado(){
		return this.cojerEncontrado();
	}
	
	public String getNuevoTexto(){
		return this.quitarEncontrado();
	}
	
	
	
	//Sets
	
	
	
	public void setTexto(String texto){
		this.texto = texto;
	}
	
	public void setPatron(String patron){
		this.patron = patron;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private int encontradoStart() {
		Matcher buqueda = this.coincidencia();
		if(buqueda.find()){
			return buqueda.start();
		}
		else{
			return 0;
		}
	}
	
	
	
	
	private int encontradoEnd() {
		Matcher buqueda = this.coincidencia();
		if(buqueda.find()){
			return buqueda.end();
		}
		else{return 0;}
		
	}
	
	
	
	
	private boolean comprovador() {
		return this.coincidencia().find();
	}
	
	
	
	private Pattern patron(){
		return Pattern.compile(this.patron);
	}
	
	
	private Matcher coincidencia(){
		return this.patron().matcher(this.texto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	private String cojerEncontrado(){
		String nuevoTexto = "";
		
		nuevoTexto = this.texto.substring(this.getPrincipio(), this.getFinal());
		
		return nuevoTexto;
		
	}
	
	
	private String quitarEncontrado(){
		String nuevoTexto = "";
		
		nuevoTexto = this.texto.replaceFirst(this.cojerEncontrado(), "");
		
		return nuevoTexto;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

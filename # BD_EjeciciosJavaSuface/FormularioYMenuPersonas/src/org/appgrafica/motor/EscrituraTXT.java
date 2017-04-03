package org.appgrafica.motor;

import java.io.*;
import java.util.ArrayList;

public class EscrituraTXT {
	private String texto = "";
	private String path = "";
	//private PrintWriter salida = null;
	private FileWriter fw = null;
    private BufferedWriter bw = null;
    private PrintWriter salida = null;
	private ArrayList <String> lista = null;
	
	
	
	
	public EscrituraTXT(){
		lista = new ArrayList<String>(); 
		lista.add("");
	}
	
	public EscrituraTXT(String path) {
		this.path = path;
		new EscrituraTXT();
	}
	
	public EscrituraTXT(String texto, String path) {
		this.texto = texto;
		this.path = path;
		new EscrituraTXT();
	}
	
	
	
	
	
	
	
	public void setPath(String path){
		this.path = path;
	}
	
	
	public void setTexto(String texto){
		this.texto = texto;
		this.listaAlmacenage();
		
	}
	
	
	
	public String getTexto(){
		return this.texto;
	}
	
	
	
	
	
	
	public boolean guardado(){
		return escribir(this.path);
	}
	
	
	
	
	
	
	private boolean escribir(String path){
		boolean haFuncionado = true;
		try {
			   // FileWriter fw = new FileWriter(path);
			   // BufferedWriter bw = new BufferedWriter(fw);
			   // salida = new PrintWriter(path);
			   // salida.println(texto);
			
				fw = new FileWriter(path);
				bw = new BufferedWriter(fw);
		    	salida = new PrintWriter(bw);
			
			
			
			
			
			
			
			
				for(String escritos : lista){
			
			    	salida.println(escritos);
			    	salida.println("");
				}
				salida.close();
			}
			catch(java.io.IOException ioex) {
			  System.out.println("se presento el error: "+ioex.toString());
			  haFuncionado = false;
			  return haFuncionado;
			}
		
		 return haFuncionado;
		
	}
	
	
	
	
	private void listaAlmacenage(){
		lista.add(this.getTexto());
	}
	
	
	
	
	
	
	

}

package org.appgrafica.modelo;

import java.util.ArrayList;

public class PoolPersona {
	
	private ArrayList <Persona> listaPersona = new ArrayList <Persona>();
	//private Persona persona;
	

	public PoolPersona() {
		//this.persona = persona;
	}

	public boolean registrar(Persona persona){
		return this.registrarPersona(persona);
	}
	
	public ArrayList <Persona> getPoolPesronas(){
		return this.listaPersona;
	}
	
	public int getLongitud(){
		return this.getPoolPesronas().size();
	}
	
	public Persona getPersona(String dni){
		return comprobarPersona(dni); 
	}
	
	private Persona comprobarPersona(String dni){
		for(Persona persona : this.getPoolPesronas()){
			if(persona.getID().equals(dni)){
				return persona;
			}
		}
		return null;
	}
	
	
	
	
	private boolean buscaID(String dni){
		if(comprobarPersona(dni) != null){
			return true;
		}
		return false;
	}
	
	
	private boolean registrarPersona(Persona persona){
		if(!this.buscaID(persona.getID())){
			listaPersona.add(persona);
			return true;
		}
		return false;
	}
	
	
	
	
}

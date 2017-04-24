package org.appgrafica.modelo;

public class Persona {
	private String id="";
	private String nombre="";
	private String apellidos="";
	private int edad = 0;
	private String sexo ="";
	private String estado="";
	
	public Persona(String id, String nombre, String apellidos,int edad, String sexo, String estado){
		this.id = id;
		this.nombre = nombre;
		this.apellidos= apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
	
		
	}
	
	//gets
	
	public String getID(){
		return this.id;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellidos(){
		return this.apellidos;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public String getEstado(){
		return this.estado;
	}
	
	//sets
	
	public void setID(String id){
		this.id = id;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	
	
	//enums
	/*
	
	public enum sexo{Home, Dona};
	
	public enum estado{Soltero, Casado, Viudo};
	*/
	


}

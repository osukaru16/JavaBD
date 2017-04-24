package org.appgrafica.motor;

import java.sql.*;

import javax.swing.JOptionPane;


public class BDConexion {
    private String bd="usuaris";
    private String login="root";
    private String password="";
    private String url="jdbc:mysql://localhost/"+bd;

	
	
	
	public BDConexion() {
		bd="usuaris";
		login="root";
	    password="";
	    url="jdbc:mysql://localhost/"+bd;
		
	}
	
	public BDConexion(String bd, String usuario, String url){
		this.bd = bd;
		this.login=usuario;
		this.password ="";
		this.url=url+bd;
	}
	
	public BDConexion(String bd, String usuario, String password, String url){
		this.bd = bd;
		this.login=usuario;
		this.password = password;
		this.url=url+bd;
	}
	
	


    public Connection conectar(){
        Connection link=null;    
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url,this.login,this.password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     return link;   
    }
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	

}

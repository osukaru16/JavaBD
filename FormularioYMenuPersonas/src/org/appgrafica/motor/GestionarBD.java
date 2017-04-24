package org.appgrafica.motor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GestionarBD {
	
/*
	public GestionarBD() {
		
	}*/
	
	
	
	
	public static void insetar(){
		BDConexion baseDatos = new BDConexion();
		String registro = "15015025M, Famu,Fan,Fan";

		//ConexionMySQL mysql = new ConexionMySQL();
		Connection cn = baseDatos.conectar();


        String vSQL = "INSERT INTO usuaris (nif, nom, llinatge1, llinatge2) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(vSQL);
            pst.setString(1, "12345678R");
            pst.setString(2, "Famu");
            pst.setString(3, "Fan");
            pst.setString(4, "Fan");

            int n = pst.executeUpdate();

            if (n > 0) {
                
                JOptionPane.showMessageDialog(null, "Inserció satisfactòria");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
	}

}

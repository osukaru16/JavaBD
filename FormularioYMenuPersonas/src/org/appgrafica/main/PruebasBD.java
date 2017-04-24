package org.appgrafica.main;

import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

import org.appgrafica.motor.BDConexion;

public class PruebasBD {

	public static void main(String[] args) {
		BDConexion baseDatos = new BDConexion();
		String registro = "15015025M, Famu,Fan,Fan";

		//ConexionMySQL mysql = new ConexionMySQL();
		Connection cn = baseDatos.conectar();


        String vSQL = "INSERT INTO usuaris (nif, nom, llinatge1, llinatge2) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(vSQL);
            pst.setString(1, "12345678R");
            pst.setString(2, "oscar");
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

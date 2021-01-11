
package com.istloja.conexionbd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BdEjercicio1 {
    private final String base = "persona";
    private final String user = "root";
    private final String password = "chateo282";
    private final String url = "jdbc:mysql://Localhost:3306/" + base;
    PreparedStatement ps;

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        } catch (SQLException ex) {
            
        }
        return con;
    }
    
   
    
    
}
        

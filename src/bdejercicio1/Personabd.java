
package com.istloja.controlador;
import com.istloja.modelo.Persona;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import com.istloja.conexionbd.BdEjercicio1;

/**
 *
 * @author IdeaPad - S340
 */
public class Personabd {
    
    public boolean registrarPersona(Persona persona){
    
        boolean registrar = false;
        
        Statement stm = null;
        
        Connection con = null;
        
       
                
         String sql = "INSERT INTO persona (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('"
                +String.valueOf(persona.getIdPersona())+"', '"
                +persona.getCedula()+"', '"
                +persona.getNombres()+"', '"
                +persona.getApellidos() +"', '"
                + persona.getDireccion()+"', '"
                + persona.getCorreo()+"', '"
                + persona.getTelefono()+"');";
         
        try {
            BdEjercicio1  conexion = new BdEjercicio1();
            con = conexion.getConexion();
            stm = (Statement) con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return registrar;
    
        
    }
    public boolean editarpersona(){
        boolean editar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
        String sql = "update persona set nombres = 'Carlos Andres' where idpersona = 1";
        try {
            BdEjercicio1  conexion = new BdEjercicio1();
            con = conexion.getConexion();
            stm = (Statement) con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
    
    return editar;
    }
    
    public boolean eliminarpersona(){
        boolean eliminar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
         String sql = "delete from persona where idpersona = 1";
        try {
            BdEjercicio1  conexion = new BdEjercicio1();
            con = conexion.getConexion();
            stm = (Statement) con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        
        
    
    return eliminar;
    }
}

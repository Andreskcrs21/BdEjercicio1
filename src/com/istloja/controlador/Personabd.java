
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
    public boolean editarpersona(Persona persona){
        boolean editar = false; // variable que retorna luego de realziar la accion
    
        Statement stm = null;  // interfaz de acceso a la base de datos
        
        Connection con = null; //coenxion con la base de datos
        
        String sql = "update persona set cedula = '"+persona.getCedula()+"', nombres = '"+persona.getNombres()+"', apellidos='"+persona.getApellidos()+"', direccion='"+persona.getDireccion()+"', correo='"+persona.getCorreo()+"', telefono= '"+persona.getTelefono()+"' where 'idpersona' = '"+String.valueOf(persona.getIdPersona())+"'"; // concatenando la opcion de actualizacion
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
    
    public boolean eliminarpersona(Persona persona){
        boolean eliminar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
         String sql = "delete from persona where 'idpersona' = '"+persona.getIdPersona()+"'";
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
    /*public List<Persona>obtenerPersonas(){
         
    
        Statement stm = null;
        
        Connection con = null;
        ResultSet rs = null;
        List<Persona> lista = null;
        
        return lista;
    
    }*/
}

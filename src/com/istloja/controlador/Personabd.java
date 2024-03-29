
package com.istloja.controlador;
import com.istloja.modelo.Persona;

import java.sql.SQLException;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.utilidad.Utilidades;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author IdeaPad - S340
 */
public class Personabd {
    public Utilidades utilidades;

    public Personabd() {
        utilidades = new Utilidades();
    }
    
    
    
    public boolean registrarPersona(Persona persona){
    
        boolean registrar = false;
        
        Statement stm = null;
        
        Connection con = null;
        String sql;
        if (persona.getFecha_nacimiento()==null) {
             sql = "INSERT INTO `persona`.`persona` (`idpersona`,`cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`, `Genero`,`Fecha_registro`) VALUES ('"
                +String.valueOf(persona.getIdPersona())+"','"+persona.getCedula()+"','"+persona.getNombres()+"','"+persona.getApellidos()+"','"
                +persona.getDireccion()+"','"+persona.getCorreo()+"','"+persona.getTelefono()+"','"+persona.getGenero()+"','"+utilidades.formatoFecha(persona.getFecha_registro())+"');";       
            
        }else{
             sql = "INSERT INTO `persona`.`persona` (`idpersona`,`cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`, `Genero`, `Fecha_nacimiento`,`Fecha_registro`) VALUES ('"
                +String.valueOf(persona.getIdPersona())+"','"+persona.getCedula()+"','"+persona.getNombres()+"','"+persona.getApellidos()+"','"
                +persona.getDireccion()+"','"+persona.getCorreo()+"','"+persona.getTelefono()+"','"+persona.getGenero()+"','"+utilidades.formatoFecha(persona.getFecha_nacimiento())+"', '"+utilidades.formatoFecha(persona.getFecha_registro())+"');";       
        }

       
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
        
        String sql = "update persona set cedula = '"+persona.getCedula()+"', nombres = '"+persona.getNombres()+"', apellidos='"+persona.getApellidos()+"', direccion='"+persona.getDireccion()+"', correo='"+persona.getCorreo()+"', telefono= '"+persona.getTelefono()+"' , genero = '"+persona.getGenero()+"' , Fecha_nacimiento = '"+utilidades.formatoFecha(persona.getFecha_nacimiento())+"' ,Fecha_actualizacion = '"+utilidades.formatoFecha(persona.getFecha_actializacion())+"' where (idpersona=" + persona.getIdPersona()+ ")"; // concatenando la opcion de actualizacion
        
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
    public Persona buscarpersona(String cedula){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona c = null;
        String sql = "SELECT * FROM persona.persona where cedula like "+cedula+";";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setGenero(rs.getString(8));
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return c;
           
    }
    public Persona buscartelefono(String telefono){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona t = null;
        String sql = "SELECT * FROM persona.persona where telefono like '"+telefono+";";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                t = new Persona();
                t.setIdPersona(rs.getInt(1));
                t.setCedula(rs.getString(2));
                t.setNombres(rs.getString(3));
                t.setApellidos(rs.getString(4));
                t.setDireccion(rs.getString(5));
                t.setCorreo(rs.getString(6));
                t.setTelefono(rs.getString(7));
                t.setGenero(rs.getString(8));
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return t; 
        
    }
    
    public Persona buscarapellido(String apellidos){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        
        String sql = "SELECT * FROM persona.persona where apellidos like '"+apellidos+"';";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return a; 
    
    
    }
    public boolean eliminarpersona(Persona persona){
        boolean eliminar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
         String sql = "delete from persona where idpersona = '"+persona.getIdPersona()+"'";
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
    public List<Persona> obtenerPersonas() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM persona.persona;";
        List<Persona> listaPersonas = new ArrayList<Persona>();
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setGenero(rs.getString(8));
                c.setFecha_nacimiento(rs.getDate(11));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaPersonas;
    }
    // Listas para rellenar la tabla
    public List<Persona> buscarcedula(String cedula){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        
        String sql = "SELECT * FROM persona.persona where cedula like \"%"+cedula+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                personasEncontradas.add(a);
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return  personasEncontradas; 
    
    
    }
    public List<Persona> buscarnombre(String nombre){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        
        String sql = "SELECT * FROM persona.persona where nombres like \"%"+nombre+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                personasEncontradas.add(a);
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return  personasEncontradas; 
    
    
    }
    public List<Persona> buscarapellidos(String apellidos){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM persona.persona where apellidos like \"%"+apellidos+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                personasEncontradas.add(a);
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return personasEncontradas; 
    
    
    }public List<Persona> buscartelefonos(String telefono){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM persona.persona where telefono like \"%"+telefono+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                personasEncontradas.add(a);
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return personasEncontradas; 
    
    
    }public List<Persona> buscarcorreo(String correo){
    Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        Persona a = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM persona.persona where correo like \"%"+correo+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = new Persona();
                a.setIdPersona(rs.getInt(1));
                a.setCedula(rs.getString(2));
                a.setNombres(rs.getString(3));
                a.setApellidos(rs.getString(4));
                a.setDireccion(rs.getString(5));
                a.setCorreo(rs.getString(6));
                a.setTelefono(rs.getString(7));
                a.setGenero(rs.getString(8));
                personasEncontradas.add(a);
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return personasEncontradas; 
    
    
    }
}

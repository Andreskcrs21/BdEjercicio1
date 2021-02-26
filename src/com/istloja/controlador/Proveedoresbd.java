/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IdeaPad - S340
 */
public class Proveedoresbd {
     public boolean registrarProveedor(Proveedores proveedor){
    
        boolean registrar = false;
        
        Statement stm = null;
        
        Connection con = null;
        
       
                 
        String sql = "INSERT INTO proveedores (`ruc`, `razonSocial`, `tipoActividad`, `nombreRepresentanteLegal`, `apellidoRepresentanteLegal`, `telefono`, `correo`) VALUES ('"
                +proveedor.getRuc()+"', '"
                +proveedor.getRazonSocial()+"', '"
                +proveedor.getTipoActividad()+"', '"
                +proveedor.getNombreRepresentante() +"', '"
                +proveedor.getApellidoRepresentante()+"', '"
                +proveedor.getTelefono()+"', '"
                +proveedor.getCorreo()+"');";
         
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
                
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return c;
           
    }
    public List<Proveedores> obtenerProveedores() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM proveedores;";
        List<Proveedores> listaProveedores = new ArrayList<Proveedores>();
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores p = new Proveedores();
                p.setIdProveedor(rs.getInt(1));
                p.setRuc(rs.getString(2));
                p.setRazonSocial(rs.getString(3));
                p.setTipoActividad(rs.getString(4));
                p.setNombreRepresentante(rs.getString(5));
                p.setApellidoRepresentante(rs.getString(6));
                p.setTelefono(rs.getString(7));
                p.setCorreo(rs.getString(8));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
    }
    
    
}

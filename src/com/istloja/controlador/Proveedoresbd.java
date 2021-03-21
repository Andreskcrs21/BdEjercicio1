/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.modelo.Proveedores;
import com.istloja.utilidad.Utilidades;
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
    public Utilidades utilidades;

    public Proveedoresbd() {
        utilidades = new Utilidades();
    }
     public boolean registrarProveedor(Proveedores proveedor){
    
        boolean registrar = false;        
        Statement stm = null;        
        Connection con = null;
        
        String sql = "INSERT INTO proveedores (`ruc`, `razonSocial`, `tipoActividad`, `nombreRepresentanteLegal`, `apellidoRepresentanteLegal`, `telefono`, `correo`, `direccion`, `fecha_vencimiento`, `fecha_registro`) VALUES ('"
                +proveedor.getRuc()+"', '"
                +proveedor.getRazonSocial()+"', '"
                +proveedor.getTipoActividad()+"', '"
                +proveedor.getNombreRepresentante() +"', '"
                +proveedor.getApellidoRepresentante()+"', '"
                +proveedor.getTelefono()+"', '"
                +proveedor.getCorreo()+"','"
                +proveedor.getDireccionpro()+ "','"
                +utilidades.formatoFecha(proveedor.getFecha_vencimientop())+"','"
                +utilidades.formatoFecha(proveedor.getFecha_registro())+"');";
         
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
                p.setDireccionpro(rs.getString(9));
                p.setFecha_vencimientop(rs.getDate(10));
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
    public boolean editarProveedor(Proveedores proveedores){
        boolean editar = false; // variable que retorna luego de realziar la accion
    
        Statement stm = null;  // interfaz de acceso a la base de datos
        
        Connection con = null; //coenxion con la base de datos
        
        String sql = "update proveedores set ruc = '"+proveedores.getRuc()+"', "
                + "razonSocial = '"+proveedores.getRazonSocial()+"', "
                + "tipoActividad='"+proveedores.getTipoActividad()+"', "
                + "nombreRepresentanteLegal='"+proveedores.getNombreRepresentante()+"', "
                + "apellidoRepresentanteLegal='"+proveedores.getApellidoRepresentante()+"', "
                + "telefono= '"+proveedores.getTelefono()+"', correo='"+proveedores.getCorreo()+"', "
                + "direccion ='"+proveedores.getDireccionpro()+"', "
                + "fecha_vencimiento = '"+utilidades.formatoFecha(proveedores.getFecha_vencimientop())+"', "
                + "fecha_actualizacion = '"+utilidades.formatoFecha(proveedores.getFecha_actualizacion())+"' where (idproveedores=" + proveedores.getIdProveedor()+ ")"; // concatenando la opcion de actualizacion
        
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
     public boolean eliminarProveedores(Proveedores proveedores){
        boolean eliminar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
         String sql = "delete from proveedores where idproveedores = '"+proveedores.getIdProveedor()+"'";
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
    // Metodos para buscar en el combobox
    
    public List<Proveedores> buscarRuc(String ruc){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where ruc like \"%"+ruc+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    public List<Proveedores> buscarRazon(String RazonSocial){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where razonSocial like \"%"+RazonSocial+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    public List<Proveedores> buscarActividad(String tipoActividad){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where tipoActividad like \"%"+tipoActividad+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    public List<Proveedores> buscarNombreRepresentante(String nombreRepresentante){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where nombreRepresentanteLegal like \"%"+nombreRepresentante+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    public List<Proveedores> buscarApellidoRepresentante(String apellidoRepresentante){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where apellidoRepresentanteLegal like \"%"+apellidoRepresentante+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    public List<Proveedores> buscarTelefono(String telefono){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where telefono like \"%"+telefono+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }public List<Proveedores> buscarCorreo(String correo){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Proveedores> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM persona.proveedores where correo like \"%"+correo+"%\"";
        
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
                p.setDireccionpro(rs.getString(9));
                listaProveedores.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
           
    }
    
    
}


package com.istloja.controlador;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import java.sql.*;
/**
 *
 * @author IdeaPad - S340
 */
public class Inventariobd {
    public Utilidades utilidades;

    public Inventariobd() {
        utilidades = new Utilidades();
    }
    public boolean registrarInventario(Inventario inventario){
    
        boolean registrar = false;        
        Statement stm = null;        
        Connection con = null;        
                        
        String sql = "INSERT INTO inventario (`codigo_pro`, `can_productos`, `descripcion`, `precio_compra_sin_iva`, `precio_compra_con_iva`,`precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`, `fecha_caducidad`, `fecha_registro`) VALUES ('"
                +inventario.getCoproducto()+"', '"
                +inventario.getCanproductos()+"', '"
                +inventario.getDescripcion()+"', '"
                +inventario.getPreciocompra_sin_iva()+"', '"
                +inventario.getPreciocompra_con_iva()+"','"
                +inventario.getPreciomayorista()+"','"
                +inventario.getPreciocliente_fijo()+"','"
                +inventario.getPreciocliente_normal()+"','"
                +utilidades.formatoFecha(inventario.getFecha_caducidad())+"','"
                +utilidades.formatoFecha(inventario.getFecha_registro())+"');";
                        
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
     public boolean editarProducto(Inventario inventario){
        boolean editar = false; // variable que retorna luego de realziar la accion
    
        Statement stm = null;  // interfaz de acceso a la base de datos
        
        Connection con = null; //coenxion con la base de datos
        
        String sql = "update inventario set codigo_pro = '"+inventario.getCoproducto()+"', "
                + "can_productos = '"+inventario.getCanproductos()+"', "
                + "descripcion = '"+inventario.getDescripcion()+"', "
                + "precio_compra_sin_iva = '"+inventario.getPreciocompra_sin_iva()+"',"
                + "precio_compra_con_iva = '"+inventario.getPreciocompra_con_iva()+"', "
                + "precio_mayorista = '"+inventario.getPreciomayorista()+"', "
                + "precio_cliente_fijo = '"+inventario.getPreciocliente_fijo()+"',"
                + "precio_cliente_normal = '"+inventario.getPreciocliente_normal()+"', "
                + "fecha_caducidad = '"+utilidades.formatoFecha(inventario.getFecha_caducidad())+"', "
                + "fecha_actualizacion = '"+utilidades.formatoFecha(inventario.getFecha_actualizacion())+"' where id_inventario = '"+inventario.getIdinventario()+"';";
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
     public boolean eliminarProducto(Inventario inventario){
        boolean eliminar = false;
    
        Statement stm = null;
        
        Connection con = null;
        
         String sql = "delete from inventario where id_inventario = '"+inventario.getIdinventario()+"'";
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
    public List<Inventario> obtenerProductos() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM persona.inventario;";
        List<Inventario> listaProductos = new ArrayList<Inventario>();
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
                
                listaProductos.add(i);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
    }
    // Metodos para buscar en el combobox
    
    public List<Inventario> buscarCodigo(String coproducto){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Inventario> listaProductos = new ArrayList<>();
            String sql = "SELECT * FROM persona.inventario where codigo_pro like \"%"+coproducto+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
           
    }
    public List<Inventario> buscarDescripcion(String descripcion){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Inventario> listaProductos = new ArrayList<>();
            String sql = "SELECT * FROM persona.inventario where descripcion like \"%"+descripcion+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
           
    }public List<Inventario> buscarPrecioCompra(String preciocompra){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Inventario> listaProductos = new ArrayList<>();
            String sql = "SELECT * FROM persona.inventario where precio_compra like \"%"+preciocompra+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
               Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
           
    }public List<Inventario> buscarPrecioVenta(String precioventa){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Inventario> listaProductos = new ArrayList<>();
            String sql = "SELECT * FROM persona.inventario where precio_venta like \"%"+precioventa+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
           
    }public List<Inventario> buscarCantidad(String canproductos){
        Connection co = null; //Sirve para conectar con a base de datos
        Statement stm = null; //Sirve para preparar los datos
        ResultSet rs = null;//Sentencia de JDBC para obtener valores de la base de datos.
        List<Inventario> listaProductos = new ArrayList<>();
            String sql = "SELECT * FROM persona.inventario where can_productos like \"%"+canproductos+"%\"";
        
        try {
            co = new BdEjercicio1().getConexion();
            stm = (Statement) co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setIdinventario(rs.getInt(1));
                i.setCoproducto(rs.getString(2));
                i.setCanproductos(rs.getString(3));
                i.setDescripcion(rs.getString(4));
                i.setPreciocompra_sin_iva(rs.getString(5));
                i.setPreciocompra_con_iva(rs.getString(6));
                i.setPreciomayorista(rs.getString(7));
                i.setPreciocliente_fijo(rs.getString(8));
                i.setPreciocliente_normal(rs.getString(9));
                i.setFecha_caducidad(rs.getDate(10));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            //System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
           
    }
}

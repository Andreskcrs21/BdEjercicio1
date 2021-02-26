
package com.istloja.controlador;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author IdeaPad - S340
 */
public class Inventariobd {
    public boolean registrarInventario(Inventario inventario){
    
        boolean registrar = false;
        
        Statement stm = null;
        
        Connection con = null;
        
       
                 
        String sql = "INSERT INTO inventario (`codigo_pro`, `descripcion`, `precio_compra`, `precio_venta`, `can_productos`) VALUES ('"
                +inventario.getCoproducto()+"', '"
                +inventario.getDescripcion()+"', '"
                +inventario.getPreciocompra()+"', '"
                +inventario.getPrecioventa()+"', '"
                +inventario.getCanproductos()+"');";
                
         
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
        
        String sql = "update inventario set codigo_pro = '"+inventario.getCoproducto()+"', descripcion = '"+inventario.getDescripcion()+"', precio_compra='"+inventario.getPreciocompra()+"', precio_venta='"+inventario.getPrecioventa()+"', can_productos='"+inventario.getCanproductos()+"' where (id_inventario=" + inventario.getIdinventario()+ ")"; // concatenando la opcion de actualizacion
        
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
                i.setDescripcion(rs.getString(3));
                i.setPreciocompra(rs.getString(4));
                i.setPrecioventa(rs.getString(5));
                i.setCanproductos(rs.getString(6));
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istl.vista.GestionContable;
import com.istloja.modelo.Inventario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class modelTableProductos extends AbstractTableModel{
    private String[] m_colNames = {"Codigo de Producto", "Cantidad de Producto", "Descripcion","Precio de Compra sin Iva", 
        "Precio de Compra con Iva", "Precio Mayorista", "Precio CLiente Fijo","Precio Cliente Normal", "Fecha de Caducidad"};
    private List<Inventario> inventario;
    private GestionContable gContable;

    public modelTableProductos(List<Inventario> inventario, GestionContable gContable) {
        this.inventario = inventario;
        this.gContable = gContable;
    }
    

    @Override
    public int getRowCount() {
       return inventario.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = this.inventario.get(rowIndex);
        switch(columnIndex){
            case 0:
                return inventario.getCoproducto();
            case 1:
                return inventario.getCanproductos();                
            case 2:
                return inventario.getDescripcion();                
            case 3:
                return inventario.getPreciocompra_sin_iva();                
            case 4:
                return inventario.getPreciocompra_con_iva();
            case 5:
                return inventario.getPreciomayorista();
            case 6:
                return inventario.getPreciocliente_fijo();
            case 7:
                return inventario.getPreciocliente_normal();
            case 8:
                return inventario.getFecha_caducidad();              
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        return m_colNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
         gContable.clickInventario(inventario.get(rowIndex));
         return super.isCellEditable(rowIndex, columnIndex);
    }
    
     public List<Inventario> geInventarios(){
        return inventario;
    }
    public void setInventario(List<Inventario> inventario){
        this.inventario = inventario;
    }
    
}

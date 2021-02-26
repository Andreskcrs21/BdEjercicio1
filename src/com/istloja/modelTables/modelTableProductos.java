/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istl.vista.GestionContable;
import com.istloja.modelo.Inventario;
import com.istloja.modelo.Proveedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class modelTableProductos extends AbstractTableModel{
    private String[] m_colNames = {"Codigo de Producto", "Descripcion", "Precio de Compra", "Precio de Venta", "Cantidad de Producto"};
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
                return inventario.getDescripcion();
            case 2:
                return inventario.getPreciocompra();
            case 3:
                return inventario.getPrecioventa();
            case 4:
                return inventario.getCanproductos();
                              
                
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

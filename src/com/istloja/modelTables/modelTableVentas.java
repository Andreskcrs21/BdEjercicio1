/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.ProductoVenta;
import com.istloja.vista.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class modelTableVentas extends AbstractTableModel{
    private String[] m_colNames = {"Cantidad", "Descripcion", "Subtotal", "Total"};
    private List<ProductoVenta> productoVenta;
    private GestionContable gContable;

    public modelTableVentas(List<ProductoVenta> productoVenta, GestionContable gContable) {
        this.productoVenta = productoVenta;
        this.gContable = gContable;
    }
    
    
    @Override
    public int getRowCount() {
        return productoVenta.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductoVenta producto = productoVenta.get(rowIndex);
        switch(columnIndex){
            case 0:
                return producto.getCantidad();
            case 1:
                return producto.getDescripcion();
            case 2:
                return producto.getSubTotal();
            case 3:
                return producto.getTotal();
        
        
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
       return m_colNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clicProductoVender(productoVenta.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    public List<ProductoVenta> getProductoVentas(){
        return productoVenta;
    
    }
    public void setProductoVentas(List<ProductoVenta> inventarios){
        this.productoVenta = inventarios;
    
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istl.vista.GestionContable;
import com.istloja.modelo.Proveedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class modelTableProveedores extends AbstractTableModel{
    private String[] m_colNames = {"RUC", "RAZON SOCIAL", "TIPO ACTIVIDAD", "NOMBRE REPRESENTANTE LEGAL", "APELLIDO REPRESENTANTE LEGAL", 
        "TELEFONO", "CORREO", "DIRECCION", "FECHA DE VENCIMIENTO"};
    private List<Proveedores> proveedores;
    private GestionContable gContable;

    public modelTableProveedores(List<Proveedores> proveedores, GestionContable gContable) {
        this.proveedores = proveedores;
        this.gContable = gContable;
    }
    
    
    // determina el numero de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return proveedores.size();
    }
    
    //determina el numero de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedores proveedor = proveedores.get(rowIndex);
        switch(columnIndex){
            case 0:
                return proveedor.getRuc();
            case 1:
                return proveedor.getRazonSocial();
            case 2:
                return proveedor.getTipoActividad();
            case 3:
                return proveedor.getNombreRepresentante();
            case 4:
                return proveedor.getApellidoRepresentante();
            case 5:
                return proveedor.getTelefono();
            case 6:
                return proveedor.getCorreo();          
            case 7:
                return proveedor.getDireccionpro();
            case 8:
                return proveedor.getFecha_vencimientop();
                
        }
        return new String();
    }
    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clickProveedores(proveedores.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
    }
    public List<Proveedores> getProveedoreses(){
        return proveedores;
    }
    public void setProveedores(List<Proveedores> proveedores){
        this.proveedores = proveedores;
    }
    
    
}


package com.istl.vista;

import com.istloja.modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class ModelTablePersonaV2 extends AbstractTableModel{
    public String[] m_colNames = {"Cedula", "Nombres", "Apellidos", "Direccion", "Telefono", "Correo"};
    public List<Persona>personas;

    public ModelTablePersonaV2(List<Persona> personas) {
        this.personas = personas;
    }
  
    @Override
    public int getRowCount() {
        return personas.size(); //Devuelve el numero de filas que tengo en mi tabla
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length; //Determina el numero de columnas de mi tabla
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = personas.get(rowIndex); 
        switch (columnIndex){
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombres();
            case 2:
                return persona.getApellidos();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getTelefono();
            case 5:
                return persona.getCorreo();          
               
        
        }
        return new String();
    }
      @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}

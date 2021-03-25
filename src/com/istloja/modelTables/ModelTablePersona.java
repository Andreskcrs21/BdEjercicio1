
package com.istloja.modelTables;

import com.istloja.vista.GestionContable;
import com.istloja.modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IdeaPad - S340
 */
public class ModelTablePersona extends AbstractTableModel{
    private String[] m_colNames = {"Cedula", "Nombres", "Apellidos", "Direccion", "Telefono", "Correo", "Genero ", "Fecha de Nacimiento"};
    private List<Persona>personas;
    private GestionContable gContable;

    public ModelTablePersona(List<Persona> personas, GestionContable gContable) {
        this.personas = personas;
        this.gContable = gContable;
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
            case 6:
                return persona.getGenero();
            case 7:
                return persona.getFecha_nacimiento();
               
        
        }
        return new String();
    }
      @Override
    public String getColumnName(int column) {
        return m_colNames[column]; // Me va a dar el nombre de una columna
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       gContable.clickPersona(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Persona>getPersona(){
    return personas;
    }
    public void setPersonas(List<Persona>personas){
    this.personas = personas;
    
    }
    
    
}


package com.istl.vista;

import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionPersona {
    private JTextField txtcedula;
    private JTextField txtnombre;
    private JTextField txtapellidos;
    private JTextField txtdireccion;
    private JTextField txttelefono;
    private JTextField txtcorreo;
    private Utilidades utilidades;
    private JFrame frameGestionContable;
    

    public GestionPersona(JTextField txtcedula, JTextField txtnombre, JTextField txtapellidos, JTextField txtdireccion, JTextField txttelefono, JTextField txtcorreo) {
        this.txtcedula = txtcedula;
        this.txtnombre = txtnombre;
        this.txtapellidos = txtapellidos;
        this.txtdireccion = txtdireccion;
        this.txttelefono = txttelefono;
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(JTextField txtcedula) {
        this.txtcedula = txtcedula;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxtapellidos() {
        return txtapellidos;
    }

    public void setTxtapellidos(JTextField txtapellido) {
        this.txtapellidos = txtapellido;
    }

    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(JTextField txtdireccion) {
        this.txtdireccion = txtdireccion;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }
    
    void limpiarCamposPersona(){
        txtcedula.setText("");
        txtnombre.setText("");
        txtapellidos.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");    
        
    
    }
    public Persona guardarEditar(){
    if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Cedula no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Nombres no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtnombre.requestFocus();
            return null;
        }if (txtapellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Apellidos no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtapellidos.requestFocus();
            return null;
        }if (txtdireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Direccion no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtdireccion.requestFocus();
            return null;
        }if (txttelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Telefono no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txttelefono.requestFocus();
            return null;
            
        }if (!utilidades.validarNumeros(txttelefono.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el telefono no son validos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txttelefono.requestFocus();
            return null;
        }if (txtcorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Correo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcorreo.requestFocus();
            return null;
        }if (!utilidades.validarCorreo(txtcorreo.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el correo son invalidos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcorreo.requestFocus();
            return null;
        }
        
        Persona persona = new Persona();
        persona.setCedula(txtcedula.getText());
        persona.setNombres(txtnombre.getText());
        persona.setApellidos(txtapellidos.getText());
        persona.setDireccion(txtdireccion.getText());
        persona.setTelefono(txttelefono.getText());
        persona.setCorreo(txtcorreo.getText());
        System.out.println(persona.toString());
        return persona;
        /*if (controladorPersona.registrarPersona(persona)) {
            JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona","ERROR",JOptionPane.ERROR_MESSAGE);
        }*/
    
    
    }
    
    
    
}


package com.istl.vista;

import com.istloja.modelo.Proveedores;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionProveedores {
    private JTextField txtruc;
    private JTextField txtrazon;
    private JTextField txtactividad;
    private JTextField txtnombrep;
    private JTextField txtapellidop;
    private JTextField txttelefonop;
    private JTextField txtcorreopro;
    private JTextField txtdireccionpro;
    private JFrame frameGestionContable;

    public GestionProveedores(JTextField txtruc, JTextField txtrazon, JTextField txtactividad, JTextField txtnombrep, JTextField txtapellidop, JTextField txttelefonop, JTextField txtcorreopro, JTextField txtdireccionpro, JFrame frameGestionContable) {
        this.txtruc = txtruc;
        this.txtrazon = txtrazon;
        this.txtactividad = txtactividad;
        this.txtnombrep = txtnombrep;
        this.txtapellidop = txtapellidop;
        this.txttelefonop = txttelefonop;
        this.txtcorreopro = txtcorreopro;
        this.txtdireccionpro = txtdireccionpro;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxtruc() {
        return txtruc;
    }

    public void setTxtruc(JTextField txtruc) {
        this.txtruc = txtruc;
    }

    public JTextField getTxtrazon() {
        return txtrazon;
    }

    public void setTxtrazon(JTextField txtrazon) {
        this.txtrazon = txtrazon;
    }

    public JTextField getTxtactividad() {
        return txtactividad;
    }

    public void setTxtactividad(JTextField txtactividad) {
        this.txtactividad = txtactividad;
    }

    public JTextField getTxtnombrep() {
        return txtnombrep;
    }

    public void setTxtnombrep(JTextField txtnombrep) {
        this.txtnombrep = txtnombrep;
    }

    public JTextField getTxtapellidop() {
        return txtapellidop;
    }

    public void setTxtapellidop(JTextField txtapellidop) {
        this.txtapellidop = txtapellidop;
    }

    public JTextField getTxttelefonop() {
        return txttelefonop;
    }

    public void setTxttelefonop(JTextField txttelefonop) {
        this.txttelefonop = txttelefonop;
    }

    public JTextField getTxtcorreopro() {
        return txtcorreopro;
    }

    public void setTxtcorreopro(JTextField txtcorreopro) {
        this.txtcorreopro = txtcorreopro;
    }

    public JTextField getTxtdireccionpro() {
        return txtdireccionpro;
    }

    public void setTxtdireccionpro(JTextField txtdireccionpro) {
        this.txtdireccionpro = txtdireccionpro;
    }

    

    void limpiarCamposProveedor() {
        txtruc.setText("");
        txtrazon.setText("");
        txtactividad.setText("");
        txtnombrep.setText("");
        txtapellidop.setText("");
        txttelefonop.setText("");
        txtcorreopro.setText("");
        txtdireccionpro.setText("");
    }
    public Proveedores guardarEditar(){
    if (txtruc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Ruc no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtruc.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtrazon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Razon Social no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtrazon.requestFocus();
            return null;
        }if (txtactividad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Tipo de Actividad no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtactividad.requestFocus();
            return null;
        }if (txtnombrep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Nombres de Representante no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtnombrep.requestFocus();
            return null;
        }if (txtapellidop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Apellido de Representante no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtapellidop.requestFocus();
            return null;
            
        }if (txttelefonop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Telefono no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txttelefonop.requestFocus();
            return null;
            
        }if (txtcorreopro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Correo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcorreopro.requestFocus();
            return null;
            
        }if (txtdireccionpro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Correo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtdireccionpro.requestFocus();
            return null;
            
        }
        Proveedores proveedores = new Proveedores();
        proveedores.setRuc(txtruc.getText());
        proveedores.setRazonSocial(txtrazon.getText());
        proveedores.setTipoActividad(txtactividad.getText());
        proveedores.setNombreRepresentante(txtnombrep.getText());
        proveedores.setApellidoRepresentante(txtapellidop.getText());
        proveedores.setTelefono(txttelefonop.getText());
        proveedores.setCorreo(txtcorreopro.getText());
        proveedores.setDireccionpro(txtdireccionpro.getText());
        
        return proveedores;
        
        
    
        
        
        
    }
        
        
        
        
    
}

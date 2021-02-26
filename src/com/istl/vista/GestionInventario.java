/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.vista;

import com.istloja.modelo.Inventario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionInventario {
    private JTextField txtcopro;
    private JTextField txtdespro;
    private JTextField txtprecom;
    private JTextField txtpreven;
    private JTextField txtcanpro;
    private JFrame frameGestionContable;
    
    public GestionInventario(JTextField txtcopro, JTextField txtdespro, JTextField txtprecom, JTextField txtpreven, JTextField txtcanpro, JFrame frameGestionContable) {
        this.txtcopro = txtcopro;
        this.txtdespro = txtdespro;
        this.txtprecom = txtprecom;
        this.txtpreven = txtpreven;
        this.txtcanpro = txtcanpro;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxtcopro() {
        return txtcopro;
    }

    public void setTxtcopro(JTextField txtcopro) {
        this.txtcopro = txtcopro;
    }

    public JTextField getTxtdespro() {
        return txtdespro;
    }

    public void setTxtdespro(JTextField txtdespro) {
        this.txtdespro = txtdespro;
    }

    public JTextField getTxtprecom() {
        return txtprecom;
    }

    public void setTxtprecom(JTextField txtprecom) {
        this.txtprecom = txtprecom;
    }

    public JTextField getTxtpreven() {
        return txtpreven;
    }

    public void setTxtpreven(JTextField txtpreven) {
        this.txtpreven = txtpreven;
    }

    public JTextField getTxtcanpro() {
        return txtcanpro;
    }

    public void setTxtcanpro(JTextField txtcanpro) {
        this.txtcanpro = txtcanpro;
    }
    void limpiarcamposProducto(){
        txtcopro.setText("");
        txtdespro.setText("");
        txtprecom.setText("");
        txtpreven.setText("");
        txtcanpro.setText("");       
    
    }
    public Inventario guardarEditar(){
        if (txtcopro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Codigo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcopro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtdespro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Descripcion no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtdespro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtprecom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de Compra no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtprecom.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtpreven.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de Venta no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtpreven.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtcanpro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Cantidad de Productos no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcanpro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
    }
     Inventario inventario = new Inventario();
            inventario.setCoproducto(txtcopro.getText());
            inventario.setDescripcion(txtdespro.getText());
            inventario.setPreciocompra(txtprecom.getText());
            inventario.setPrecioventa(txtpreven.getText());
            inventario.setCanproductos(txtcanpro.getText());
            //System.out.println(inventario.toString());
            return inventario;
    
    }
}
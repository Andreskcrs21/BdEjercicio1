/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.vista;

import com.istloja.modelo.Inventario;
import com.istloja.utilidad.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionInventario {
    private JTextField txtcopro;
    private JTextField txtcanpro;
    private JTextField txtdespro;
    private JTextField txtprecompra_siniva;
    private JTextField txtprecompra_coniva;
    private JTextField txtpreciomayorista;
    private JTextField txtprecio_clientefijo;
    private JTextField txtprecio_clientenormal;
    private JTextField txtfecha_caducidad;    
    private JFrame frameGestionContable;
    private Utilidades utilidades;

    public GestionInventario(JTextField txtcopro, JTextField txtcanpro, JTextField txtdespro, JTextField txtprecompra_siniva, JTextField txtprecompra_coniva, JTextField txtpreciomayorista, JTextField txtprecio_clientefijo, JTextField txtprecio_clientenormal, JTextField txtfecha_caducidad, JFrame frameGestionContable, Utilidades utilidades) {
        this.txtcopro = txtcopro;
        this.txtcanpro = txtcanpro;
        this.txtdespro = txtdespro;
        this.txtprecompra_siniva = txtprecompra_siniva;
        this.txtprecompra_coniva = txtprecompra_coniva;
        this.txtpreciomayorista = txtpreciomayorista;
        this.txtprecio_clientefijo = txtprecio_clientefijo;
        this.txtprecio_clientenormal = txtprecio_clientenormal;
        this.txtfecha_caducidad = txtfecha_caducidad;
        this.frameGestionContable = frameGestionContable;
        this.utilidades = utilidades;
    }

    public JTextField getTxtcopro() {
        return txtcopro;
    }

    public void setTxtcopro(JTextField txtcopro) {
        this.txtcopro = txtcopro;
    }

    public JTextField getTxtcanpro() {
        return txtcanpro;
    }

    public void setTxtcanpro(JTextField txtcanpro) {
        this.txtcanpro = txtcanpro;
    }

    public JTextField getTxtdespro() {
        return txtdespro;
    }

    public void setTxtdespro(JTextField txtdespro) {
        this.txtdespro = txtdespro;
    }

    public JTextField getTxtprecompra_siniva() {
        return txtprecompra_siniva;
    }

    public void setTxtprecompra_siniva(JTextField txtprecompra_siniva) {
        this.txtprecompra_siniva = txtprecompra_siniva;
    }

    public JTextField getTxtprecompra_coniva() {
        return txtprecompra_coniva;
    }

    public void setTxtprecompra_coniva(JTextField txtprecompra_coniva) {
        this.txtprecompra_coniva = txtprecompra_coniva;
    }

    public JTextField getTxtpreciomayorista() {
        return txtpreciomayorista;
    }

    public void setTxtpreciomayorista(JTextField txtpreciomayorista) {
        this.txtpreciomayorista = txtpreciomayorista;
    }

    public JTextField getTxtprecio_clientefijo() {
        return txtprecio_clientefijo;
    }

    public void setTxtprecio_clientefijo(JTextField txtprecio_clientefijo) {
        this.txtprecio_clientefijo = txtprecio_clientefijo;
    }

    public JTextField getTxtprecio_clientenormal() {
        return txtprecio_clientenormal;
    }

    public void setTxtprecio_clientenormal(JTextField txtprecio_clientenormal) {
        this.txtprecio_clientenormal = txtprecio_clientenormal;
    }

    public JTextField getTxtfecha_caducidad() {
        return txtfecha_caducidad;
    }

    public void setTxtfecha_caducidad(JTextField txtfecha_caducidad) {
        this.txtfecha_caducidad = txtfecha_caducidad;
    }
    void limpiarcamposProducto(){
        txtcopro.setText("");
        txtdespro.setText("");
        txtcanpro.setText(""); 
        txtprecompra_siniva.setText("");
        txtprecompra_coniva.setText("");
        txtpreciomayorista.setText("");
        txtprecio_clientefijo.setText("");
        txtprecio_clientenormal.setText("");
        txtfecha_caducidad.setText("");
              
    
    }
    public Inventario guardarEditar(){
        if (txtcopro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Codigo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcopro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtcanpro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Cantidad de Productos no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcanpro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtdespro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Descripcion no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtdespro.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtprecompra_siniva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de Compra sin Iva no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtprecompra_siniva.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtprecompra_coniva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de Compra con Iva no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtprecompra_coniva.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtpreciomayorista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio Mayorista no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtpreciomayorista.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtprecio_clientefijo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio Cliente Fijo no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtprecio_clientefijo.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtprecio_clientenormal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio Cliente Normal no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtprecio_clientenormal.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (txtfecha_caducidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Fecha de caducidad no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtfecha_caducidad.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            return null;
        }if (!utilidades.validarCodigoNumeros(txtcopro.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Ingrese numeros en el campo Codigo","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcopro.requestFocus();
            return null;            
        }if (!utilidades.validarCodigoNumeros(txtcanpro.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Ingrese numeros en el campo Cantidad","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcanpro.requestFocus();
            return null; 
        }
     Inventario inventario = new Inventario();
            inventario.setCoproducto(txtcopro.getText());
            inventario.setCanproductos(txtcanpro.getText());
            inventario.setDescripcion(txtdespro.getText());
            inventario.setPreciocompra_sin_iva(txtprecompra_siniva.getText());
            inventario.setPreciocompra_con_iva(txtprecompra_coniva.getText());
            inventario.setPreciomayorista(txtpreciomayorista.getText());
            inventario.setPreciocliente_fijo(txtprecio_clientefijo.getText());
            inventario.setPreciocliente_normal(txtprecio_clientenormal.getText());
            inventario.setFecha_caducidad(txtfecha_caducidad.getText());
            
            //System.out.println(inventario.toString());
            return inventario;
    
    }
}
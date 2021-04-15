/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vista;

import com.istloja.controlador.Inventariobd;
import com.istloja.modelTables.modelTableProductos;

/**
 *
 * @author IdeaPad - S340
 */
public class BusquedaAvanzada extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaAvanzada
     */
    private modelTableProductos modelTableProductos;
    private Inventariobd controladorInventario;
    public BusquedaAvanzada(java.awt.Frame parent, boolean modal, modelTableProductos modelTableProductos, Inventariobd controladorInventario ) {
        super(parent, modal);
        this.modelTableProductos = modelTableProductos;
        this.controladorInventario = controladorInventario;
        
        initComponents();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBusquedaAvanzada = new javax.swing.JComboBox<>();
        txtBusquedaAvanzada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusquedaAvanzada = new javax.swing.JTable();
        botbusquedaAvanzada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Avanzada");

        jLabel1.setText("Buscar Producto");

        comboBusquedaAvanzada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion", " " }));

        tablaBusquedaAvanzada.setModel(modelTableProductos);
        jScrollPane1.setViewportView(tablaBusquedaAvanzada);

        botbusquedaAvanzada.setText("Buscar");
        botbusquedaAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbusquedaAvanzadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txtBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botbusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botbusquedaAvanzada))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void buscarproducto(){              
    switch (comboBusquedaAvanzada.getSelectedIndex()){
            case 0:
                modelTableProductos.setInventario(controladorInventario.buscarCodigo(txtBusquedaAvanzada.getText()));
               modelTableProductos.fireTableDataChanged();
                break;
            case 1:
                modelTableProductos.setInventario(controladorInventario.buscarDescripcion(txtBusquedaAvanzada.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
        }
    }
    private void botbusquedaAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbusquedaAvanzadaActionPerformed
        buscarproducto();
    }//GEN-LAST:event_botbusquedaAvanzadaActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botbusquedaAvanzada;
    private javax.swing.JComboBox<String> comboBusquedaAvanzada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBusquedaAvanzada;
    private javax.swing.JTextField txtBusquedaAvanzada;
    // End of variables declaration//GEN-END:variables
}
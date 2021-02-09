/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.vista;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionContable extends javax.swing.JFrame {

    //private Persona Personabd;
    private Personabd controladorPersona;
    private Utilidades utilidades;
    private Persona personaEditar;
    private Persona personaEliminar;
    private Persona personaBuscar;
    private GestionPersona gestionPersona;
    private ModelTablePersonaV2 modeloTablePersonaV2;
    
    /**
     * Creates new form Registro
     */
    public GestionContable() {
        controladorPersona = new Personabd();
        modeloTablePersonaV2 = new ModelTablePersonaV2(controladorPersona.obtenerPersonas());
        initComponents();
        utilidades = new Utilidades();
        
        gestionPersona = new GestionPersona(txtcedula, txtnombre, txtapellidos, txtdireccion, txttelefono, txtcorreo);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botguardar = new javax.swing.JButton();
        boteditar = new javax.swing.JButton();
        boteliminar = new javax.swing.JButton();
        bottraer = new javax.swing.JButton();
        botlimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        botbuscarcedula = new javax.swing.JButton();
        botbuscarapellido = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        comboBusqueda = new javax.swing.JComboBox<>();
        txtParametroBusqueda = new javax.swing.JTextField();
        botBuscarCombo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        botmenubuscar = new javax.swing.JMenuItem();
        botmenueditar = new javax.swing.JMenuItem();
        botmenueliminar = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Contable");

        botguardar.setText("Guardar");
        botguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botguardarActionPerformed(evt);
            }
        });

        boteditar.setText("Editar");
        boteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditarActionPerformed(evt);
            }
        });

        boteliminar.setText("Eliminar");
        boteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteliminarActionPerformed(evt);
            }
        });

        bottraer.setText("Traer");
        bottraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottraerActionPerformed(evt);
            }
        });

        botlimpiar.setText("Limpiar Campos");
        botlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro de Personas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Correo");

        txtcedula.setToolTipText("Ingrese una cedula correcta");
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        botbuscarcedula.setText("Buscar");
        botbuscarcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbuscarcedulaActionPerformed(evt);
            }
        });

        botbuscarapellido.setText("Buscar");
        botbuscarapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbuscarapellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67)
                                .addComponent(txtcedula)
                                .addGap(18, 18, 18)
                                .addComponent(botbuscarcedula))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttelefono)
                                            .addComponent(txtdireccion)
                                            .addComponent(txtapellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtcorreo)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(txtnombre)))
                                .addGap(18, 18, 18)
                                .addComponent(botbuscarapellido)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botbuscarcedula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botbuscarapellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTable6.setModel(modeloTablePersonaV2);
        jScrollPane6.setViewportView(jTable6);

        jLabel8.setText("Buscar Cliente");

        comboBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", "Apellido", "Telefono", "Correo" }));

        botBuscarCombo.setText("Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(botguardar)
                                .addGap(93, 93, 93)
                                .addComponent(boteditar)
                                .addGap(78, 78, 78)
                                .addComponent(boteliminar)
                                .addGap(73, 73, 73)
                                .addComponent(bottraer)
                                .addGap(60, 60, 60)
                                .addComponent(botlimpiar)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botBuscarCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botguardar)
                    .addComponent(boteditar)
                    .addComponent(boteliminar)
                    .addComponent(bottraer)
                    .addComponent(botlimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botBuscarCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        jTabbedPane2.addTab("Clientes", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Proveedores", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Inventario", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Ventas", jPanel6);

        jMenu1.setText("Archivos");

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenu3.setText("Funcionalidades");

        botmenubuscar.setText("Buscar");
        botmenubuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmenubuscarActionPerformed(evt);
            }
        });
        jMenu3.add(botmenubuscar);

        botmenueditar.setText("Editar");
        botmenueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmenueditarActionPerformed(evt);
            }
        });
        jMenu3.add(botmenueditar);

        botmenueliminar.setText("Eliminar");
        botmenueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmenueliminarActionPerformed(evt);
            }
        });
        jMenu3.add(botmenueliminar);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void buscarPersonaPorCedula(){
    Persona persona = controladorPersona.buscarpersona(txtcedula.getText());
        personaEditar = persona;
        if (persona != null) {
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombres());
            txtapellidos.setText(persona.getApellidos());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay ninguna persona registrada con esta cedula");
            txtcedula.setText("");
            txtcedula.requestFocus();
        
        }
    
    
    }
    public void editarpersona(){
    if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar");
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.editarpersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito");
                gestionPersona.limpiarCamposPersona();
                personaEditar= null;
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona");
            }
            
        }
    }
    public void eliminarpersona(){
    if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay persona seleccionada para eliminar");
            return;
        }
        Persona personaEliminarLocal = gestionPersona.guardarEditar();
        if (personaEliminarLocal != null) {
            personaEliminarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.eliminarpersona(personaEliminarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada correctamente");
                gestionPersona.limpiarCamposPersona();
                personaEditar = null;
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Error al eliminar");
            }
        }
    }
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void botmenubuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmenubuscarActionPerformed
        buscarPersonaPorCedula();
    }//GEN-LAST:event_botmenubuscarActionPerformed

    private void botmenueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmenueditarActionPerformed
        editarpersona();
    }//GEN-LAST:event_botmenueditarActionPerformed

    private void botmenueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmenueliminarActionPerformed
        eliminarpersona();
    }//GEN-LAST:event_botmenueliminarActionPerformed

    private void bottraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottraerActionPerformed
        List<Persona>obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size()-1);
        txtcedula.setText(personaEditar.getCedula());
        txtnombre.setText(personaEditar.getNombres());
        txtapellidos.setText(personaEditar.getApellidos());
        txtdireccion.setText(personaEditar.getDireccion());
        txtcorreo.setText(personaEditar.getCorreo());
        txttelefono.setText(personaEditar.getTelefono());
    }//GEN-LAST:event_bottraerActionPerformed

    private void boteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteliminarActionPerformed
        eliminarpersona();
    }//GEN-LAST:event_boteliminarActionPerformed

    private void boteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditarActionPerformed
        editarpersona();

    }//GEN-LAST:event_boteditarActionPerformed

    private void botguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botguardarActionPerformed
        if (controladorPersona.buscarpersona(txtcedula.getText())!=null) {
            JOptionPane.showMessageDialog(rootPane, "El numero de cedula ya se encuentra registrado en el sistema");
        }else{
            Persona personaGuardar = gestionPersona.guardarEditar();
            if (personaGuardar != null) {
                if(controladorPersona.registrarPersona(personaGuardar)){
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada correctamente");
                    gestionPersona.limpiarCamposPersona();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona");
                }
            }

        }

    }//GEN-LAST:event_botguardarActionPerformed

    private void botbuscarapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbuscarapellidoActionPerformed
        Persona apellidos = controladorPersona.buscarapellido(txtapellidos.getText());
        personaEditar = apellidos;
        if (apellidos != null) {
            txtcedula.setText(apellidos.getCedula());
            txtnombre.setText(apellidos.getNombres());
            txtapellidos.setText(apellidos.getApellidos());
            txtdireccion.setText(apellidos.getDireccion());
            txttelefono.setText(apellidos.getTelefono());
            txtcorreo.setText(apellidos.getCorreo());
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay ninguna persona registrada con este apellido");
            txtapellidos.setText("");
            txtapellidos.requestFocus();

        }
    }//GEN-LAST:event_botbuscarapellidoActionPerformed

    private void botbuscarcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbuscarcedulaActionPerformed
        buscarPersonaPorCedula();
    }//GEN-LAST:event_botbuscarcedulaActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void botlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimpiarActionPerformed
        gestionPersona.limpiarCamposPersona();
    }//GEN-LAST:event_botlimpiarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BdEjercicio1 con = new BdEjercicio1();
        con.getConexion();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBuscarCombo;
    private javax.swing.JButton botbuscarapellido;
    private javax.swing.JButton botbuscarcedula;
    private javax.swing.JButton boteditar;
    private javax.swing.JButton boteliminar;
    private javax.swing.JButton botguardar;
    private javax.swing.JButton botlimpiar;
    private javax.swing.JMenuItem botmenubuscar;
    private javax.swing.JMenuItem botmenueditar;
    private javax.swing.JMenuItem botmenueliminar;
    private javax.swing.JButton bottraer;
    private javax.swing.JComboBox<String> comboBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}

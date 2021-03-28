/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vista;

import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.controlador.Inventariobd;
import com.istloja.modelTables.ModelTablePersona;
import com.istloja.controlador.Personabd;
import com.istloja.controlador.Proveedoresbd;
import com.istloja.modelTables.ComunicacionPersona;
import com.istloja.modelTables.modelTableProductos;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;
import com.istloja.utilidad.Utilidades;
import com.istloja.modelTables.modelTableProveedores;
import com.istloja.modelo.Inventario;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author IdeaPad - S340
 */
public class GestionContable extends javax.swing.JFrame implements ComunicacionPersona{

    //private Persona Personabd;
    private final Personabd controladorPersona;
    private Utilidades utilidades;
    private Persona personaEditar;
    private Inventario productoEditar;
    private Persona personaEliminar;
    private Persona personaBuscar;
    private Proveedores proveedorEditar;
    private GestionPersona gestionPersona;
    private ModelTablePersona modeloTablePersonaV2;
    private modelTableProveedores modelTableProveedores;
    private modelTableProductos modelTableProductos;
    private ComunicacionPersona comunicacionPersona;
    private Proveedoresbd controladorProveedor;
    private Inventariobd controladorInventario;
    private GestionInventario gestionInventario;
    private GestionProveedores gestionProveedor;
    
    /**
     * Creates new form Registro
     */
    public GestionContable() {
        
        controladorPersona = new Personabd();
        controladorProveedor = new Proveedoresbd();
        controladorInventario = new Inventariobd();
        modeloTablePersonaV2 = new ModelTablePersona(controladorPersona.obtenerPersonas(),this);
        modelTableProveedores = new modelTableProveedores(controladorProveedor.obtenerProveedores(),this);
        modelTableProductos = new modelTableProductos(controladorInventario.obtenerProductos(),this);
        initComponents();
        utilidades = new Utilidades();
        jrbcedula.setSelected(true);
        txtfechaventa.setText(utilidades.formatoFecha(new Date()));
        
        gestionPersona = new GestionPersona(txtcedula, txtnombre, txtapellidos, txtdireccion, txttelefono, txtcorreo, combogenero, jDateFechaNacimiento, utilidades, this);
        gestionInventario = new GestionInventario(txtcopro, txtcanpro, txtdespro, txtprecompra_siniva, txtprecompra_coniva, txtpreciomayorista, txtprecio_clientefijo, txtprecio_clientenormal, jDateVencimiento, this, utilidades);
        gestionProveedor = new GestionProveedores(txtruc, txtrazon, txtactividad, txtnombrep, txtapellidop, txttelefonop, txtcorreopro, txtdireccionpro, jDateProveedorVencimiento, this);
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
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botguardarCliente = new javax.swing.JButton();
        boteditarCliente = new javax.swing.JButton();
        boteliminarCliente = new javax.swing.JButton();
        bottraerCliente = new javax.swing.JButton();
        botLimpiarCamposCliente = new javax.swing.JButton();
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
        combogenero = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jrbcedula = new javax.swing.JRadioButton();
        jrbpasaporte = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        comboBusquedaClientes = new javax.swing.JComboBox<>();
        txtParametroBusqueda = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtactividad = new javax.swing.JTextField();
        txtdireccionpro = new javax.swing.JTextField();
        txtrazon = new javax.swing.JTextField();
        txttelefonop = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        txtnombrep = new javax.swing.JTextField();
        txtapellidop = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtcorreopro = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jDateProveedorVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        boteditarProveedor = new javax.swing.JButton();
        boteliminarProveedor = new javax.swing.JButton();
        botguardarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        comboBusquedaProveedor = new javax.swing.JComboBox<>();
        txtcomboProveedores = new javax.swing.JTextField();
        botlimpiarprov = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtcopro = new javax.swing.JTextField();
        txtprecompra_siniva = new javax.swing.JTextField();
        txtprecompra_coniva = new javax.swing.JTextField();
        txtcanpro = new javax.swing.JTextField();
        txtdespro = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtpreciomayorista = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtprecio_clientenormal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtprecio_clientefijo = new javax.swing.JTextField();
        jDateVencimiento = new com.toedter.calendar.JDateChooser();
        botguardarprod = new javax.swing.JButton();
        boteditarprod = new javax.swing.JButton();
        boteliminarprod = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        comoboBuscarProducto = new javax.swing.JComboBox<>();
        txtbusquedaComboProductos = new javax.swing.JTextField();
        botlimpiartodo = new javax.swing.JButton();
        botlimpiarprecios = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtcedulaoruc = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtnombrecli = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtdireccioncli = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txttelefonocli = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtfechaventa = new javax.swing.JTextField();
        botlimpiarnota = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        botmenubuscar = new javax.swing.JMenuItem();
        botmenueditar = new javax.swing.JMenuItem();
        botmenueliminar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Contable");

        botguardarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botguardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/diskette.png"))); // NOI18N
        botguardarCliente.setText("Guardar");
        botguardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botguardarClienteActionPerformed(evt);
            }
        });

        boteditarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/edit.png"))); // NOI18N
        boteditarCliente.setText("Editar");
        boteditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditarClienteActionPerformed(evt);
            }
        });

        boteliminarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/delete.png"))); // NOI18N
        boteliminarCliente.setText("Eliminar");
        boteliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteliminarClienteActionPerformed(evt);
            }
        });

        bottraerCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bottraerCliente.setText("Traer");
        bottraerCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bottraerClienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bottraerClienteMouseReleased(evt);
            }
        });
        bottraerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottraerClienteActionPerformed(evt);
            }
        });

        botLimpiarCamposCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botLimpiarCamposCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/escoba.png"))); // NOI18N
        botLimpiarCamposCliente.setText("Limpiar Campos");
        botLimpiarCamposCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botLimpiarCamposClienteMouseClicked(evt);
            }
        });
        botLimpiarCamposCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimpiarCamposClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Personas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel2.setText("DNI");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Correo");

        txtcedula.setToolTipText("Ingrese una cedula correcta");
        txtcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcedulaFocusLost(evt);
            }
        });
        txtcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtcedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcedulaMouseExited(evt);
            }
        });
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No definido", "Masculino", "Femenino" }));

        jLabel25.setText("Genero");

        jrbcedula.setText("Cedula");
        jrbcedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbcedulaItemStateChanged(evt);
            }
        });

        jrbpasaporte.setText("Pasaporte");
        jrbpasaporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbpasaporteItemStateChanged(evt);
            }
        });

        jLabel22.setText("Fecha de nacimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(jLabel25))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jrbcedula)
                                .addGap(18, 18, 18)
                                .addComponent(jrbpasaporte))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion)
                            .addComponent(txtapellidos)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbcedula)
                    .addComponent(jrbpasaporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablacliente.setModel(modeloTablePersonaV2);
        jScrollPane6.setViewportView(tablacliente);

        jLabel8.setText("Buscar Cliente");

        comboBusquedaClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboBusquedaClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", "Apellido", "Telefono", "Correo" }));

        txtParametroBusqueda.setToolTipText("Para realizar la busqueda ingrese algun dato");
        txtParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParametroBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botguardarCliente)
                                .addGap(41, 41, 41)
                                .addComponent(boteditarCliente)
                                .addGap(53, 53, 53)
                                .addComponent(boteliminarCliente)
                                .addGap(69, 69, 69)
                                .addComponent(bottraerCliente)
                                .addGap(70, 70, 70)
                                .addComponent(botLimpiarCamposCliente))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBusquedaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botguardarCliente)
                    .addComponent(boteditarCliente)
                    .addComponent(boteliminarCliente)
                    .addComponent(bottraerCliente)
                    .addComponent(botLimpiarCamposCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboBusquedaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        jTabbedPane.addTab("Clientes", jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));

        jLabel10.setText("RUC");

        jLabel11.setText("RAZON SOCIAL");

        jLabel12.setText("TIPO ACTIVIDAD");

        jLabel13.setText("NOMBRE REPRESENTANTE LEGAL");

        jLabel14.setText("APELLIDO REPRESENTANTE LEGAL");

        jLabel15.setText("TELEFONO");

        jLabel16.setText("CORREO");

        jLabel26.setText("DIRECCION");

        jLabel32.setText("Fecha de Vencimiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel26)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtruc)
                    .addComponent(txtrazon)
                    .addComponent(txtactividad)
                    .addComponent(txtnombrep)
                    .addComponent(txtdireccionpro)
                    .addComponent(txtapellidop, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addComponent(txttelefonop)
                    .addComponent(txtcorreopro)
                    .addComponent(jDateProveedorVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtrazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtactividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtnombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtapellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txttelefonop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtcorreopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtdireccionpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jDateProveedorVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Registro Proveedores");

        boteditarProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/edit.png"))); // NOI18N
        boteditarProveedor.setText("Editar");
        boteditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditarProveedorActionPerformed(evt);
            }
        });

        boteliminarProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/delete.png"))); // NOI18N
        boteliminarProveedor.setText("Eliminar");
        boteliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteliminarProveedorActionPerformed(evt);
            }
        });

        botguardarProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botguardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/diskette.png"))); // NOI18N
        botguardarProveedor.setText("Guardar");
        botguardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botguardarProveedorActionPerformed(evt);
            }
        });

        tableProveedores.setModel(modelTableProveedores);
        jScrollPane5.setViewportView(tableProveedores);

        jLabel17.setText("Buscar Proveedor");

        comboBusquedaProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboBusquedaProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruc", "Razon Social", "Tipo de Actividad", "Nombre de Representante", "Apellido de Representante", "Telefono", "Correo", " " }));

        txtcomboProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcomboProveedoresKeyReleased(evt);
            }
        });

        botlimpiarprov.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botlimpiarprov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/escoba.png"))); // NOI18N
        botlimpiarprov.setText("Limpiar");
        botlimpiarprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimpiarprovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(botguardarProveedor)
                                .addGap(81, 81, 81)
                                .addComponent(boteditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(boteliminarProveedor)
                                .addGap(93, 93, 93)
                                .addComponent(botlimpiarprov)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBusquedaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcomboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botguardarProveedor)
                    .addComponent(boteditarProveedor)
                    .addComponent(boteliminarProveedor)
                    .addComponent(botlimpiarprov))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBusquedaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcomboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Proveedores", jPanel4);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Registro Inventario");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        jLabel19.setText("Codigo de Producto");

        jLabel20.setText("Descripcion");

        jLabel21.setText("Precio de Compra sin Iva");

        jLabel23.setText("Cantidad de Producto");

        txtprecompra_siniva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecompra_sinivaKeyReleased(evt);
            }
        });

        txtprecompra_coniva.setEditable(false);

        jLabel27.setText("Precio de Compra con Iva");

        jLabel28.setText("Precio Mayorista");

        txtpreciomayorista.setEditable(false);

        jLabel29.setText("Precio Cliente Fijo");

        txtprecio_clientenormal.setEditable(false);

        jLabel30.setText("Precio Cliente Normal");

        jLabel31.setText("Fecha de caducacion");

        txtprecio_clientefijo.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtprecio_clientenormal)
                    .addComponent(txtpreciomayorista)
                    .addComponent(txtprecompra_coniva)
                    .addComponent(txtprecompra_siniva)
                    .addComponent(txtdespro)
                    .addComponent(txtcanpro)
                    .addComponent(txtprecio_clientefijo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcopro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtcopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtcanpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtdespro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtprecompra_siniva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtprecompra_coniva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtpreciomayorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtprecio_clientefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtprecio_clientenormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botguardarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botguardarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/diskette.png"))); // NOI18N
        botguardarprod.setText("Guardar");
        botguardarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botguardarprodActionPerformed(evt);
            }
        });

        boteditarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteditarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/edit.png"))); // NOI18N
        boteditarprod.setText("Editar");
        boteditarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditarprodActionPerformed(evt);
            }
        });

        boteliminarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boteliminarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/delete.png"))); // NOI18N
        boteliminarprod.setText("Eliminar");
        boteliminarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteliminarprodActionPerformed(evt);
            }
        });

        jTableProductos.setModel(modelTableProductos);
        jScrollPane7.setViewportView(jTableProductos);

        jLabel24.setText("Buscar Producto");

        comoboBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comoboBuscarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo de Producto", "Descripcion", "Precio de Compra", "Precio de Venta", "Cantidad de Producto" }));

        txtbusquedaComboProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaComboProductosKeyReleased(evt);
            }
        });

        botlimpiartodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botlimpiartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istloja/resouce/img/escoba.png"))); // NOI18N
        botlimpiartodo.setText("Limpiar Todo");
        botlimpiartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimpiartodoActionPerformed(evt);
            }
        });

        botlimpiarprecios.setText("Limpiar Precios");
        botlimpiarprecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimpiarpreciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(582, 582, 582))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(botguardarprod)
                                        .addGap(65, 65, 65)
                                        .addComponent(boteditarprod)
                                        .addGap(60, 60, 60)
                                        .addComponent(boteliminarprod)))
                                .addGap(0, 85, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(486, 486, 486)
                                .addComponent(botlimpiartodo)
                                .addGap(36, 36, 36)
                                .addComponent(botlimpiarprecios))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(comoboBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbusquedaComboProductos)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botguardarprod)
                    .addComponent(boteditarprod)
                    .addComponent(boteliminarprod)
                    .addComponent(botlimpiartodo)
                    .addComponent(botlimpiarprecios))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(comoboBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusquedaComboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Inventario", jPanel5);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Nota de Venta");

        jLabel40.setText("Producto");

        jLabel41.setText("Cantidad");

        jButton1.setText("Agregar");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel34.setText("Numero Nota de Venta");

        jLabel35.setText("Cedula o Ruc de Cliente");

        txtcedulaoruc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcedulaorucFocusLost(evt);
            }
        });
        txtcedulaoruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaorucKeyReleased(evt);
            }
        });

        jLabel36.setText("Nombre de Cliente");

        txtnombrecli.setEditable(false);

        jLabel37.setText("Direccion");

        txtdireccioncli.setEditable(false);

        jLabel38.setText("Telefono");

        txttelefonocli.setEditable(false);

        jLabel39.setText("Fecha Venta");

        txtfechaventa.setEditable(false);

        botlimpiarnota.setText("Limpiar");
        botlimpiarnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimpiarnotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtcedulaoruc)
                    .addComponent(txtnombrecli)
                    .addComponent(txttelefonocli))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfechaventa, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtdireccioncli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(botlimpiarnota)
                .addGap(366, 366, 366))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtcedulaoruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtnombrecli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtdireccioncli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txttelefonocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txtfechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botlimpiarnota)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Ventas", jPanel6);

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

        jMenu5.setText("Acerca de");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Metodos para busqueda por campos
    
    public void buscarPersonaPorCedula(){
    Persona persona = controladorPersona.buscarpersona(txtcedulaoruc.getText());
        personaEditar = persona;
        if (persona != null) {
            //txtcedula.setText(persona.getCedula());
            txtnombrecli.setText(persona.getNombres()+" "+persona.getApellidos());
            //txtapellidocli.setText(persona.getApellidos());
            txtdireccioncli.setText(persona.getDireccion());
            txttelefonocli.setText(persona.getTelefono());
            //txtcorreo.setText(persona.getCorreo());
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay ninguna persona registrada con esta cedula");
            txtcedula.setText("");
            txtcedula.requestFocus();        
        }   
    }
    public void buscarPersonaPorApellido(){
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
    }
    
    // Metodos para guardar
    
    public void guardarPersona(){
        if (controladorPersona.buscarpersona(txtcedula.getText())!=null) {
            JOptionPane.showMessageDialog(rootPane, "El numero de cedula ya se encuentra registrado en el sistema");
        }else{
            Persona personaGuardar = gestionPersona.guardarEditar(false);
            if (jDateFechaNacimiento.getDate()!=null) {
                personaGuardar.setFecha_nacimiento(jDateFechaNacimiento.getDate());
            }
            if (personaGuardar != null) {
                if(controladorPersona.registrarPersona(personaGuardar)){
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada correctamente");
                    gestionPersona.limpiarCamposPersona();
                    actualizarTabla();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona");
                }
            }

        }

    
    }
    public void guardarProveedor(){
        Proveedores proveedorGuardar = gestionProveedor.guardarEditar(false);
        if (proveedorGuardar != null) {
            if (controladorProveedor.registrarProveedor(proveedorGuardar)) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor guardado con éxito.");
            gestionProveedor.limpiarCamposProveedor();
            actializarTablaProveedor();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar el proveedor.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }
    public void guardarProducto(){
        Inventario productoGuardar = gestionInventario.guardarEditar(false);
        if (productoGuardar != null) {
            if(controladorInventario.registrarInventario(productoGuardar)){
                JOptionPane.showMessageDialog(rootPane, "Producto guardado correctamente");
                gestionInventario.limpiarcamposProducto();
                actualizarTablaProductos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede guardar el producto");
                }
            }

    }
    // Metodos para editar
    
    public void editarpersona(){
        
    if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar");
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar(true);
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.editarpersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito");
                gestionPersona.limpiarCamposPersona();
                personaEditar= null;
                actualizarTabla();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona");
            }
            
        }
    }
    public void editarproducto(){
        
    if (productoEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un producto seleccionado para editar");
            return;
        }
        Inventario productoEditarLocal = gestionInventario.guardarEditar(true);
        if (productoEditarLocal != null) {
            productoEditarLocal.setIdinventario(productoEditar.getIdinventario());
            if (controladorInventario.editarProducto(productoEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Producto editado con exito");
                gestionInventario.limpiarcamposProducto();
                productoEditar= null;
                actualizarTablaProductos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede editar el producto");
            }
            
        }
    }
    public void editarProveedor(){
        if (proveedorEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un proveedor seleccionado para editar");
            return;
        }
        Proveedores proveedorEditarLocal = gestionProveedor.guardarEditar(true);
        if (proveedorEditarLocal != null) {
            proveedorEditarLocal.setIdProveedor(proveedorEditar.getIdProveedor());
            if (controladorProveedor.editarProveedor(proveedorEditarLocal)) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor modificado con éxito.");
            gestionProveedor.limpiarCamposProveedor();
            actializarTablaProveedor();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede modificar el proveedor.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
    
    }
        
    // Metodos para eliminar 
    
    public void eliminarpersona(){
         
        
    if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay persona seleccionada para eliminar");
            return;
        }
       // Persona personaEliminarLocal = gestionPersona.guardarEditar();
        if (personaEditar != null) {
            personaEditar.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.eliminarpersona(personaEditar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada correctamente");
                gestionPersona.limpiarCamposPersona();
                personaEditar = null;
                actualizarTabla();
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar la persona");
            }
        }
    }
    public void eliminarproducto(){
    if (productoEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay persona seleccionada para eliminar");
            return;
        }
       
        if (productoEditar != null) {
            productoEditar.setIdinventario(productoEditar.getIdinventario());
            if (controladorInventario.eliminarProducto(productoEditar)) {
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado correctamente");
                gestionInventario.limpiarcamposProducto();
                productoEditar = null;
                actualizarTablaProductos();
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el producto");
            }
        }
    }
    public void eliminarProveedores(){
        if (proveedorEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un proveedor seleccionado para eliminar");
            return;
        }
        
        if (proveedorEditar != null) {
            proveedorEditar.setIdProveedor(proveedorEditar.getIdProveedor());
            if (controladorProveedor.eliminarProveedores(proveedorEditar)) {
                JOptionPane.showMessageDialog(rootPane, "Proveedor eliminado correctamente");
                gestionProveedor.limpiarCamposProveedor();
                proveedorEditar = null;
                actializarTablaProveedor();
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el proveedor");
            }
        }
        
    }
    // Metodos para actualizar las tablas
    void actualizarTabla(){
        List<Persona> tablaActualizada = controladorPersona.obtenerPersonas();
        
        modeloTablePersonaV2.setPersonas(tablaActualizada);
        modeloTablePersonaV2.fireTableDataChanged();
    }
    void actualizarTablaProductos(){
        List<Inventario> tablaActualizadas = controladorInventario.obtenerProductos();
        
        modelTableProductos.setInventario(tablaActualizadas);
        modelTableProductos.fireTableDataChanged();
    }
    void actializarTablaProveedor(){
        List<Proveedores>tablaActualizada = controladorProveedor.obtenerProveedores();
        modelTableProveedores.setProveedores(tablaActualizada);
        modelTableProveedores.fireTableDataChanged(); 
    
    }
    // Metodos para buscar por los combobox
    private void buscarComboClientes(){
         switch  (comboBusquedaClientes.getSelectedIndex()){
           case 0: // cedula
               modeloTablePersonaV2.setPersonas(controladorPersona.buscarcedula(txtParametroBusqueda.getText()));
               modeloTablePersonaV2.fireTableDataChanged();
               break;
           case 1:
               modeloTablePersonaV2.setPersonas(controladorPersona.buscarnombre(txtParametroBusqueda.getText()));
               modeloTablePersonaV2.fireTableDataChanged();
               break;
           case 2:
               modeloTablePersonaV2.setPersonas(controladorPersona.buscarapellidos(txtParametroBusqueda.getText()));
               modeloTablePersonaV2.fireTableDataChanged();
               break;
           case 3:
               modeloTablePersonaV2.setPersonas(controladorPersona.buscartelefonos(txtParametroBusqueda.getText()));
               modeloTablePersonaV2.fireTableDataChanged();
               break;
           case 4:
               modeloTablePersonaV2.setPersonas(controladorPersona.buscarcorreo(txtParametroBusqueda.getText()));
               modeloTablePersonaV2.fireTableDataChanged();
               break;
       }
    
    }
    private void buscarComboProductos(){
        switch (comoboBuscarProducto.getSelectedIndex()){
            case 0:
                modelTableProductos.setInventario(controladorInventario.buscarCodigo(txtbusquedaComboProductos.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
            case 1:
                modelTableProductos.setInventario(controladorInventario.buscarDescripcion(txtbusquedaComboProductos.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
            case 2:
                modelTableProductos.setInventario(controladorInventario.buscarPrecioCompra(txtbusquedaComboProductos.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
            case 3:
                modelTableProductos.setInventario(controladorInventario.buscarPrecioVenta(txtbusquedaComboProductos.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
            case 4:
                modelTableProductos.setInventario(controladorInventario.buscarCantidad(txtbusquedaComboProductos.getText()));
                modelTableProductos.fireTableDataChanged();    
                break;
        
        
        }
    }
    private void buscarComboProveedor(){
        switch (comboBusquedaProveedor.getSelectedIndex()){
            case 0:
                modelTableProveedores.setProveedores(controladorProveedor.buscarRuc(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 1:
                modelTableProveedores.setProveedores(controladorProveedor.buscarRazon(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 2:
                modelTableProveedores.setProveedores(controladorProveedor.buscarActividad(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 3:
                modelTableProveedores.setProveedores(controladorProveedor.buscarNombreRepresentante(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 4:
                modelTableProveedores.setProveedores(controladorProveedor.buscarApellidoRepresentante(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 5:
                modelTableProveedores.setProveedores(controladorProveedor.buscarTelefono(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
            case 6:
                modelTableProveedores.setProveedores(controladorProveedor.buscarNombreRepresentante(txtcomboProveedores.getText()));
                modelTableProveedores.fireTableDataChanged();    
                break;
        
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

    private void bottraerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottraerClienteActionPerformed
        List<Persona>obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size()-1);
        txtcedula.setText(personaEditar.getCedula());
        txtnombre.setText(personaEditar.getNombres());
        txtapellidos.setText(personaEditar.getApellidos());
        txtdireccion.setText(personaEditar.getDireccion());
        txtcorreo.setText(personaEditar.getCorreo());
        txttelefono.setText(personaEditar.getTelefono());
        combogenero.setSelectedItem(personaEditar.getGenero());
    }//GEN-LAST:event_bottraerClienteActionPerformed

    private void boteliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteliminarClienteActionPerformed
        eliminarpersona();
    }//GEN-LAST:event_boteliminarClienteActionPerformed

    private void boteditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditarClienteActionPerformed
        editarpersona();
               
    }//GEN-LAST:event_boteditarClienteActionPerformed

    private void botguardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botguardarClienteActionPerformed
        guardarPersona();
    }//GEN-LAST:event_botguardarClienteActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void botLimpiarCamposClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimpiarCamposClienteActionPerformed
        gestionPersona.limpiarCamposPersona();
    }//GEN-LAST:event_botLimpiarCamposClienteActionPerformed

    private void botguardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botguardarProveedorActionPerformed
        guardarProveedor();        
    }//GEN-LAST:event_botguardarProveedorActionPerformed

    private void botguardarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botguardarprodActionPerformed
        guardarProducto();
    }//GEN-LAST:event_botguardarprodActionPerformed

    private void boteditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditarProveedorActionPerformed
        editarProveedor();
    }//GEN-LAST:event_boteditarProveedorActionPerformed

    private void boteditarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditarprodActionPerformed
        editarproducto();
    }//GEN-LAST:event_boteditarprodActionPerformed

    private void boteliminarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteliminarprodActionPerformed
        eliminarproducto();
    }//GEN-LAST:event_boteliminarprodActionPerformed

    private void boteliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteliminarProveedorActionPerformed
        eliminarProveedores();
    }//GEN-LAST:event_boteliminarProveedorActionPerformed

    private void txtcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcedulaFocusLost
        if (jrbcedula.isSelected()) {
            if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Cedula no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            
            }else if (!utilidades.validadorDeCedula(txtcedula.getText())) {
            JOptionPane.showMessageDialog(this, "Los datos ingresados en la cedula son invalidos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
            
            }
        }else if (jrbpasaporte.isSelected()) {
            if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Pasaporte no tiene datos","ERROR",JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus(); // sirve para ubicar el cursor en el cuadro de texto
            }
            
            
        }
        
        
    }//GEN-LAST:event_txtcedulaFocusLost
    
    private void txtParametroBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroBusquedaKeyReleased
        buscarComboClientes();
    }//GEN-LAST:event_txtParametroBusquedaKeyReleased

    private void txtbusquedaComboProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaComboProductosKeyReleased
        buscarComboProductos();
    }//GEN-LAST:event_txtbusquedaComboProductosKeyReleased

    private void txtcomboProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomboProveedoresKeyReleased
        buscarComboProveedor();
    }//GEN-LAST:event_txtcomboProveedoresKeyReleased

    private void txtcedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaMouseEntered
        txtcedula.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_txtcedulaMouseEntered

    private void txtcedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaMouseExited
        txtcedula.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtcedulaMouseExited

    private void botLimpiarCamposClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botLimpiarCamposClienteMouseClicked
        JOptionPane.showMessageDialog(rootPane, "Has limpiado los campos correctamente");
    }//GEN-LAST:event_botLimpiarCamposClienteMouseClicked

    private void bottraerClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottraerClienteMousePressed
        bottraerCliente.setBackground(Color.red);
    }//GEN-LAST:event_bottraerClienteMousePressed

    private void bottraerClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottraerClienteMouseReleased
        bottraerCliente.setBackground(Color.white);
    }//GEN-LAST:event_bottraerClienteMouseReleased

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Acercade dialog = new Acercade(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void txtprecompra_sinivaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecompra_sinivaKeyReleased
       DecimalFormat df = new DecimalFormat("#.00");
    
       double valor = precioConIva(Double.parseDouble(txtprecompra_siniva.getText()));
        txtprecompra_coniva.setText(String.valueOf(df.format(valor)));
        txtpreciomayorista.setText(String.valueOf(df.format(precioMayorista(Double.parseDouble(txtprecompra_coniva.getText())))));
        txtprecio_clientefijo.setText(String.valueOf(df.format(precioClienteFijo(Double.parseDouble(txtprecompra_coniva.getText())))));
        txtprecio_clientenormal.setText(String.valueOf(df.format(precioNormal(Double.parseDouble(txtprecompra_coniva.getText())))));
     
    }//GEN-LAST:event_txtprecompra_sinivaKeyReleased
    public double precioConIva(double precioSinIva) {
        return ((precioSinIva * 0.12) + precioSinIva);
    }

    public double precioMayorista(double precioSinIva) {
        return ((precioSinIva * 0.10) + precioSinIva);
    }

    public double precioClienteFijo(double precioSinIva) {
        return ((precioSinIva * 0.12) + precioSinIva);
    }

    public double precioNormal(double precioSinIva) {
        return ((precioSinIva * 0.15) + precioSinIva);
    }
    
    private void botlimpiartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimpiartodoActionPerformed
        gestionInventario.limpiarcamposProducto();
    }//GEN-LAST:event_botlimpiartodoActionPerformed

    private void botlimpiarpreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimpiarpreciosActionPerformed
        gestionInventario.limpiarprecios();
    }//GEN-LAST:event_botlimpiarpreciosActionPerformed

    private void botlimpiarprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimpiarprovActionPerformed
        gestionProveedor.limpiarCamposProveedor();
    }//GEN-LAST:event_botlimpiarprovActionPerformed

    private void jrbcedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbcedulaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jrbpasaporte.setSelected(false);
        }
    }//GEN-LAST:event_jrbcedulaItemStateChanged

    private void jrbpasaporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbpasaporteItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            jrbcedula.setSelected(false);
        }
    }//GEN-LAST:event_jrbpasaporteItemStateChanged

    private void txtcedulaorucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcedulaorucFocusLost
       
    }//GEN-LAST:event_txtcedulaorucFocusLost

    private void txtcedulaorucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaorucKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
             buscarPersonaPorCedula();
        }
    }//GEN-LAST:event_txtcedulaorucKeyReleased

    private void botlimpiarnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimpiarnotaActionPerformed
        txtcedulaoruc.setText("");
        txtnombrecli.setText("");
        txtdireccioncli.setText("");
        txttelefonocli.setText("");
    }//GEN-LAST:event_botlimpiarnotaActionPerformed
    
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
    private javax.swing.JButton botLimpiarCamposCliente;
    private javax.swing.JButton boteditarCliente;
    private javax.swing.JButton boteditarProveedor;
    private javax.swing.JButton boteditarprod;
    private javax.swing.JButton boteliminarCliente;
    private javax.swing.JButton boteliminarProveedor;
    private javax.swing.JButton boteliminarprod;
    private javax.swing.JButton botguardarCliente;
    private javax.swing.JButton botguardarProveedor;
    private javax.swing.JButton botguardarprod;
    private javax.swing.JButton botlimpiarnota;
    private javax.swing.JButton botlimpiarprecios;
    private javax.swing.JButton botlimpiarprov;
    private javax.swing.JButton botlimpiartodo;
    private javax.swing.JMenuItem botmenubuscar;
    private javax.swing.JMenuItem botmenueditar;
    private javax.swing.JMenuItem botmenueliminar;
    private javax.swing.JButton bottraerCliente;
    private javax.swing.JComboBox<String> comboBusquedaClientes;
    private javax.swing.JComboBox<String> comboBusquedaProveedor;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JComboBox<String> comoboBuscarProducto;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private com.toedter.calendar.JDateChooser jDateProveedorVencimiento;
    private com.toedter.calendar.JDateChooser jDateVencimiento;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton jrbcedula;
    private javax.swing.JRadioButton jrbpasaporte;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTable tablacliente;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtactividad;
    private javax.swing.JTextField txtapellidop;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbusquedaComboProductos;
    private javax.swing.JTextField txtcanpro;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcedulaoruc;
    private javax.swing.JTextField txtcomboProveedores;
    private javax.swing.JTextField txtcopro;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreopro;
    private javax.swing.JTextField txtdespro;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccioncli;
    private javax.swing.JTextField txtdireccionpro;
    private javax.swing.JTextField txtfechaventa;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrecli;
    private javax.swing.JTextField txtnombrep;
    private javax.swing.JTextField txtprecio_clientefijo;
    private javax.swing.JTextField txtprecio_clientenormal;
    private javax.swing.JTextField txtpreciomayorista;
    private javax.swing.JTextField txtprecompra_coniva;
    private javax.swing.JTextField txtprecompra_siniva;
    private javax.swing.JTextField txtrazon;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefonocli;
    private javax.swing.JTextField txttelefonop;
    // End of variables declaration//GEN-END:variables
    @Override
    public void clickPersona(Persona p){
        
        txtcedula.setText(p.getCedula());
        txtnombre.setText(p.getNombres());
        txtapellidos.setText(p.getApellidos());
        txtdireccion.setText(p.getDireccion());
        txttelefono.setText(p.getTelefono());
        txtcorreo.setText(p.getCorreo());
        combogenero.setSelectedItem(p.getGenero());
        jDateFechaNacimiento.setDate(p.getFecha_nacimiento());
        personaEditar = p;
       
        
    }

    @Override
    public void clickProveedores(Proveedores p) {
        txtruc.setText(p.getRuc());
        txtrazon.setText(p.getRazonSocial());
        txtactividad.setText(p.getTipoActividad());
        txtnombrep.setText(p.getNombreRepresentante());
        txtapellidop.setText(p.getApellidoRepresentante());
        txttelefonop.setText(p.getTelefono());
        txtcorreopro.setText(p.getCorreo());
        txtdireccionpro.setText(p.getDireccionpro());
        jDateProveedorVencimiento.setDate(p.getFecha_vencimientop());
        
        proveedorEditar = p;
    }

    @Override
    public void clickInventario(Inventario i) {
        txtcopro.setText(i.getCoproducto());
        txtcanpro.setText(i.getCanproductos());
        txtdespro.setText(i.getDescripcion());
        txtprecompra_siniva.setText(i.getPreciocompra_sin_iva());
        txtprecompra_coniva.setText(i.getPreciocompra_con_iva());
        txtpreciomayorista.setText(i.getPreciomayorista());
        txtprecio_clientefijo.setText(i.getPreciocliente_fijo());
        txtprecio_clientenormal.setText(i.getPreciocliente_normal());
        jDateVencimiento.setDate(i.getFecha_caducidad());
        productoEditar = i;
        
    }
    
}


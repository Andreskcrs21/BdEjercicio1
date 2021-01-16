
package com.istl.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaPersona extends JFrame {
    private JPanel panel = new JPanel();
    private final JPanel panelTitulo = new JPanel();
    private final JPanel panelCuerpo = new JPanel();
    private final JPanel panelBoton = new JPanel();
    
    public VistaPersona() {
        //mostrar pantalla
        this.show();
        //titulo de la ventana
        this.setTitle("Ventana");
        //tmaño de la ventana
        this.setSize(300,200);
        //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        //EL layout se encarga de ordenar o Distribuir los componentes
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Registro de Personas.");
        panelTitulo.add(label);
        panel.add(panelTitulo);
        panel.add(label);
        //this.add(panel);`
        //this.add(panelTitulo);
        panelCuerpo.setLayout(new GridLayout(6,6));
        panelCuerpo.add(new JLabel("Cédula"));
        panelCuerpo.add(new JTextField("1105907834"));
        panelCuerpo.add(new JLabel("Nombre"));
        panelCuerpo.add(new JTextField("Andres"));
        panelCuerpo.add(new JLabel("Apellido"));
        panelCuerpo.add(new JTextField("Caceres"));
        panelCuerpo.add(new JLabel("Direccion"));
        panelCuerpo.add(new JTextField("Carigan"));
        panelCuerpo.add(new JLabel("Correo"));
        panelCuerpo.add(new JTextField("cacaceres@tecnologicoloja.edu.ec"));
        panelCuerpo.add(new JLabel("Telefono"));
        panelCuerpo.add(new JTextField("0997778422"));
        
        panel.add(panelCuerpo);
        this.add(panel);
        //Centrar la pantalla
        
        // Layout para ordenar los botones
        
        panelBoton.add(new JButton("Agregar"));
        panelBoton.add(new JButton("Editar"));
        panelBoton.add(new JButton("Eliminar"));
        panelBoton.add(new JButton("Registros"));
        
        panel.add(panelBoton);
        
        //this.setLocationRelativeTo(null);
        //Cerrar o dar fin a la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    


    }
    
}

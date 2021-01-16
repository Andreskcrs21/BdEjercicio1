/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import com.istl.vista.VistaPersona;
import com.istloja.conexionbd.BdEjercicio1;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;

/**
 *
 * @author IdeaPad - S340
 */
public class ConexionBaseDatos {
    public static void main(String[] args) {
        BdEjercicio1 con = new BdEjercicio1();
        con.getConexion();
        
        VistaPersona pe = new VistaPersona();
        
        
        
        //Persona p = new Persona();
        /*Personabd bd = new Personabd();
        
        p.setIdPersona(1);
        p.setCedula("1105907834");
        p.setNombres("Andres");
        p.setApellidos("Caceres");
        p.setDireccion("Carigan");
        p.setCorreo("andreskcrs282@gmail.com");
        p.setTelefono("0997778422");
        
        if (bd.registrarPersona(p)) {
            System.out.println("Registrado con Exito");
        }else{
            System.out.println("Error al registrar");
        }*/
        
        /*Persona pe = new Persona(1,"1135486214","Carlos Andres","Caceres Pineda","Barrio Carigan","andreskkcrskcd","09974521");
        Personabd per = new Personabd();
        per.editarpersona(pe);
        
        
        if (per.editarpersona(pe)) {
            System.out.println("Modificado Correctamente");
        }else{
            System.out.println("Error al modificar");
        }
        
        /*Personabd eli = new Personabd();
        eli.eliminarpersona();
        if (eli.eliminarpersona()) {
            System.out.println("Eliminado Correctamente");
        }else{
            System.out.println("Error al Eliminar");
        }*/
    }
}

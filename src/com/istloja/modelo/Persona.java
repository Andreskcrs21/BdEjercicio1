
package com.istloja.modelo;

import java.util.Date;

/**
 *
 * @author IdeaPad - S340
 */
public class Persona {
    private int idPersona;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private Date fecha_registro;
    private Date fecha_actializacion;
    private Date fecha_nacimiento;
    private String genero;

    public Persona(int idPersona, String cedula, String nombres, String apellidos, String direccion, String correo, String telefono, Date fecha_registro, Date fecha_actializacion, Date fecha_nacimiento, String genero) {
        this.idPersona = idPersona;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_registro = fecha_registro;
        this.fecha_actializacion = fecha_actializacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
    }

   

    
    public Persona(){
    
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_actializacion() {
        return fecha_actializacion;
    }

    public void setFecha_actializacion(Date fecha_actializacion) {
        this.fecha_actializacion = fecha_actializacion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", fecha_registro=" + fecha_registro + ", fecha_actializacion=" + fecha_actializacion + ", fecha_nacimiento=" + fecha_nacimiento + ", genero=" + genero + '}';
    }

   

    
    
    
}

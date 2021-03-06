/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

/**
 *
 * @author IdeaPad - S340
 */
public class Proveedores {
    private int idProveedor;
    private String ruc;
    private String RazonSocial;
    private String tipoActividad;
    private String nombreRepresentante;
    private String apellidoRepresentante;
    private String telefono;
    private String correo;
    
    public Proveedores(){
    }

    public Proveedores(int idProveedor, String ruc, String RazonSocial, String tipoActividad, String nombreRepresentante, String apellidoRepresentante, String telefono, String correo) {
        this.idProveedor = idProveedor;
        this.ruc = ruc;
        this.RazonSocial = RazonSocial;
        this.tipoActividad = tipoActividad;
        this.nombreRepresentante = nombreRepresentante;
        this.apellidoRepresentante = apellidoRepresentante;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getApellidoRepresentante() {
        return apellidoRepresentante;
    }

    public void setApellidoRepresentante(String apellidoRepresentante) {
        this.apellidoRepresentante = apellidoRepresentante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedores=" + idProveedor+ ", ruc=" + ruc + ", razonSocial=" + RazonSocial + ", tipoActividad=" + tipoActividad + ", nombreRepresentanteLegal=" + nombreRepresentante + ", ApellidosRepresentanteLegal=" + apellidoRepresentante + ", telefono=" + telefono + ", correo=" + correo + '}'; 
    }
    
    
}

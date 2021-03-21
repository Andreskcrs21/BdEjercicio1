/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

import java.util.Date;

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
    private String direccionpro;
    private Date fecha_registro;
    private Date fecha_actualizacion;
    private Date fecha_vencimientop;
    
    public Proveedores(){
    }

    public Proveedores(int idProveedor, String ruc, String RazonSocial, String tipoActividad, String nombreRepresentante, String apellidoRepresentante, String telefono, String correo, String direccionpro, Date fecha_registro, Date fecha_actualizacion, Date fecha_vencimientop) {
        this.idProveedor = idProveedor;
        this.ruc = ruc;
        this.RazonSocial = RazonSocial;
        this.tipoActividad = tipoActividad;
        this.nombreRepresentante = nombreRepresentante;
        this.apellidoRepresentante = apellidoRepresentante;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionpro = direccionpro;
        this.fecha_registro = fecha_registro;
        this.fecha_actualizacion = fecha_actualizacion;
        this.fecha_vencimientop = fecha_vencimientop;
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

    public String getDireccionpro() {
        return direccionpro;
    }

    public void setDireccionpro(String direccionpro) {
        this.direccionpro = direccionpro;
    }   

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Date getFecha_vencimientop() {
        return fecha_vencimientop;
    }

    public void setFecha_vencimientop(Date fecha_vencimientop) {
        this.fecha_vencimientop = fecha_vencimientop;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedor=" + idProveedor + ", ruc=" + ruc + ", RazonSocial=" + RazonSocial + ", tipoActividad=" + tipoActividad + ", nombreRepresentante=" + nombreRepresentante + ", apellidoRepresentante=" + apellidoRepresentante + ", telefono=" + telefono + ", correo=" + correo + ", direccionpro=" + direccionpro + ", fecha_registro=" + fecha_registro + ", fecha_actualizacion=" + fecha_actualizacion + ", fecha_vencimientop=" + fecha_vencimientop + '}';
    }
    

    
    

    

    

   
    
    
}

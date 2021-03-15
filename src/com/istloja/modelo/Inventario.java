
package com.istloja.modelo;

import java.util.Date;

/**
 *
 * @author IdeaPad - S340
 */
public class Inventario {
    private int idinventario;
    private String coproducto;
    private String canproductos;
    private String descripcion;    
    private String preciocompra_sin_iva;
    private String preciocompra_con_iva;
    private String preciomayorista;
    private String preciocliente_fijo;
    private String preciocliente_normal;
    private String fecha_caducidad;
    private Date fecha_registro;
    private Date fecha_actualizacion;
        
    public Inventario(){
    
    }
    public Inventario(int idinventario, String coproducto, String canproductos, String descripcion, String preciocompra_sin_iva, String preciocompra_con_iva, String preciomayorista, String preciocliente_fijo, String preciocliente_normal, String fecha_caducidad, Date fecha_registro, Date fecha_actualizacion) {
        this.idinventario = idinventario;
        this.coproducto = coproducto;
        this.canproductos = canproductos;
        this.descripcion = descripcion;        
        this.preciocompra_sin_iva = preciocompra_sin_iva;
        this.preciocompra_con_iva = preciocompra_con_iva;
        this.preciomayorista = preciomayorista;
        this.preciocliente_fijo = preciocliente_fijo;
        this.preciocliente_normal = preciocliente_normal;
        this.fecha_caducidad = fecha_caducidad;
        this.fecha_registro = fecha_registro;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public String getCoproducto() {
        return coproducto;
    }

    public void setCoproducto(String coproducto) {
        this.coproducto = coproducto;
    }

    public String getCanproductos() {
        return canproductos;
    }

    public void setCanproductos(String canproductos) {
        this.canproductos = canproductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreciocompra_sin_iva() {
        return preciocompra_sin_iva;
    }

    public void setPreciocompra_sin_iva(String preciocompra_sin_iva) {
        this.preciocompra_sin_iva = preciocompra_sin_iva;
    }

    public String getPreciocompra_con_iva() {
        return preciocompra_con_iva;
    }

    public void setPreciocompra_con_iva(String preciocompra_con_iva) {
        this.preciocompra_con_iva = preciocompra_con_iva;
    }

    public String getPreciomayorista() {
        return preciomayorista;
    }

    public void setPreciomayorista(String preciomayorista) {
        this.preciomayorista = preciomayorista;
    }

    public String getPreciocliente_fijo() {
        return preciocliente_fijo;
    }

    public void setPreciocliente_fijo(String preciocliente_fijo) {
        this.preciocliente_fijo = preciocliente_fijo;
    }

    public String getPreciocliente_normal() {
        return preciocliente_normal;
    }

    public void setPreciocliente_normal(String preciocliente_normal) {
        this.preciocliente_normal = preciocliente_normal;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
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

    

    @Override
    public String toString() {
        return "Inventario{" + "idinventario=" + idinventario + ", coproducto=" + coproducto + ", descripcion=" + descripcion + ", canproductos=" + canproductos + ", preciocompra_sin_iva=" + preciocompra_sin_iva + ", preciocompra_con_iva=" + preciocompra_con_iva + ", preciomayorista=" + preciomayorista + ", preciocliente_fijo=" + preciocliente_fijo + ", preciocliente_normal=" + preciocliente_normal + ", fecha_caducidad=" + fecha_caducidad + ", fecha_registro=" + fecha_registro + ", fecha_actualizacion=" + fecha_actualizacion + '}';
    }
    

 
    
    
}

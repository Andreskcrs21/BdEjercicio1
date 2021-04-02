
package com.istloja.modelo;

import java.util.Date;

/**
 *
 * @author IdeaPad - S340
 */
public class Venta {
    int idnotaventa;
    String numero_notaventa;
    int persona_idpersona;
    Date fecha_venta;
    Double subtotal;
    Double iva;
    Double total;
    String tipo_pago;

    public Venta(int idnotaventa, String numero_notaventa, int persona_idpersona, Date fecha_venta, Double subtotal, Double iva, Double total, String tipo_pago) {
        this.idnotaventa = idnotaventa;
        this.numero_notaventa = numero_notaventa;
        this.persona_idpersona = persona_idpersona;
        this.fecha_venta = fecha_venta;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.tipo_pago = tipo_pago;
    }
    
    public Venta(){}

    public int getIdnotaventa() {
        return idnotaventa;
    }

    public void setIdnotaventa(int idnotaventa) {
        this.idnotaventa = idnotaventa;
    }

    public String getNumero_notaventa() {
        return numero_notaventa;
    }

    public void setNumero_notaventa(String numero_notaventa) {
        this.numero_notaventa = numero_notaventa;
    }

    public int getPersona_idpersona() {
        return persona_idpersona;
    }

    public void setPersona_idpersona(int persona_idpersona) {
        this.persona_idpersona = persona_idpersona;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    @Override
    public String toString() {
        return "Venta{" + "idnotaventa=" + idnotaventa + ", numero_notaventa=" + numero_notaventa + ", persona_idpersona=" + persona_idpersona + ", fecha_venta=" + fecha_venta + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", tipo_pago=" + tipo_pago + '}';
    }
    
    
    
    
}

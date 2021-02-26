
package com.istloja.modelo;

/**
 *
 * @author IdeaPad - S340
 */
public class Inventario {
    private int idinventario;
    private String coproducto;
    private String descripcion;
    private String preciocompra;
    private String precioventa;
    private String canproductos;
    
    public Inventario(){
    
    }

    public Inventario(int idinventario, String coproducto, String descripcion, String preciocompra, String precioventa, String canproductos) {
        this.idinventario = idinventario;
        this.coproducto = coproducto;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.canproductos = canproductos;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(String preciocompra) {
        this.preciocompra = preciocompra;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }

    public String getCanproductos() {
        return canproductos;
    }

    public void setCanproductos(String canproductos) {
        this.canproductos = canproductos;
    }

   

   
    

    @Override
    public String toString() {
        return "Inventario{" + "idinventario=" + idinventario+ ", coproducto=" + coproducto + ", descripcion=" + descripcion + ", preciocompra=" + preciocompra + ", precioventa=" + precioventa + ", canproductos=" + canproductos + '}';
    }
    

 
    
    
}

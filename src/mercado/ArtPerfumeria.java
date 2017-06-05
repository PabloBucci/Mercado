/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

/**
 *
 * @author Pablo
 */
public class ArtPerfumeria extends Producto{
    
    private final int contenido;

    public ArtPerfumeria(String nombreDelProducto, int contenido, float precio) {
        super(nombreDelProducto, precio);
        this.contenido = contenido;
    }

    @Override
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String getProducto() {
        return producto;
    }

    @Override
    public float getPrecio() {
        return precio;
    }
 
    @Override
    public String toString() {
        return ("Nombre: " + this.producto + " /// Contenido: " + this.contenido + "cc /// Precio: " + this.precio);
    }  
}

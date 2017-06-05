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
public class Producto {
    private String producto;
    private String unidad;
    private Double contenido;
    private Double precio;
    
    public Producto (String nombreDelProducto, String unidad, Double contenido, Double precio){
        this.producto = nombreDelProducto;
        this.unidad = unidad;
        this.contenido = contenido;
        this.precio = precio;
    }
    
    public void setProducto (String nombreDelProducto){
        this.producto = nombreDelProducto;
    }
    
    public String getProducto (){
        return this.producto;
    }
    
    public void setUnidad (String unidad){
        this.unidad = unidad;
    }
    
    public String getUnidad (){
        return this.unidad;
    }
    
    public void setContenido (Double contenido){
        this.precio = contenido;
    }
    
    public Double getContenido (){
        return this.contenido;
    }
    
    public void setPrecio (Double precio){
        this.precio = precio;
    }
    
    public Double getPrecio (){
        return this.precio;
    }
    
    public String toString() {
        return ("Nombre: " + this.producto + " /// " + this.unidad + ": "+ this.contenido + " /// Precio: " + this.precio);
    }    
}


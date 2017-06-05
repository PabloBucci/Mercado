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
    String producto;
    float precio;
    
    public Producto (String nombreDelProducto, float precio){
        this.producto = nombreDelProducto;
        this.precio = precio;
    }
    
    public void setProducto (String nombreDelProducto){
        this.producto = nombreDelProducto;
    }
    
    public String getProducto (){
        return this.producto;
    }
          
    public void setPrecio (float precio){
        this.precio = precio;
    }
    
    public float getPrecio (){
        return this.precio;
    }
    
    public String toString() {
        return ("Nombre: " + this.producto + " /// " + " /// Precio: " + this.precio);
    }    
}


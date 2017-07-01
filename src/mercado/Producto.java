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
public abstract class Producto {
    String producto;
    Float precio;
    Producto getPrecio;
    
    public Producto (String nombreDelProducto, Float precio){
        this.producto = nombreDelProducto;
        this.precio = precio;
    }
    
    public void setProducto (String nombreDelProducto){
        this.producto = nombreDelProducto;
    }
    
    public String getProducto (){
        return this.producto;
    }
       
    public void setPrecio (Float precio){
        this.precio = precio;
    }
    
    public float getPrecio (){
        return this.precio;
    }
    
    public int compareTo (Producto otroProducto){
        return this.precio.compareTo(otroProducto.precio);
}
}


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
    
    private final Integer contenido;

    public ArtPerfumeria(String nombreDelProducto, Integer contenido, Float precio) {
        super(nombreDelProducto, precio);
        this.contenido = contenido;
    }
 
    @Override
    public String toString() {
        return ("Nombre: " + this.producto + " /// Contenido: " + this.contenido + "cc /// Precio: " + this.precio);
    }  
}

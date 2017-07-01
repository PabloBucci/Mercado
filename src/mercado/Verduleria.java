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
public class Verduleria extends Producto {
    private final String unidadDeVenta;
    
    public Verduleria(String nombreDelProducto, String unidadDeVenta, Float precio) {
        super(nombreDelProducto, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }
    
    @Override
    public String toString() {
        return ("Nombre: " + this.producto + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadDeVenta);
    }      
}

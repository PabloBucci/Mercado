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
public class Gaseosa extends Producto {
    private Float litros;
    
    public Gaseosa(String nombreDelProducto, Float litros, Float precio) {
        super(nombreDelProducto, precio);
        this.litros = litros;
    }

    public void setLitros(Float litros) {
        this.litros = litros;
    }

    public float getLitros() {
        return litros;
    }
     
    @Override
    public String toString() {
        return ("Nombre: " + this.producto + " /// Litros: " + this.litros + " /// Precio: " + precio); 
    }
}

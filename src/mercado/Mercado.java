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
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ListaDeProductos productos = new ListaDeProductos();    
    productos.listarProductos();
    System.out.println("=============================");
    System.out.println("Producto más caro: " + productos.productoMasCaro().getProducto());
    System.out.println("Producto más barato: " + productos.productoMasBarato().getProducto());
    }
}

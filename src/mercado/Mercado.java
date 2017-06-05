/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.LinkedList;
import java.util.List;

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
        List<Producto> productos = new LinkedList<>();
        
        productos.add(new Producto("Coca-Cola Zero", "Lt", 1.50, 20.00));
        productos.add(new Producto("Coca-Cola", "Lt", 1.50, 18.00));
        productos.add(new Producto("Shampoo Sedal", "CC", 500.00, 30.00));//Supongo que es un error de tipeo y asumo 500CC
        productos.add(new Producto("Frutillas", "Kg", 1.00, 64.00));
        
        for (Producto e: productos){
            System.out.println(e);
        }
    }
    
}

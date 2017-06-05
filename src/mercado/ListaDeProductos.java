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
public class ListaDeProductos {
    List<Producto> productos = new LinkedList<>();
        
    ListaDeProductos(){ 
        productos.add(new Gaseosa("Coca-Cola Zero", 1, 20));
        productos.add(new Gaseosa("Coca-Cola", 1, 18));
        productos.add(new ArtPerfumeria("Shampoo Sedal", 500, 30));//Supongo que es un error de tipeo y asumo 500CC
        productos.add(new Verduleria("Frutillas", "Kilo", 64));
    }
    
    public void listarProductos(){
        for (Producto e: productos){
            System.out.println(e);
        }
    }
    
}

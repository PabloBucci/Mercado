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
        productos.add(new Gaseosa("Coca-Cola Zero", new Float (1.5), new Float(20)));
        productos.add(new Gaseosa("Coca-Cola", new Float(1.5), new Float(18)));
        productos.add(new ArtPerfumeria("Shampoo Sedal", 500, new Float(30)));//Supongo que es un error de tipeo y asumo 500CC
        productos.add(new Verduleria("Frutillas", "Kilo", new Float(64)));
    }
    
    public void listarProductos(){
        for (Producto p: productos){
            System.out.println(p);
        }
    }
    
    public Producto productoMasCaro(){
        Producto masCaro = productos.get(1);
        for (Producto p: productos){
           if (p.getPrecio() > masCaro.getPrecio() ){
               masCaro = p;
           }
        }
        return masCaro;
    }

    public Producto productoMasBarato(){
        Producto masBarato = productos.get(1);
        for (Producto p: productos){
           if (p.getPrecio() < masBarato.getPrecio() ){
               masBarato = p;
           }
        }
        return masBarato;
    }
    
}

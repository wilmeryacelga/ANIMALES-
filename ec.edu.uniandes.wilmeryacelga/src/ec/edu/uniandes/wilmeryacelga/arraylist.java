/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.wilmeryacelga;

import java.util.ArrayList;
import ec.edu.uniandes.wilmeryacelga.clsProducto;
/**
 *
 * @author Pollo
 */
public class arraylist {
    
    public static void main(String[] args) {
        
        ArrayList<clsProducto> producto = new ArrayList<clsProducto>();
    clsProducto p0 = new clsProducto (0,"clavo", 20, clsProducto.unidad.libras);
    clsProducto p1 = new clsProducto (1,"aceite", 10, clsProducto.unidad.litro);         
    clsProducto p2 = new clsProducto (2,"pollo", 20, clsProducto.unidad.libras) ;
    clsProducto p3 = new clsProducto (3,"queso", 16, clsProducto.unidad.libras) ;
    clsProducto p4 = new clsProducto (4,"leche", 83, clsProducto.unidad.libras);
    
            
            
            producto.add(p0);
            producto.add(p1);
            producto.add(p2);
            producto.add(p3);
            producto.add(p4);
            imprimir(producto);
    }
    



private static void imprimir(ArrayList<clsProducto> producto) {
    
    for (clsProducto product : producto)
    {
        
     
        System.out.println("***************");
        System.out.println(" Id: "+ product.Id());
        System.out.println(" Nombre: " + product.Nombre());
        System.out.println(" Valor: " + product.Valor());
        System.out.println(" Unidad:" + product.Unidad());
        System.out.println("");
}  
}
}
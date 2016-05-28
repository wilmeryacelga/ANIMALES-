/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animales;

import java.util.ArrayList;
import animales.clsTipoAnimales ;

/**
 *
 * @author Pollo
 */
public class Animales {


    public static void main(String[] args) {
        
    ArrayList<clsTipoAnimales> animales = new ArrayList<>();
    clsTipoAnimales p0 = new clsTipoAnimales (0,"vaca", 100, clsTipoAnimales .Tipo.vertebrados);
    clsTipoAnimales p1 = new clsTipoAnimales (1,"leon", 150, clsTipoAnimales .Tipo.vertebrados);         
    clsTipoAnimales p2 = new clsTipoAnimales (2,"elefante", 300, clsTipoAnimales .Tipo.vertebrados) ;
    clsTipoAnimales p3 = new clsTipoAnimales (3,"yena", 80, clsTipoAnimales .Tipo.vertebrados) ;
    clsTipoAnimales p4 = new clsTipoAnimales (4,"cocodrillo", 90, clsTipoAnimales .Tipo.vertebrados);
    clsTipoAnimales p5 = new clsTipoAnimales (5,"leopardo", 90, clsTipoAnimales .Tipo.vertebrados);
    clsTipoAnimales p6 = new clsTipoAnimales (6,"medusa", 90, clsTipoAnimales .Tipo.invertebrados);
    clsTipoAnimales p7 = new clsTipoAnimales (7,"angila", 10, clsTipoAnimales .Tipo.invertebrados);
    clsTipoAnimales p8 = new clsTipoAnimales (8,"gusano de tierra", 05, clsTipoAnimales .Tipo.invertebrados);
    clsTipoAnimales p9 = new clsTipoAnimales (9,"araña", 07, clsTipoAnimales .Tipo.invertebrados);
    clsTipoAnimales p10 = new clsTipoAnimales (10,"estrella de mar", 02, clsTipoAnimales .Tipo.invertebrados);
    clsTipoAnimales p11 = new clsTipoAnimales (11,"alpaca", 50, clsTipoAnimales .Tipo.mamiferos);         
    clsTipoAnimales p12 = new clsTipoAnimales (12,"cerdo", 160, clsTipoAnimales .Tipo.mamiferos) ;
    clsTipoAnimales p13 = new clsTipoAnimales (13,"llama", 85, clsTipoAnimales .Tipo.mamiferos) ;
    clsTipoAnimales p14 = new clsTipoAnimales (14,"conejo", 15, clsTipoAnimales .Tipo.mamiferos);
    clsTipoAnimales p15 = new clsTipoAnimales (15,"oso", 100, clsTipoAnimales .Tipo.mamiferos);
    clsTipoAnimales p16 = new clsTipoAnimales (16,"paloma", 100, clsTipoAnimales .Tipo.oviparos);
    clsTipoAnimales p17 = new clsTipoAnimales (17,"trucha", 100, clsTipoAnimales .Tipo.oviparos);
    clsTipoAnimales p18 = new clsTipoAnimales (18,"lagartija", 100, clsTipoAnimales .Tipo.oviparos);
    clsTipoAnimales p19 = new clsTipoAnimales (19,"serpiente", 100, clsTipoAnimales .Tipo.oviparos);
    clsTipoAnimales p20 = new clsTipoAnimales (20,"tortuga", 100, clsTipoAnimales .Tipo.oviparos);
    
    
    animales .add(p0);
            animales .add(p1);
            animales .add(p2);
            animales .add(p3);
            animales .add(p4);
            animales .add(p5);
            animales .add(p6);
            animales .add(p7);
            animales .add(p8);
            animales .add(p9);
            animales .add(p10);
            animales .add(p11);
            animales .add(p12);
            animales .add(p13);
            animales .add(p14);
            animales .add(p15);
            animales .add(p16);
            animales .add(p17);
            animales .add(p18);
            animales .add(p19);
            animales .add(p20);
            
            imprimir( animales );
    }
    
    
    private static void imprimir(ArrayList<clsTipoAnimales > animales) {
    
    for (clsTipoAnimales product : animales)
    {
        
     
        System.out.println("***************");
        System.out.println(" Id: "+ product.Id());
        System.out.println(" Nombre: " + product.Nombre());
        System.out.println(" Peso:" + product.Peso());
        System.out.println(" Tipo:" + product.Tipo());
        System.out.println("");
}  
}
}

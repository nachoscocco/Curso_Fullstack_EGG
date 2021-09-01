    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import Entity.Caballo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
    /*    Animal bicho = new Perro("Mancha","carne",10,"dogo");
        Animal bicho2 = new Gato("Michi","Pescado",12,"michi");
        Animal bicho3 = new Caballo("rayo","pasto",5,"pingo");*/
        
        ArrayList<Perro> listPerro = new ArrayList();
        
        boolean op =true;
        
        //carga de arraylist
        while( op ==true){
            Perro perroAux = new Perro();
            System.out.println("Ingre nombre del perro, alimento, edad y raza");
            perroAux.setNombre(leer.next());
            perroAux.setAlimento(leer.next());
            perroAux.setEdad(leer.nextInt());
            perroAux.setRaza(leer.next());
            listPerro.add(perroAux);
        
            System.out.println("Desea continuar s /n");
            if(leer.next().equalsIgnoreCase("N")){
                op =false;
            }
        
        }
        // recorrer un arraylist
        
        for (Perro perro : listPerro) {
            
           
            System.out.println(perro.toString());
            
        }
        
        
       
       
        
        
        
    }
    
}











































































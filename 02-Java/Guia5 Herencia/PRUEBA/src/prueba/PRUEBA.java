/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Entity.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PRUEBA {
 static Scanner leer  = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
       
        Persona persona1  = new Persona(42557656,"Nacho","Scocco",21);
        Persona persona2  = new Persona(43557656,"Pibe","play",22);
        
        Persona persona3  = new Persona(44333222,"Juan","Perez",11);
        Persona persona4  = new Persona(1122334,"Emilia","Martinez",25);
        
        ArrayList<Persona> arrList = new ArrayList();
        HashSet<Persona>   hashList = new HashSet();
        
        arrList.add(persona1);
        arrList.add(persona2);
        arrList.add(persona3);
        arrList.add(persona4);
        
        hashList.add(persona1);
        hashList.add(persona2);
        hashList.add(persona3);
        hashList.add(persona4);
        
   /*     System.out.println("--------Array List ------------");
        for (Persona object : arrList) {
            cont++;
            System.out.println("Persona num= "+cont);
            System.out.println(object.toString());
            
            
        }
        System.out.println("--------HASH SET ------------");
        cont=0;
        for (Persona persona : hashList) {
            cont++;
            System.out.println("Persona num= "+cont);
            System.out.println(persona.toString());
        }
        
        Collections.sort(arrList, 
            (Persona p1, Persona p2) -> p1.getDni().compareTo(p2.getDni()));    
     
        
        
        System.out.println("--------Array List post orden------------");
        for (Persona object : arrList) {
            
            cont++;
            System.out.println("Persona num= "+cont);
            System.out.println(object.toString());
             
        }
        
        */
    System.out.println("--------HASH SET ------------");
        cont=0;
        for (Persona persona : hashList) {
            cont++;
            System.out.println("Persona num= "+cont);
            System.out.println(persona.toString());
        }
        eliminarElemento(hashList);
      
    System.out.println("--------HASH SET ------------");
        cont=0;
        for (Persona persona : hashList) {
            cont++;
            System.out.println("Persona num= "+cont);
            System.out.println(persona.toString());
        }    
       
    
    }
    
    
   // 
    public void agregarElemento(HashSet<Persona> list ){
        Persona aux = new Persona();
        
        System.out.println("Ingrese dni, nombre , apellido y edad");
        aux.setDni(leer.nextInt());
        aux.setNombre(leer.next());
        aux.setApellido(leer.next());
        aux.setEdad(leer.nextInt());
        
        list.add(aux);
       
    }
    
   //eliminar 
    public static  void eliminarElemento(HashSet<Persona> list){
       System.out.println("Ingrese un dni a eliminar");
       Integer dni = leer.nextInt();
       Iterator<Persona> itList = list.iterator();
       
       while(itList.hasNext()){
           
           if(itList.next().getDni().equals(dni)){
                 itList.remove();
                 
           }
      }
   
   }
    
    
   public static void modificarElemento()
    
    
}

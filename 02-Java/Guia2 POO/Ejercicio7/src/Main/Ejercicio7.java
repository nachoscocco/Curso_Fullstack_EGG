/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Persona;
import Services.PersonaService;

/**
 *
 * @author nacho
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona newPibe = new Persona();
        PersonaService servPersona = new PersonaService();
        
        newPibe = servPersona.crearPersona(newPibe);
        
        System.out.println("////////////");
        System.out.println(newPibe.toString());
        
        System.out.println("//////////////");
        System.out.println("CALCULAREMOS IMC :D");
        System.out.println(servPersona.calculaIMC(newPibe));
        
        System.out.println("//////////////");
        System.out.println("ES MAYOR DE EDAD?");
        if(servPersona.mayorEdad(newPibe) ){
            System.out.println("es mayor de edad :D");
            System.out.println("Tiene :" + newPibe.getEdad()+" años");
        }else{
        
            System.out.println("es menor de edad :C ");
            System.out.println("Tiene :" + newPibe.getEdad()+" años");
        }
        
        
    }
    
}

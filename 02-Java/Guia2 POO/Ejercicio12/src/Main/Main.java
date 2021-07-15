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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            PersonaService sp  = new PersonaService();
            Persona persTest   = new Persona();
            
            sp.creaPersona(persTest);
            persTest.muestraPers();
        System.out.println(sp.edadActual(persTest));    
        System.out.println("Yo soy mayor que esa persona=??? "+sp.menorQue(23, persTest));
            
            
    }
    
}

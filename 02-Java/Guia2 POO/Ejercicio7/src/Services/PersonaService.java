/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Persona;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PersonaService {
    
    Persona varPers = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(Persona varPers){
        
        System.out.println("Ingrese nombre");
        varPers.setNombre(leer.next());
        //
        System.out.println("Ingrese edad");
        varPers.setEdad(leer.nextInt());
        //
        System.out.println("Ingrese Sexo ( M / F / O)");
        char sexo = leer.next().charAt(0);
        varPers.setSexo(sexo);
        while( sexo!='M' && sexo != 'F' && sexo != 'O' && sexo!='m' && sexo != 'f' && sexo != 'o'  ){
            System.out.println("ERROR! INGRESE UN SEXO CORRECTO (M / F /O)");
             sexo = leer.next().charAt(0);
             varPers.setSexo(sexo);
        }
        //
        System.out.println("Ingrese altura (m)");
        varPers.setAltura(leer.nextDouble());
        //
        System.out.println("Ingrese peso (kg)");
        varPers.setPeso(leer.nextDouble());
        
      
    return varPers;
    }
    
    
    public int calculaIMC(Persona varPers){
 
     Double peso = varPers.getPeso();
     Double altura = varPers.getAltura();
     
     Double imc;
     
     imc = peso/(altura*altura );
        if (imc < 20) {
            return -1;
            
        }else if((imc >=20) && (imc < 25)){
           return 0;
        }else {
           return 1;
        }
      
    }
    
    public boolean mayorEdad(Persona varPers){
      boolean mayorEdad = false;
        if( (varPers.getEdad()) < 21 ){
            
            // return false;
            return mayorEdad;
        }else{
            //return true;
            mayorEdad=true;
            return mayorEdad;
        
        }
      }
    
    
}

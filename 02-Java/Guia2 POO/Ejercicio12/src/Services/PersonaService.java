/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Entity.Persona;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class PersonaService {
    
    
    
    
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void creaPersona(Persona pers){
    
        System.out.println("Ingrese nombre");
        pers.setNombre(leer.next());
        System.out.println("ingrese DIA, MES Y AÑO");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        Date auxDate = new Date(año-1900,mes-1,dia);
        
        pers.setFechaN(auxDate);
    
    }
    
    public long edadActual(Persona pers){
        long edad=0;
        Date nowDate = new Date();
        
        Date nacPers = pers.getFechaN();
        int mesNow = nowDate.getMonth() + 1;
        int mesNac = nacPers.getMonth() + 1;
        int diaNow = nowDate.getDate();
        int diaNac = nacPers.getDate();
        
        if (mesNow >=  mesNac) {
          if(diaNow >=  diaNac) {
            edad = nowDate.getYear()-nacPers.getYear();    
         }else{
            edad = nowDate.getYear()-nacPers.getYear();
            edad = edad-1;
        }
        } 
        else{
            edad = nowDate.getYear()-nacPers.getYear();
            edad = edad-1;
         
        }
       
        return edad;
        
    }
    
    
    public boolean menorQue(long edad, Persona pers){
    boolean menor = false;
    
    long edadPers=this.edadActual(pers);
    
    if(edadPers>edad){
        menor = true;
    }
    
    return menor;
    } 
   
    
    
    
    
}

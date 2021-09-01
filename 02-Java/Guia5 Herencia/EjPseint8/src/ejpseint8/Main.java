/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpseint8;

import java.util.Scanner;

///. Realizar un procedimiento que permita realizar la división entre dos números 
//y muestre
//el cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el
//divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y
//el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
//50 ? 13 = 37 una resta realizada
//37 ? 13 = 24 dos restas realizadas
//24 ? 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3

public class Main {

   
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un dividendo");
        int x= leer.nextInt();
        System.out.println("Ingrese un divisor ");
        int y= leer.nextInt();
        if (evaluar(x,y)){
         divisionXResta( x, y);
        }else{
            System.out.println("curtite");
        }
        
   
   
    }
    
    public static boolean evaluar (int div1 , int div2){
    boolean s = false;
    
        if ((div1 >=  div2 ) && (div1 != 0 ||div2 != 0 )){
        s = true;
        
        }
    
    
    return s;
    }
                                          //50   //13
    public static void divisionXResta(int div1, int div2){
        int cociente = 0;
        int res ;
        
        do{
            
        res = div1 - div2;
        div1 = res;
        cociente++;
        
        } while( res > div2 );
        
        
        System.out.println("El residuo es  = "+ res);
        System.out.println("El cociente es = "+cociente);
    
    
    
    }
}

/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 *
 */
package EJ20;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EJ20 {

   
     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer num1,num2,num3,num4;
       
        
        num1=cargaNum();
        num2=cargaNum();
        num3=cargaNum();
        num4=cargaNum();
        muestraNum( num1);
        muestraNum( num2);
        muestraNum( num3);
        muestraNum( num4);
        
       
        
      
        
        
        
        
    }
    
    
    public static Integer cargaNum(){
        Integer num;
        Scanner leer = new Scanner(System.in);
          do {       
            System.out.println("Ingrese un numero de 1 a 20");
            num = leer.nextInt();
             
        } while ((num<1)||(num>20));
          return num;
        
    }
    
    public static void muestraNum(Integer num){
         System.out.print(num+" ");
         for (int i = 0 ; i < num; i++) {
             System.out.print("*");
           
            
        }
         System.out.println(" ");
        
        
    }
    
}

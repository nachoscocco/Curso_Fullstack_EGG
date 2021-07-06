/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
 */
package EJ09;

import java.util.Scanner;

public class EJ9 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese una frase :D");
        String frase = teclado.nextLine();
        do { 
            System.out.println("Erronea, ingrese un teclado");
             frase = teclado.nextLine();
             System.out.println("frase "+frase);
         
  
        }while( !frase.equalsIgnoreCase("eureka") );
        
        System.out.println("salio con la frase"+frase);
        
     
    }

}

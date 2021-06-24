/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EJ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String va
        
        System.out.println("Ingrese un numero a calcular el doble triple y su raiz");
        
        Double num = input.nextDouble();
        System.out.println(num+"x2 = "+ num*2 );
        System.out.println(num+"x3 = "+ num*3);
        System.out.println("√"+num+" = "+Math.sqrt(num) );

    }
}

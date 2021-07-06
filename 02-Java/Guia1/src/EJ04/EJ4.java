/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ04;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una frase!!");
        String frase = teclado.nextLine();

        System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        System.out.println("Su frase en minusculs es " + frase.toLowerCase());

    }

}

/*Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
package EJ15;

import java.util.Scanner;

public class EJ15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        String op2;
        Integer num1, num2;

        System.out.println("Ingrese el numero 1");
        num1 = input.nextInt();
        System.out.println("Ingrese el numero ");
        num2 = input.nextInt();
        do {

            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            op = input.nextByte();
            System.out.println(op);
            op2="N";
            switch (op) {
                case 1: 
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    
                    break;
                case 2:
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    
                    break;
                case 3:
                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                    
                    break;
                case 4:
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    
                    break;
                case 5:
                    System.out.println("esta seguro que desea salir ??(S/N)");
                    op2 =input.next();
                    op2=op2.toLowerCase();
                    
                    

                    break;
                default:
                    throw new AssertionError();
            }
        }while ( op2.equals("n") || op != 5)  ;

    }

}



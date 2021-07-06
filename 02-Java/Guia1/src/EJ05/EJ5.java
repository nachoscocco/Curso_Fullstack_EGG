package EJ05;

import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese grados celcius a convertir");
        Double grC = input.nextDouble();
        Double grF = 32 + (9 * grC / 5);
        System.out.println(grC+"°C == "+grF+"°F");

    }

}

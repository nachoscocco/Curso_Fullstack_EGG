/*
    Crea una aplicación que a través de una función nos convierta una cantidad de
    euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €

 */
package EJ21;

import java.util.Scanner;


public class EJ21 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Double cantEur;
       int intento=0;
       String moneda;
        System.out.println("Ingrese cant de euros a convertir");
        cantEur = leer.nextDouble();
       
        
       do{
            if (intento >=1) {
               System.out.println("ERROR!");
               
           }
           
        System.out.println("Ingrese moneda a convertir (yen libra o dolar)");
        moneda = leer.next(); //yen euro o dolar
        moneda = moneda.toLowerCase();
          
        intento++;
        
       }while( !moneda.equals("yen") && !moneda.equals("libra") && !moneda.equals("dolar") );
        
        System.out.println("Euros ingresados= " +cantEur );
        System.out.println("Se paso a "+fn_convierteMoneda(cantEur,moneda)+" "+moneda);
        
    }
    
    
    public static Double fn_convierteMoneda(Double euros, 
                                            String money){
       Double cantDinero = euros;
     
       
       switch(money){
           case "dolar":
               cantDinero = euros * (1.28611);
               break;
            case "yen":
               cantDinero = euros * (129.852);
               break;
            case "libra":
               cantDinero = euros * (0.86);
               break;
               
            default: 
                   System.out.println("ERROR, MONEDA ERRONEA");
       
       }
       
       return cantDinero;
        
    }
    
}

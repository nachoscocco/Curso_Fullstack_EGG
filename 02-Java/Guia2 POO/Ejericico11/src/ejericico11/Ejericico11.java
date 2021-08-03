/*
.
12.
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío. 
 */
package ejericico11;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejericico11 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE DIA MES AÑO RESPECTIVAMENTE ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        
        
        LocalDate fechaRandom = LocalDate.of(año, mes, dia);    //CARGA MANUAL
        LocalDate fechaNow = LocalDate.now();                //FECHA DE ESTE INSTANTE
        
        
        System.out.println("fecha especifica con LocalDate ="+ fechaRandom);
        System.out.println("FECHA NOW ==="+fechaNow);
        System.out.println("getMonth() "+fechaRandom.getMonth());
        System.out.println("getDayOfMonth()"+fechaRandom.getDayOfMonth());
        System.out.println("getYear() "+fechaRandom.getYear());
     
        int varEdad = fechaNow.getYear()- fechaRandom.getYear();
        
       if (fechaRandom.getDayOfYear()> fechaNow.getDayOfYear()) {
        varEdad = varEdad - 1;
    }
        System.out.println("Mi edad es ==" + varEdad);
    
  }
}
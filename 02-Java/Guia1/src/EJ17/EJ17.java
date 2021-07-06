/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investig
*/
package EJ17;

import java.util.Scanner;


public class EJ17 {

  
    public static void main(String[] args) {
        String cadena;
        int c=0,cGod=0,cBad=0;
        
        Scanner leer = new Scanner(System.in);
        String firstCh,lastCh;
        do {            
            System.out.println("ingrese la cadena numero:"+(c+1));
            cadena=leer.nextLine();
            firstCh =cadena.substring(0,1);
            lastCh  =cadena.substring((cadena.length()-1),(cadena.length()));
           /* System.out.println("firstch "+firstCh);
            System.out.println("lastch "+lastCh);
            System.out.println("firstCh.equals(X) "+ firstCh.equals("X"));
            
            System.out.println("(lastCh.equals(0) "+lastCh.equals("O"));*/
            
            if ((firstCh.equals("X")) && (lastCh.equals("O")) && (cadena.length()==5)){cGod++;}
            else{cBad++;}
            c++;
        } while (!cadena.equals("&&&&&"));
        
         
        
        System.out.println("INFORME FINAL:");
        System.out.println("CANTIDAD DE LECTURAS= "+(c-1));
        System.out.println("LECTURAS CORRECTAS=   "+cGod);
        System.out.println("LECTURAS INCORRECTAS= "+(cBad-1));
        
        
    }
    
}

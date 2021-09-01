package integrador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practica {

    
//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
     
    public Boolean numeroCapicua(Integer num) {
        
        //LA EXPRESION NO PUEDE SER NULA 
        Boolean esPalindromo = false;
        Integer numCopy;
        Integer numAux=0;
        
        if(num != null){
            //LO VUELVO ABSOLUTO
            num = Math.abs(num);
            numCopy = num;
            while(num>0){
            numAux = num % 10 + numAux * 10;
            num = num/10;
            
            }
            if(numAux.equals(numCopy)){
                esPalindromo = true;
            }else{
             esPalindromo = false;
            }
          
        }else{
        esPalindromo = false;
         numCopy = num;
        }
        
        System.out.println(" el numero "+ numCopy +" esPalindromo= "+esPalindromo);
        return esPalindromo;
        
        
        
    }

    
//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
     
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
    
       
       
        int ultPreso = inicio+ (cantidadCaramelos - 1) ;         
            if (ultPreso > cantidadLadrones) {             
                ultPreso = ultPreso % (cantidadLadrones);       
            }    
       
        return ultPreso;
    }
        
    

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    
    public List<String> mediasAmigas(List<String> pasajeros) {
        HashSet<String> sinRep = new HashSet(pasajeros);
        ArrayList<String> parejitas = new ArrayList();
      
        for (String sr : sinRep) {
            int oc = 0;
            for (String pasajero : pasajeros) {
                 System.out.println("pasajero num "+pasajero);
                
                if(pasajero.equals(sr)){
                    oc++;
                    System.out.println("Tiro equals :: "+pasajero+" = "+sr);
                     if(oc==2){
                     System.out.println("oc = 2 con letra ="+sr);
                     parejitas.add(pasajero);
                 }
                } 
            }   
        }
       
        return  parejitas ;
    }
    
    
  
    
    
    
}



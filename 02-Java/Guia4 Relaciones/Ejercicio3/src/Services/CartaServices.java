/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Entity.Carta;
import Entity.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class CartaServices {
    
  
    
    public void cargarCartas(ArrayList<Carta> baraja ){
        Palo arrPalo[] = Palo.values();    //creo el array de palos con los 4 palos disponibles
        Carta auxCarta ;                   // creo un auxiliar de carta 
                int countPalo=0;
                int countNumcarta=1;
      
            for (int i = 0; i < 40; i++) {
                auxCarta = new Carta();            // vacio el auxiliar para posteriormente ingresarle datos
               if (countNumcarta==8){                //si contador es 8 se saltea al 10 ya q no contemplamos las cartas num 8 y 9
                   countNumcarta= countNumcarta + 2; 
                   
               }
                auxCarta.setNumeroCarta(countNumcarta);             //seteo el numero de carta con el contador
                auxCarta.setPaloCarta(arrPalo[countPalo]);           //seteo el palo con el auxPalo que tiene los 4 palos   {ESPADA,BASTO,COPA,ORO}
               
               if (countNumcarta ==12){              //si la carta es 12 cambio el palo y reseteo el cont de cartas 
                   countNumcarta =0;
                   countPalo++;
                   
               }
               baraja.add(auxCarta);   //agrego la carta a la arraylist baraja 
               
               countNumcarta++;
             
            }
       
    
    
    }
    public void barajarCartas(ArrayList<Carta> baraja){
        Collections.shuffle(baraja);
    
    }
    
    public void mostrarCartas(ArrayList<Carta> baraja){
    for (Carta carta : baraja) {
            System.out.println(carta.toString());
            
            
        }
     }
    
    public void mostrarCarta(Carta carta){
        System.out.println(carta.toString());
     }
    
    public void siguienteCarta(ArrayList<Carta> baraja,ArrayList<Carta> descarte){
        int index= baraja.size();
         if((index-1)==0){
            System.out.println("te quedaste sin cartas");
        }else{
        //System.out.println("INDICE:::"+index);
        System.out.println("get "+baraja.get(index-1));
        Carta auxCarta=baraja.get(index-1);
       // this.mostrarCarta(auxCarta);
        descarte.add(auxCarta);
        baraja.remove(index-1);
         }
       
    }
    
    public void darCartas(int cantCartas, ArrayList<Carta> baraja ,ArrayList<Carta> descarte ){
      int index= baraja.size();
      if(cantCartas<=index){
          for (int i = 0; i < cantCartas; i++) {
              Carta auxCarta=baraja.get(index-1);
              descarte.add(auxCarta);
              baraja.remove(index-1);
              index--;
              
          }
          System.out.println("Se retiraron "+cantCartas+" cartas (cartas disponibles "+index+" )");
      
      }
      else{
          System.out.println("No puede retirar esa cantidad");
          System.out.println("Cartas disponibles :"+index);
         
      }
    
    
    
    
    }
    
    
    
}

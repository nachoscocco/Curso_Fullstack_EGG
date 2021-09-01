/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Carta;
import Entity.Palo;
import Services.CartaServices;
import java.util.ArrayList;
public class Ejercicio3 {

   
    public static void main(String[] args) {
      // Palo auxPalo[] = Palo.values();
       
      //  System.out.println("palo:"+ auxPalo[0]);
      
      ArrayList<Carta> baraja = new ArrayList();
      ArrayList<Carta> descarte = new ArrayList();
      CartaServices servCarta = new CartaServices();
      servCarta.cargarCartas(baraja);
      servCarta.barajarCartas(baraja);
      servCarta.mostrarCartas(baraja);
        System.out.println("/********************************/");
        servCarta.siguienteCarta(baraja,descarte);
        servCarta.darCartas(10, baraja,descarte);
        System.out.println("/************** DESCARTE ******************/");

        servCarta.mostrarCartas(descarte);
      
     
     // servCarta.mostrarCartas(baraja);
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Alquiler;
import Entity.Barco;
import Entity.Motorizado;
import Entity.Velero;
import Entity.Yate;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class EjercicioExt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Barco> listB = new ArrayList(); 
       Alquiler alqui = new Alquiler();
       Barco bar1 = new Velero(2,"JJJ",11,2014);
       Barco bar2 = new Motorizado(11,"FFF",11,2014);
       Barco bar3 = new Yate(10,45,"III",11,2014);
       
        System.out.println("BARCO =="+bar1.toString());
        System.out.println("BARCO =="+bar2.toString());
        System.out.println("BARCO =="+bar3.toString());
       listB.add(bar1);
       listB.add(bar2);
       listB.add(bar3);
       
       alqui.creaAlquiler(listB);
       
        
    }
    
}

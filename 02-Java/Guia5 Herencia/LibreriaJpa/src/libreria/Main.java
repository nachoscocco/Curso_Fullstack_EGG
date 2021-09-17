/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.services.LibroService;

/**
 *
 * @author nacho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        LibroService ls = new LibroService();
      //  Autor autor = new Autor("")
        
        ls.creaLibro( "Libro", 1500, 1600, autor, editorial); 
        
    }
    
}

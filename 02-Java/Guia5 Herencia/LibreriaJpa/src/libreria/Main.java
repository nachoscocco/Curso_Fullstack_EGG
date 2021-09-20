/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.services.AutorService;
import libreria.services.EditorialService;
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
     try{
        LibroService ls = new LibroService();
      //  Autor autor = new Autor("")4
      EditorialService es  = new EditorialService();
      AutorService as = new AutorService();
      
    //  es.crearEditorial("Book2");
    //  as.crearAutor("Sabato");
        
        ls.creaLibro( "Libro piola ", 1500, 1600, as.obtenerAutorPorId(251), es.obtenerEditorialrPorId(1)); 
     }
     catch(Exception ex){
         System.out.println("ex"+ex); 
     }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;


/**
 *
 * @author nacho
 */
public class AutorDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJpaPU");
    private final EntityManager em = emf.createEntityManager();
    
     public void guardarAutor(Autor autor) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(autor); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
     
     public void modificarAutor(Autor autor) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(autor); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }
       public void eliminarAutor(Integer id) throws Exception {
        Autor autor = buscarAutorPorId(id);
        em.getTransaction().begin(); //Inicio   
        em.remove(autor);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
       
        public Autor buscarAutorPorId(Integer id) throws Exception {
        Autor autor = em.find(Autor.class, id); // Para traer objeto con el ID
        return autor;
      }
        
        public Autor buscarAutorPorNombre(String nombre) throws Exception {
        Autor autor = (Autor) em.createQuery("SELECT l FROM Autor l WHERE l.nombre LIKE :nombre")
                .setParameter("nombre", nombre)
                .getSingleResult();

        return autor;
    }
        
    
}

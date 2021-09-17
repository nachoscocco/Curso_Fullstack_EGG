/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;
import libreria.entidades.Editorial;

/**
 *
 * @author nacho
 */
public class EditorialDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJpaPU");
    private final EntityManager em = emf.createEntityManager();
    
     public void guardarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(editorial); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
     
     public void modificarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(editorial); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }
       public void eliminarEditorial(Integer id) throws Exception {
        Editorial editorial = buscarEditorialPorId(id);
        em.getTransaction().begin(); //Inicio   
        em.remove(editorial);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
       
        public Editorial buscarEditorialPorId(Integer id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id); // Para traer objeto con el ID
        return editorial;
    }
        
          public List<Editorial> listarEditoriales() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT l FROM Editorial l")
                .getResultList();
        return editoriales;
          
          }
    
}

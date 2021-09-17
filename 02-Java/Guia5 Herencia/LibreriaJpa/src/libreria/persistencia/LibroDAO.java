/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nacho
 */
public class LibroDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJpaPU");
    private final EntityManager em = emf.createEntityManager();
    
     public void guardarLibro(Libro libro) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(libro); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
     
     public void modificarLibro(Libro libro) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(libro); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }
       public void eliminarLibro(Integer isbn) throws Exception {
        Libro libro = buscarLibroPorId(isbn);
        em.getTransaction().begin(); //Inicio   
        em.remove(libro);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
       
     public Libro buscarLibroPorId(Integer isbn) throws Exception {
        Libro libro = em.find(Libro.class, isbn); // Para traer objeto con el ID
        return libro;
    }
    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo)
                .getSingleResult();

        return libro;
    }
          
    public List<Libro> buscarLibrosPorAutor(String nombre) throws Exception {
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l "
                                            + "JOIN l.autor a "
                                            + "WHERE a.nombre LIKE :nombre ")
                .setParameter("nombre", nombre)
                .getResultList();

        return libros;
    }
    
    public List<Libro> buscarLibrosEditorial(String nombre) throws Exception {
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l "
                                            + "JOIN l.editorial e "
                                            + "WHERE e.nombre LIKE :nombre ")
                .setParameter("nombre", nombre)
                .getResultList();

        return libros;
    }
        
        public List<Libro> listarLibros() throws Exception {
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l")
                .getResultList();
        return libros;
    } 
        public  List<Libro> obtenerLibroPorAutor(Integer id_autor) throws Exception {
           
           List<Libro> libros = em.createQuery(" SELECT l from Libro l WHERE l.id_autor = :id_autor")
                    .setParameter("id_autor", id_autor)
                    .getResultList();
                    
            
            
            return libros;
        }
        
        public  List<Libro> obtenerLibroPorEditorial(Integer id_editorial) throws Exception {
           
           List<Libro> libros = em.createQuery(" SELECT l from Libro l WHERE l.id_editorial = :id_editorial")
                    .setParameter("id_editorial", id_editorial)
                    .getResultList();
                    
            
            
            return libros;
        }
    
}

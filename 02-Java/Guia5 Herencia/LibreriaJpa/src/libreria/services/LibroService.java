
package libreria.services;

import java.util.UUID;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;


public class LibroService {
    public final LibroDAO ldao = new LibroDAO();
    
    public void creaLibro( String titulo, Integer anio, Integer ejemplares, Autor autor, Editorial editorial){
    Libro libroNew = new Libro();
    try{
        if(titulo == null || titulo.trim().isEmpty()){
            
            throw new Exception("Pibe no seas boludo ingresame un titulo valido");
            
        }
  
        libroNew.setTitulo(titulo);
        libroNew.setAnio(anio);
        libroNew.setEjemplares(ejemplares);
        libroNew.setEjemplaresRestantes(ejemplares);
        libroNew.setEjemplaresPrestados(0);
        libroNew.setAlta(true);
        libroNew.setAutor(autor);
        libroNew.setEditorial(editorial);
        ldao.guardarLibro(libroNew);
        
        }
    catch(Exception ex){
      System.out.println("No se creeo el usuario"+ ex.getMessage());
    }
    
        
        
    }
    
}

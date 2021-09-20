/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.services;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author nacho
 */
public class AutorService {
    AutorDAO ad = new AutorDAO();
    
    
    public void crearAutor( String nombre) throws Exception{
        Autor autor = new Autor();
        try{
        Autor editorial =new Autor();
         if(nombre == null || nombre.trim().isEmpty()){
            
            throw new Exception("Pibe no seas boludo ingresame un nombre valido");
            
        }
         boolean alta = true;
         autor.setAlta(alta);
         autor.setNombre(nombre);
      //   autor.setId(obtenerUltimoId());
         ad.guardarAutor(autor);
        }
        catch(Exception ex){
         System.out.println("No se creo el autor (AutorService/crearAutor)"+ ex.getMessage());
        }
        
    
    }
    
    public Autor obtenerAutorPorId(Integer id) throws Exception{
        try{
            Autor autAux = new Autor();
            autAux = ad.buscarAutorPorId(id);
            return autAux;
        }
        catch(Exception ex){
            throw new Exception("Fallo en obtension de id (AutorService/obtenerAutorPorId)");
        }
    }
    
    
    
    public Integer obtenerUltimoId(){
      Integer id = 0;  
    try{
   
      List<Autor> auList=  ad.listarAutores();
    
     Autor auaux = auList.get(auList.size()-1);
        System.out.println("edaux linea 52 =="+auaux.toString());
     if(auaux == null ){
     id = 0;
     }else{
     id = (auaux.getId())+1;
         
     }
    
    return id;
    }
    catch(Exception ex){
     System.out.println("No se obtuvo el id(AutorService/obtenerId)"+ ex.getMessage());
     return id=null;
    }
   }
}

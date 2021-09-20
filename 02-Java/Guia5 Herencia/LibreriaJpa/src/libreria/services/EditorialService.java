/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author nacho
 */
public class EditorialService {
    
    public final EditorialDAO ed = new EditorialDAO();
    
    public void crearEditorial( String nombre) throws Exception{
        
        try{
        Editorial editorial =new Editorial();
         if(nombre == null || nombre.trim().isEmpty()){
            
            throw new Exception("Pibe no seas boludo ingresame un nombre valido");
            
        }

         boolean alta = true;
         editorial.setAlta(alta);
         editorial.setNombre(nombre);
         editorial.setId(obtenerUltimoId());
         ed.guardarEditorial(editorial);
        }
        catch(Exception ex){
         System.out.println("No se creo la Editorial =?"+ ex.getMessage());
        }
        
    
    }
    
    
    
    public Editorial obtenerEditorialrPorId(Integer id) throws Exception{
        try{
            Editorial edAux = new Editorial();
            edAux = ed.buscarEditorialPorId(id);
            return edAux;          

        }
        catch(Exception ex){
            throw new Exception("Fallo en obtension de id (EditorialService/obtenerEditorialrPorId)");
        }
    }
    
    public Integer obtenerUltimoId(){
      Integer id = 0;  
    try{
   
      List<Editorial> edList =  ed.listarEditoriales();
    
     Editorial edaux=edList.get(edList.size()-1);
        System.out.println("edaux linea 52 =="+edaux.toString());
     if(edaux == null ){
     id = 0;
     }else{
     id = (edaux.getId())+1;
         
     }
    
    return id;
    }
    catch(Exception ex){
     System.out.println("No se creeo el usuario"+ ex.getMessage());
     return id=null;
    }
   }
    
    
}

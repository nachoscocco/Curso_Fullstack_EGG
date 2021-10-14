/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.services;

import com.inicio.web.entitys.Autor;
import com.inicio.web.errors.ServiceError;
import com.inicio.web.repository.AutorRepository;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    private AutorRepository autorRepository;
    
    public void altaAutor(String nombre) throws ServiceError{
    
       Autor autor = new Autor();
       
       if(nombre ==null || nombre.isEmpty()){
           throw new ServiceError("El nombre del usuario no puede ser nulo");    
        }
        autor.setNombre(nombre);
        autor.setAlta(true);
        autor.setFecha_alta(new Date());
        
        autorRepository.save(autor);
    }
    
    public void modifAutor(String id_autor, String nombreMod) throws ServiceError{
    
      // 
       
       Optional<Autor> resp = autorRepository.findById(id_autor);
      if(resp.isPresent()){          //pregunto si existe respuesta
          
          Autor autor = resp.get();
          
        if(nombreMod ==null || nombreMod.isEmpty()){
            throw new ServiceError("El nombre del usuario no puede ser nulo");    
         }
         autor.setNombre(nombreMod);

         autorRepository.save(autor);
      }else{
          throw new ServiceError("Autor no encontrado");
      }
    }
    
    public void bajaAutor(String id_autor) throws ServiceError{
    
       
       Optional<Autor> resp = autorRepository.findById(id_autor);
       if(resp.isPresent()){  
           Autor autor = resp.get();
            autor.setAlta(Boolean.FALSE);
            autorRepository.save(autor);
        }else{
          throw new ServiceError("Autor no encontrado");
        }
    }
    
    public Boolean validaAutor(String id_autor) {
        Boolean validate = false;
        Optional<Autor> resp = autorRepository.findById(id_autor);
        
        if(resp.isPresent()){
            validate = true;
        }
        return validate;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.services;

import com.inicio.web.entitys.Editorial;
import com.inicio.web.errors.ServiceError;
import com.inicio.web.repository.EditorialRepository;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EditorialService {
    
    @Autowired
    EditorialRepository editorialRepository;
    
    @Transactional
     public void altaEditorial(String nombre) throws ServiceError{
    
       Editorial editorial = new Editorial();
       
       if(nombre ==null || nombre.isEmpty()){
           throw new ServiceError("El nombre de editorial no puede ser nulo");    
        }
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        editorial.setFecha_alta(new Date());
        
        editorialRepository.save(editorial);
    }
    
    public void modifEditorial(String id_editorial, String nombreMod) throws ServiceError{
    
       Optional<Editorial> resp = editorialRepository.findById(id_editorial);
       
       if(resp.isPresent()){
            Editorial editorial = resp.get();

            if(nombreMod ==null || nombreMod.isEmpty()){
                throw new ServiceError("El nombre de editorial no puede ser nulo");    
              }
            editorial.setNombre(nombreMod);
            editorialRepository.save(editorial);
       }else{
            throw new ServiceError("Editorial no encontrado");
        }
    }
    
    public void bajaEditorial(String id_editorial) throws ServiceError{
    
        Optional<Editorial> resp = editorialRepository.findById(id_editorial);
       
        if(resp.isPresent()){
            Editorial editorial = resp.get();
            editorial.setAlta(Boolean.FALSE);
            editorialRepository.save(editorial);
        }else{
            throw new ServiceError("Editorial no encontrado");
        }
        
    }
    
    public Boolean validadEditorial(String id_editorial) {
        Boolean validate = false;
        Optional<Editorial> resp = editorialRepository.findById(id_editorial);
        
        if(resp.isPresent()){
            validate = true;
        }
        return validate;
    }
}

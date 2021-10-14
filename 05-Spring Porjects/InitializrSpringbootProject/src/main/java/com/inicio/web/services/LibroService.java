/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.services;

import com.inicio.web.entitys.Autor;
import com.inicio.web.entitys.Editorial;
import com.inicio.web.entitys.Libro;
import com.inicio.web.enums.Genero;
import com.inicio.web.errors.ServiceError;
import com.inicio.web.repository.AutorRepository;
import com.inicio.web.repository.EditorialRepository;
import com.inicio.web.repository.LibroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;
    
    @Autowired 
    private AutorRepository autorRepository;
    
    @Autowired
    private EditorialRepository editorialRepository;
    
    @Autowired 
    private EditorialService eService;
    
    @Autowired 
    private AutorService aService;
    
    public void altaLibro(Long isbn ,
                          String titulo,
                          Integer anio,
                          Integer ejemplares,
                          Integer ejemplaresPrestados,
                          Integer ejemplaresRestantes,
                          Genero genero,
                          String id_autor,
                          String id_editorial) throws ServiceError{
      
      //validacion
      validaLibro(isbn,titulo,anio,ejemplares,ejemplaresPrestados,ejemplaresRestantes,genero,id_autor,id_editorial);
      Autor autor = autorRepository.buscarAutorPorId(id_autor);
      Editorial editorial = editorialRepository.buscarEditorialPorId(id_editorial);
      
      Libro libroNew = new Libro();
      libroNew.setIsbn(isbn);
      libroNew.setTitulo(titulo);
      libroNew.setAlta(true);
      libroNew.setAnio(anio);
      libroNew.setEjemplares(ejemplares);
      libroNew.setEjemplaresPrestados(ejemplaresPrestados);
      libroNew.setEjemplaresRestantes(ejemplaresRestantes);
      libroNew.setGenero(genero);
      libroNew.setAutor(autor);
      libroNew.setEditorial(editorial);
      libroRepository.save(libroNew);
  
    }
    
    public void modificarLibro(Long isbn ,
                                String id_libro,
                                String titulo,
                                Integer anio,
                                Integer ejemplares,
                                Integer ejemplaresPrestados,
                                Integer ejemplaresRestantes,
                                Genero genero,
                                String id_autor,
                                String id_editorial) throws ServiceError{
    
        validaLibro(isbn,titulo,anio,ejemplares,ejemplaresPrestados,ejemplaresRestantes,genero,id_autor,id_editorial);

        Optional<Libro> resp = libroRepository.findById(id_libro);

        if(resp.isPresent()){
            Libro libroNew =resp.get();
            if((libroNew.getAutor().getId_autor().equals(id_autor)) && libroNew.getEditorial().getId_editorial().equals(id_editorial) ){
                libroNew.setIsbn(isbn);
                libroNew.setTitulo(titulo);
                libroNew.setAnio(anio);
                libroNew.setEjemplares(ejemplares);
                libroNew.setEjemplaresPrestados(ejemplaresPrestados);
                libroNew.setEjemplaresRestantes(ejemplaresRestantes);
                libroNew.setGenero(genero);
                libroRepository.save(libroNew);
            }else{
                throw new ServiceError("Editorial o Autor invalidos");
            }  
        }else{
            throw new ServiceError("ML:La modificacion es invalida");
        }

    }
    
    public void bajaLibro(Long isbn ,
                                String id_libro,
                                String titulo,
                                Integer anio,
                                Integer ejemplares,
                                Integer ejemplaresPrestados,
                                Integer ejemplaresRestantes,
                                Genero genero,
                                String id_autor,
                                String id_editorial) throws ServiceError{
    
        validaLibro(isbn,titulo,anio,ejemplares,ejemplaresPrestados,ejemplaresRestantes,genero,id_autor,id_editorial);

        Optional<Libro> resp = libroRepository.findById(id_libro);

        if(resp.isPresent()){
            Libro libroNew =resp.get();
            if((libroNew.getAutor().getId_autor().equals(id_autor)) && libroNew.getEditorial().getId_editorial().equals(id_editorial) ){

                libroNew.setAlta(false);
                libroRepository.save(libroNew);
                
            }else{
                throw new ServiceError("Editorial o Autor invalidos");
            }  
        }else{
            throw new ServiceError("BL:La modificacion es invalida");
        }

    }
    
    
    
    
    public void validaLibro(Long isbn ,
                          String titulo,
                          Integer anio,
                          Integer ejemplares,
                          Integer ejemplaresPrestados,
                          Integer ejemplaresRestantes,
                          Genero genero,
                          String id_autor,
                          String id_editorial) throws ServiceError{
        
        if((isbn == 0)||( isbn == null)){
      throw new ServiceError("El isbn es incorrecto");
      }
      
      if(titulo.isEmpty()|| titulo == null){
      throw new ServiceError("El ititulo es incorrecto");
      }
      
      if((anio == 0)||( anio == null)){
      throw new ServiceError("El año es incorrecto");
      }
      
      if((ejemplares == 0)||( ejemplares == null) || (ejemplares < ejemplaresPrestados)|| (ejemplares < ejemplaresRestantes)){    
      throw new ServiceError("El numero de ejemplares es incorrecto"
              + "Recuerda: los ejemplares no pueden ser menores a los ejemplaresRestantes ni ejemplaresPrestados, tampoco pueden ser 0");
      }
      
      if((ejemplaresPrestados == 0)||(ejemplaresPrestados == null)){
          throw new ServiceError("El numero de ejemplares prestados es incorrecto");
      } 
      
      if((ejemplaresRestantes == 0)||(ejemplaresRestantes == null)){
          throw new ServiceError("El numero de ejemplares restantes es incorrecto");
      }
      
      if(genero ==null){
          throw new ServiceError("El genero es invalido");
      }
      if( !(aService.validaAutor(id_autor))){
          throw new ServiceError("El autor es invalido o no existe");
      }
      if( !(eService.validadEditorial(id_editorial))){
          throw new ServiceError("La editorial es invalido o no existe"); 
      }
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.repository;

import com.inicio.web.entitys.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface AutorRepository extends JpaRepository<Autor,String>{
   
    @Query("SELECT a FROM Autor a WHERE a.id_autor = :id_autor")
    public Autor buscarAutorPorId(@Param("id_autor") String id_autor);
    
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Autor buscarAutorPorNombre(@Param("nombre") String nombre);
    
}

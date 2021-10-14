/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.repository;

import com.inicio.web.entitys.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EditorialRepository extends JpaRepository<Editorial,String>{
    
    @Query("SELECT e FROM Editorial e WHERE e.id_editorial = :id")
    public Editorial buscarEditorialPorId(@Param("id")String id);
    
    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    public Editorial buscarEditorialPorNombre(@Param("nombre")String nombre);
    
}

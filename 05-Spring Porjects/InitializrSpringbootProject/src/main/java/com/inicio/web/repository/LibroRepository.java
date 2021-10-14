

package com.inicio.web.repository;

import com.inicio.web.entitys.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface LibroRepository extends JpaRepository<Libro , String> {
    
    @Query("SELECT l FROM Libro l where l.autor.nombre = :nombre")
    public List<Libro> buscarLibrosPorNomAutor(@Param("nombre")String nombre);
    
    @Query("SELECT l FROM Libro l where l.editorial.nombre = :nombre")
    public List<Libro> buscarLibrosPorNomEditorial(@Param("nombre")String nombre);
    
    @Query("SELECT l FROM Libro l WHERE l.genero LIKE :g")
    public List<Libro> buscarLbrosPorGenero(@Param("g")String genero);
    
}

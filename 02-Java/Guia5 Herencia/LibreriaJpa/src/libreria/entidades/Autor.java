/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;


@Entity
public class Autor {
    
    @Id
    @GeneratedValue
    private Integer id;
    private boolean alta;
    private String nombre;
    @OneToMany(mappedBy = "autor", 
               fetch = FetchType.EAGER, 
               cascade = CascadeType.REMOVE)//Como se llama el atributo de la otra tabla que se relaciona
    private List<Libro> libros;

    public Autor() {
    }

    public Autor(Integer id, boolean alta, String nombre) {
        this.id = id;
        this.alta = alta;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

   
    
    
    
}

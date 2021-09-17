/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import com.sun.istack.internal.NotNull;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Editorial {
    
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private boolean alta;
    @NotNull
    @Column(unique=true)
    private String nombre;
    
    @OneToMany(mappedBy = "editorial", 
               fetch = FetchType.EAGER, 
               cascade = CascadeType.REMOVE)//Como se llama el atributo de la otra tabla que se relaciona
    private List<Libro> libros;

    public Editorial() {
    }

    public Editorial(Integer id, boolean alta, String nombre) {
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

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", alta=" + alta + ", nombre=" + nombre + ", libros=" + libros + '}';
    }
    
    


   

    
    
    
}

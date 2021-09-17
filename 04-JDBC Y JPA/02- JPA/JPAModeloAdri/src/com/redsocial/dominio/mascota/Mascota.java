package com.redsocial.dominio.mascota;

import com.redsocial.dominio.usuario.Usuario;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // Anotacion para decir que es una Entidad, es decir una tabla
public class Mascota {

    @Id // Declaro que el siguiente atributo sera el ID
    @GeneratedValue
    private String id;
    private String apodo;
    private String raza;
    @ManyToOne // La relacion si fue declarada onetomany en la otra, debo declararla aca
    @JoinColumn(name = "duenio_id")
    private Usuario duenio;

    public Mascota() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Usuario getDuenio() {
        return duenio;
    }

    public void setDuenio(Usuario duenio) {
        this.duenio = duenio;
    }

    
    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", apodo=" + apodo + ", raza=" + raza + '}';
    }

}

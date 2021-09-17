package com.redsocial.dominio.usuario;

import com.redsocial.dominio.direccion.Direccion;
import com.redsocial.dominio.mascota.Mascota;
import com.redsocial.enumeraciones.Rol;
import com.sun.istack.internal.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// Declaracion de la clase, que se convierta "tabla"
@Entity
public class Usuario {
//CADA ATRIBUTO ES UNA COLUMNA
    @Id
    @GeneratedValue    
    private String id;
   
    @Column(unique = true)
    private String correoElectronico;
  
    private String clave;

    @NotNull
    @Column(unique = true)
    private String dni;

    @OneToMany(mappedBy = "duenio", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)//Como se llama el atributo de la otra tabla que se relaciona
    private List<Mascota> mascotas;

    @OneToOne(cascade = CascadeType.REMOVE)//Esto indicado para que si elimino al PADRE,elimino el vinculado
    private Direccion direccion;

    @Temporal(TemporalType.DATE)
    private Date nacimiento;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Usuario() {
        this.mascotas = new ArrayList();
//        this.id=UUID.randomUUID().toString();
    }

    public Usuario(String correoElectronico, String clave, String dni, Direccion direccion, Date nacimiento, Rol rol) {
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.dni = dni;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", clave=" + clave + ", dni=" + dni + ", mascotas=" + mascotas + ", direccion=" + direccion + ", nacimiento=" + nacimiento + ", rol=" + rol + '}';
    }

}

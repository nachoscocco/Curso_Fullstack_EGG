/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author nacho
 */
public class Persona {
    
    private String nombre;
    private Date fechaN;

    public Persona() {
    }

    public Persona(String nombre, Date fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public void muestraPers() {
        System.out.println("nombre =  " + this.nombre);
        System.out.println("Fecha  =  " + this.fechaN);//To change body of generated methods, choose Tools | Templates.
        
        
    }
    
    
    
    
}

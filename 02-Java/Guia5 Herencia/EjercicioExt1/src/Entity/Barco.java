/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public abstract class Barco {
    
    public String matricula;
    public Integer longitud;
    public Integer anio;

    public Barco() {
    }

    public Barco(String matricula, Integer longitud, Integer anio) {
        this.matricula = matricula;  //clave primaria
        this.longitud = longitud;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", longitud=" + longitud + ", anio=" + anio + '}';
    }

   

   
    
    
    
    
}

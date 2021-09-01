/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nacho
 */
public class Motorizado extends Barco {
    private int potencia;

    public Motorizado() {
    }

    public Motorizado(int potencia) {
        this.potencia = potencia;
    }

    public Motorizado(int potencia, String matricula, Integer longitud, Integer anio) {
        super(matricula, longitud, anio);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "potencia=" + potencia + '}';
    }
    
    
    
}

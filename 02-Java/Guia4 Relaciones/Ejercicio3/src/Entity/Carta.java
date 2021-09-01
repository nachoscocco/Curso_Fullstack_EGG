/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;





public class Carta {
    private int numeroCarta;
    private Palo paloCarta;

    public Carta() {
    }

    public Carta(int numeroCarta, Palo paloCarta) {
        this.numeroCarta = numeroCarta;
        this.paloCarta = paloCarta;
    }

   
    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public Palo getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(Palo paloCarta) {
        this.paloCarta = paloCarta;
    }
    
    
    
     @Override
    public String toString() {
        return "Carta{" + "numeroCarta=" + numeroCarta + ", paloCarta=" + paloCarta + '}';
    }

    
    
}

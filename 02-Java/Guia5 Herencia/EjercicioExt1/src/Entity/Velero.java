/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;



public class Velero extends Barco {
    private int cantMastil;

   
    
    

    public Velero() {
        
    }
    

    public Velero(int cantMastil, String matricula, Integer longitud, Integer anio) {
        super(matricula, longitud, anio);
        this.cantMastil = cantMastil;
        
        
    }
    
     public int getCantMastil() {
        return cantMastil;
    }

    public void setCantMastil(int cantMastil) {
        this.cantMastil = cantMastil;
    }

    @Override
    public String toString() {
        return "Velero{" + "cantMastil=" + cantMastil + '}';
    }
    
    
    
}

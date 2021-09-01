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
public class Yate extends Motorizado {
    private int cantCam;

 

    public Yate() {
    }

   
    public Yate(int cantCam, int potencia, String matricula, Integer longitud, Integer anio) {
        super(potencia, matricula, longitud, anio);
        this.cantCam = cantCam;
    }
    
       public int getCantCam() {
        return cantCam;
    }

    public void setCantCam(int cantCam) {
        this.cantCam = cantCam;
    }
    

    @Override
    public String toString() {
        return "Yate{" + "cantCam=" + cantCam + '}';
    }
    
    
    
    
}

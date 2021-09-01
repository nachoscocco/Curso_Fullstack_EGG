/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class Alquiler {
    private String nombrePers;
    private Integer dni;
    private LocalDate fechaAlq;
    private LocalDate fechaDev;
    private int pos;
    private Barco barcoAlq;
    private Integer valorAlqui;
    
    
    public Alquiler() {
    }

    public Alquiler(String nombrePers, Integer dni, LocalDate fechaAlq, LocalDate fechaDev, int pos, Barco barcoAlq ,Integer valorAlqui) {
        this.nombrePers = nombrePers;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.pos = pos;
        this.barcoAlq = barcoAlq;
        this.valorAlqui = valorAlqui;
    }

    public String getNombrePers() {
        return nombrePers;
    }

    public void setNombrePers(String nombrePers) {
        this.nombrePers = nombrePers;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Barco getBarcoAlq() {
        return barcoAlq;
    }

    public void setBarcoAlq(Barco barcoAlq) {
        this.barcoAlq = barcoAlq;
    }

    public Integer getValorAlqui() {
        return valorAlqui;
    }

    public void setValorAlqui(Integer valorAlqui) {
        this.valorAlqui = valorAlqui;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombrePers=" + nombrePers + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", pos=" + pos + ", barcoAlq=" + barcoAlq + ", valorAlqui=" + valorAlqui + '}';
    }

  
    
    
    public void creaAlquiler(ArrayList<Barco> listBarcos){
       Alquiler alqui = new Alquiler();
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       //inputs
       System.out.println("ingrese su nombre y dni");
       alqui.setNombrePers(leer.next());
       alqui.setDni(leer.nextInt());
       
       LocalDate dateToday =  LocalDate.now();
       System.out.println("Ingrese dia , mes y año de devolucion");
       int dia = leer.nextInt();
       int mes = leer.nextInt();
       int an = leer.nextInt();
       LocalDate dateDevol = LocalDate.of(an, mes, dia);
       alqui.setFechaAlq(dateToday);
       alqui.setFechaDev(dateDevol);
       
        System.out.println("Ingrese pos amarre");
        alqui.setPos(leer.nextInt());
        System.out.println("Ingrese matricula");
        String matricula = leer.next();
        for (Barco barco : listBarcos) {
            if ( barco.matricula.equals(matricula)){
           
              alqui.setBarcoAlq(barco);
             
            }   
        }
        
         if(alqui.getBarcoAlq() == null){
                         System.out.println("no existe el barco :C");

         }
           else{
         
          alqui.setValorAlqui(calculaMonto(alqui));
             if (alqui.getValorAlqui() > 0 ) {
                 
                 System.out.println("Su alquiler se ha procesado!!!!!!!!!!!!!!!!");
                 
                 System.out.println("Valor de alquiler : " + alqui.getValorAlqui() );
                 System.out.println("--------------------------------------");
                 System.out.println("Fecha inicio ="+alqui.getFechaAlq());
                 System.out.println("Fecha dev  ="+alqui.getFechaDev());
                 System.out.println("xd"+ alqui.getBarcoAlq().toString());
                 
             }
          
         }
         
        
    }
    
    
    
    public Integer calculaMonto(Alquiler alqui){
        Integer monto  = 0;
    
       
       /* System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY:" + periodoT+
                           "\n Años transcurridos(EDAD EJ:):" + periodoT.getYears()) ;*/
         long auxi1 =alqui.getFechaAlq().toEpochDay();
         long auxi2 = alqui.getFechaDev().toEpochDay();
       
       
       //Para saber en dias el periodo transcurrido(Debi primero utilizar EPOCH para cada fecha utilizo)
      
    
       int valorEspecial = 0;
       long auxfin = (auxi2-auxi1);
       Integer dias = auxfin.intValue();
        System.out.println("Days=="+dias);
       Barco barco = alqui.getBarcoAlq();
       
       if(barco instanceof Velero ){
        valorEspecial= ((Velero) barco).getCantMastil();
       }else if(barco instanceof Motorizado){
        valorEspecial= + ((Motorizado) barco).getPotencia();
         if(barco instanceof Yate ){
         valorEspecial += ((Yate) barco).getCantCam();
         }
       }
        System.out.println("barco.getLongitud()= " + barco.getLongitud());
        System.out.println("valorEspecial= "+ valorEspecial);
       
            
     return  (dias *( (barco.getLongitud() *10)+valorEspecial ));
    }
    

            
    
}

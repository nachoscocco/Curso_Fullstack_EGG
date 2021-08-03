/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class AlumnoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Integer> auxNotas = new ArrayList(); //auxiliar de notas
    
    
    public void crearAlumno(Alumno x){
        System.out.println("Ingrese nombre");
        x.setNombre(leer.next());
        auxNotas = new ArrayList();
        for(int i=0; i<3; i++){
            
            System.out.println("Ingrese nota numero"+(i+1));
            Integer aux = leer.nextInt();
           auxNotas.add(aux);
            
        }
       x.setNotas(auxNotas);
    }
    
    
  
    
    public Integer notaFinal(ArrayList<Alumno> listAlumnos){
        Integer notaFinal=0;
        System.out.println("Ingrese un nombre");
        String nombreIngresado = leer.next();
  
          for (Alumno alumno : listAlumnos) {
            if( nombreIngresado.equals(alumno.getNombre())){
                
            ArrayList<Integer> notas =  alumno.getNotas();
                for (Integer nota : notas) {
                    notaFinal+=nota;
                } 
            }
        }
          
    return notaFinal/3;
    }
    
    
    
}

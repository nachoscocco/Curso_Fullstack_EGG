/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Alumno;
import Services.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        AlumnoService servAlumno = new AlumnoService();
        Alumno auxAlumno = new Alumno();
        ArrayList<Alumno> listAlumnos = new ArrayList();
        char op = 'S';
        
        while(op =='S'){
            System.out.println("VAMOS a crear un alumno :D");
            auxAlumno = new Alumno();
            servAlumno.crearAlumno(auxAlumno);
            listAlumnos.add(auxAlumno);
            System.out.println("ALUMNO CREADO :), desea crear otro(S/N)");
            op = leer.next().charAt(0);
        
        }
        for (Alumno x : listAlumnos) {
            System.out.println(x);
        }
        Integer notaFinal = servAlumno.notaFinal(listAlumnos);
        if (notaFinal > 0) {
            System.out.println("La nota final es"+notaFinal);
        }else{
            System.out.println("No capo, ese pibe no existe");
        }
        
        
        
        
        
       
        
        
        
        
        
    }
    
}

























































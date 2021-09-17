/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redsocial.dominio.fabricante;

import com.redsocial.persistencia.FabricanteDAO;
import java.util.Scanner;


public class FabricanteService {
     
    private FabricanteDAO dao;
    
    
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FabricanteService(FabricanteDAO dao) {
        this.dao = dao;
    }
    
    public void crearOModificar(int codigo, String nombre) throws Exception  {
        boolean op = false;
       try{
         
               
          
         if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
         if( codigo > 0 ){
          throw new Exception("codigo invalido");
          
         }
             Fabricante fabAUX = new Fabricante(codigo,nombre);
           System.out.println("Desea ingresar o modificar un fabricante ? (I/M)");
            if (leer.next().equalsIgnoreCase("I")) {
            
     
         dao.guardarFabricante(fabAUX);
          }else{
          dao.modificarFabricante(fabAUX);
           
               
           }
       }
       catch(Exception e){
           throw e;
       }
       finally{}
        
    }
    
    
            
    
    
}

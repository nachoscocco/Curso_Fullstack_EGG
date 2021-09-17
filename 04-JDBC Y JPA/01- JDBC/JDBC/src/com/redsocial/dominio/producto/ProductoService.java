/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redsocial.dominio.producto;

import com.redsocial.persistencia.ProductoDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class ProductoService {

    private ProductoDAO dao;

    public ProductoService(ProductoDAO dao) {
        this.dao = dao;
    }
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

     public void crearOModificar(int codigo, String nombre, double precio, int codigo_fabricante) throws Exception  {
        boolean op = false;
       try{
         
               
          
         if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
         if( codigo > 0 ){
          throw new Exception("codigo invalido");
          
         }
         
         if( precio > 0 ){
          throw new Exception("precio invalido");
          
         }
         if( codigo_fabricante > 0  /*CONSULTA DE FABRICANTE*/){
          throw new Exception("codigo_fabricante invalido");
          
         }
            Producto productoAUX = new Producto(codigo,nombre,precio,codigo_fabricante);
           System.out.println("Desea ingresar o modificar un fabricante ? (I/M)");
            if (leer.next().equalsIgnoreCase("I")) {
            
     
         dao.guardarFabricante(productoAUX);
          }else{
          dao.modificarFabricante(productoAUX);
           
               
           }
       }
       catch(Exception e){
           throw e;
       }
       finally{}
        
    }
    
     
    public void consultaProd() throws Exception{
   
        try{
        Collection<Producto>listaProd = dao.productosRangoPrecio();
            for (Producto producto : listaProd) {
                System.out.println(producto.toString());
                System.out.println("-----------------------------------");
                
            }

        }
        catch(Exception e){
        throw e;
        }
    }
    
}

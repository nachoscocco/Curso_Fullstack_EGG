/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redsocial.persistencia;

import com.redsocial.dominio.producto.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author nacho
 */
public class ProductoDAO extends DAO {
    
    
    
     public void guardarFabricante(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el mascota");
            }
            String sql = "INSERT INTO Fabricante  "
                         + "VALUES ( '"+producto.getCodigo()+"' , '"
                         + producto.getNombre()+ "' , '"
                         +producto.getPrecio()+"' , '"
                         +producto.getCodigo_fabricante()+"' ,);";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
     public void modificarFabricante(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el mascota que desea modificar");
            }
            String sql = "UPDATE Producto SET "
                    + " codigo = '" + producto.getCodigo() + "' , "
                    + "nombre = '" + producto.getNombre() + "'"
                    + "precio = '" + producto.getPrecio() + "'"
                    + "codigo_fabricante = '" + producto.getCodigo_fabricante() + "'"
                    + " WHERE codigo = '" +producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
     }
     
     public Collection<Producto> productosRangoPrecio() throws Exception{
        
     ArrayList<Producto>listaProd = new ArrayList();
     try{
     String query = "select  * from Producto where precio BETWEEN 120 and 202";
     consultarBase(query);
     Producto prod = null;
     while(resultado.next()){
         prod = new Producto();
         prod.setCodigo(resultado.getInt(1));
         prod.setNombre(resultado.getString(2));
         prod.setPrecio(resultado.getDouble(3));
         prod.setCodigo_fabricante(resultado.getInt(4));
         listaProd.add(prod);
         
     }
     
      
        desconectarBase();  
         return listaProd;
     }
     catch(Exception e){

        desconectarBase();
            throw e;
     }
     }
     
     
     
     
}

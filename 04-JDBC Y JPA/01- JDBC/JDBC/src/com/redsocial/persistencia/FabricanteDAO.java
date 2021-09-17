
package com.redsocial.persistencia;
import java.util.ArrayList;
import java.util.Collection;
import com.redsocial.dominio.fabricante.Fabricante;
import com.redsocial.dominio.fabricante.FabricanteService;



public class FabricanteDAO extends DAO {
    
    private FabricanteService fabricanteService ;
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el mascota");
            }
            String sql = "INSERT INTO Fabricante (apodo, raza, idUsuario) "
                         + "VALUES ( '" +fabricante.getNombre()+"' , '"+ fabricante.getCodigo()+ "' ,);";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
     public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el mascota que desea modificar");
            }
            String sql = "UPDATE Fabricante SET "
                    + " codigo = '" + fabricante.getCodigo() + "' , "
                    + "nombre = '" + fabricante.getNombre() + "'"
                    + " WHERE codigo = '" + fabricante.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
     
    
}

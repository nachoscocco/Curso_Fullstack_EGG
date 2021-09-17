package principal;

import com.redsocial.dominio.producto.ProductoService;
import com.redsocial.persistencia.ProductoDAO;


public class Principal {

    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAO();

        ProductoService ps = new ProductoService(dao);
     try{   
        ps.consultaProd();
     
     }
     catch(Exception e){
         System.out.println(e);
         
     }
        
        
    }
}

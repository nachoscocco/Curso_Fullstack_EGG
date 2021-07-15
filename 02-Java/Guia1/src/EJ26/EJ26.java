package EJ26;


import java.util.Scanner;

/*
  Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa).
 */

/**
 *
 * @author nacho
 */
public class EJ26  {
    
    public static void main(String[] args) {
        EJ26 ej = new EJ26();
       
        Integer[][] matrix= new Integer[3][3];
        Integer[][] matrixT= new Integer[3][3];
        matrix = cargaMatriz();
        matrixT = transponeMatriz(matrix);
       // muestraMatriz(matrix);
       // muestraMatriz(matrixT);
       antiSimMatrix(matrix,matrixT);
        
        
        
        
    }
    
    public static Integer[][] cargaMatriz(){
        Scanner leer = new Scanner(System.in);
        Integer[][] matrix= new Integer[3][3];
        
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                
                System.out.println("Ingrese el valor de matriz fila: "+i+" col: "+j);
                matrix[i][j]= leer.nextInt();
                
            }  
        }
        return matrix;
    }
    
    
    public  void muestraMatriz(Integer[][] matrix){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }
        
    
    }
    public static Integer[][] transponeMatriz( Integer[][] matrix ){
       Integer[][] matrixT= new Integer[3][3];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                
                
                matrixT[j][i]= (matrix[i][j]);
                
            }  
        }
        return matrixT;
    }
    
    public static void antiSimMatrix(Integer[][] matrix, Integer[][] matrixT){
    boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != (matrixT[i][j]*-1) ){
                    flag=false;
                    
                }
                
            }
            
        }
        if (flag) {
            System.out.println("Las matrices son antisimetricas!!");
            muestraMatriz(matrix);
            muestraMatriz(matrixT);
            
        }
        else{
        System.out.println("Las matrices NO son antisimetricas!!");
            muestraMatriz(matrix);
            muestraMatriz(matrixT);
        }
    }

    
    
    
   
    
    
    
    
} //fin class

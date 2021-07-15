/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.

 */
package EJ28;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EJ28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer[][] matrizG = new Integer[10][10];
        Integer[][] matrizC = new Integer[3][3];
        
        cargaMatriz(matrizG);
         cargaMatriz(matrizC);
         muestraMatriz(matrizG);
         System.out.println("");
         System.out.println("");
         muestraMatriz(matrizC);
         validaMatriz(matrizG,matrizC);
         
         
         
         
         
        
    }
    
    
    public static void cargaMatriz(Integer[][] matriz){
        for (int i = 0; i <  matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j]= (int)(Math. random()*1+1);
            
        }
            
        }
    
    }
    
    
    public static  void muestraMatriz(Integer[][] matrix){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }
        
    
    }
    
    
    
    public static void validaMatriz(Integer[][] mg , Integer[][] mc){
            Integer[][] mX = new Integer[3][3];
       for (int i = 0; i <mg.length; i++) {
            for (int j = 0; j < mg.length; j++) {
                
                if ( mg[i][j] == mc[0][0] &&( i <= 8 ) && ( j <= 8 ) ) { 
                    int c1=0;
                    int c2=0;
                    for (int k = i; k < i+2; k++) {
                        for (int l = j; l < j+2; l++) {
                            System.out.println("k "+k);
                            System.out.println("l "+l);
                            
                           
                            mX[c1][c2] = mg[k][l];
                            c2++;
                            
                        }
                        c1++;
                    }
                   Boolean valid = validaMatrices( mc ,  mX);
                    if (valid) {
                        System.out.println("ENCONTRO LA MATRIZ!!!!");
                        System.out.println("COORDS :");
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        
                    }
                    
                }
                
                
            }
            
        }
    
    
    
    }
    
    public static Boolean validaMatrices(Integer[][] mc , Integer[][] mx){
    Boolean flag = true;
        for (int i = 0; i < mc.length ; i++) {
            for (int j = 0; j <  mc.length; j++) {
                
                if (mx[i][j] != mc[i][j]) {
                    flag=false;
                    
                }
                
            }
        }
    
    return flag;
    }
    
    
    
    
    
}

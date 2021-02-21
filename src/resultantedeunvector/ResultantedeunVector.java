/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultantedeunvector;
import java.util.*;
/**
 *
 * @author Kevin
 */
public class ResultantedeunVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner teclado= new Scanner(System.in);
      int matriz [][]= new int[2][2];
      int resultadoA,resultadoB,resultante;
     
     
     for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("ingresa el valor de [" + i+ "," + j+ "]");
                matriz[i][j]=teclado.nextInt();
            }
     }
      for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                
                System.out.print(" ["+i+"]["+j+"]= "+ matriz [i][j]+"");
                
            } 
           System.out.println("");
        }
      
    resultadoA=matriz[0][0]*matriz[1][1];
    resultadoB=matriz[0][1]*matriz[1][0];
    resultante=resultadoA-resultadoB;
        System.out.println("la resultante es: "+resultante);
               }
}

    


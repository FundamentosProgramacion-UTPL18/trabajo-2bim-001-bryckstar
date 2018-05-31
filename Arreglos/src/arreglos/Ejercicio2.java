/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Bryan
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int[] arreglo =  {1,2,3,4,5,6,7};
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] % 2 == 0){
                System.out.printf("\nTabla del %d\n\n", arreglo[i]);
                for (int j = 1; j <= 12; j++) {
                    System.out.printf("%d x %d = %d\n", arreglo[i], j, arreglo[i]*j);
                }
            }
        }
        
        
    }
    
}

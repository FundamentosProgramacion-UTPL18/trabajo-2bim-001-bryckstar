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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        double[] calf_prog = {18,19,15,16,17,10};
        double[] calf_bd = {10,12,13,20,17,20};
        double[] promedios = new double[6];
        
        for (int i = 0; i < calf_prog.length; i++) {
            
            double sum = calf_prog[i] + calf_bd[i];
            double promedio = sum/2;
            promedios[i] = promedio; 
            
        }
        
        for (int i = 0; i < promedios.length; i++) {
            
            System.out.printf("Estudiante %d\t%.2f\t%.2f\t%.2f\n", i+1, calf_prog[i], calf_bd[i], promedios[i]);
            
        }
        
    }
    
}

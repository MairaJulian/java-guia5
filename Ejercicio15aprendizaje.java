
package javaejemplo;

import java.util.Scanner;


public class Ejercicio15aprendizaje {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] numeros = new int[100];
        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i+1;
//            System.out.println(numeros[i]);
        }
        System.out.println("");
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println(numeros[i]);
            
        }
            
        
        
    }
    
}

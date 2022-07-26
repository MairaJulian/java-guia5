
package javaejemplo;

import java.util.Scanner;


public class Ejercicio17aprendizaje {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[10];
        int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
       
        
        for (int i = 0; i < 10; i++) {
            vector[i] = ((int)(Math.random()*10000));
            System.out.println(vector[i]);
            
            if (vector.length == 1) {
                dig1++;
            }
            if (vector.length == 2) {
                dig2++;
            }
            if (vector.length == 3) {
                dig3++;
            }
            if (vector.length == 4) {
                dig4++;
            }
            if (vector.length == 5) {
                dig5++;
            }
        }
        System.out.println("Enteros de 1 dígito: " + dig1);
        System.out.println("Enteros de 2 dígitos: " + dig2);
        System.out.println("Enteros de 3 dígitos: " + dig3);
        System.out.println("Enteros de 4 dígitos: " + dig4);
        System.out.println("Enteros de 5 dígitos: " + dig5);
        
        
    }
    
}

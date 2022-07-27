
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
            
            if (vector[i] >= 0 && vector[i] <= 9) {
                dig1++;
            }else if (vector[i] >= 10 && vector[i] <= 99) {
                dig2++;
            }else if (vector[i] >= 100 && vector[i] <= 999) {
                dig3++;
            }else if (vector[i] >= 1000 && vector[i] <= 9999) {
                dig4++;
            }else if (vector[i] >= 10000 && vector[i] <= 99999) {
                dig5++;
            }
            
//            dig = vector[i].length();
//            
//            switch (dig) {
//                case 1:
//                    dig1++;
//                    break;
//                case 2:
//                    dig2++;
//                    break;
//                case 3:
//                    dig3++;
//                    break;
//                case 4:
//                    dig4++;
//                    break;
//                case 5:
//                    dig5++;
//                    break;
//            }
            
        }
        System.out.println("Enteros de 1 dígito: " + dig1);
        System.out.println("Enteros de 2 dígitos: " + dig2);
        System.out.println("Enteros de 3 dígitos: " + dig3);
        System.out.println("Enteros de 4 dígitos: " + dig4);
        System.out.println("Enteros de 5 dígitos: " + dig5);
        
        
    }
    
}

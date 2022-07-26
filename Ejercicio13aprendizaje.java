
package javaejemplo;

import java.util.Scanner;


public class Ejercicio13aprendizaje {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el largo de cada lado");
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == lado -1) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("* ");
                    
                }
                System.out.println("");
            }else {
                System.out.print("* ");
                for (int j = 0; j < lado -2; j++) {
                    System.out.print("  ");
                    
                }
                System.out.println("*");
            }
            
        }
    }
    
}

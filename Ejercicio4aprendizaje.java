
package javaejemplo;

import java.util.Scanner;


public class Ejercicio4aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese grados centígrados");
        
        int c = leer.nextInt();
        
        int f = 32 + (9*c/5);
        
        System.out.println("Su equivalente en grados Fahrenheit es: " + f);
    }
    
}

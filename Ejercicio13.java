
package javaejemplo;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] nombres = new String [5];
        System.out.println("Ingresa los nombres de los integrantes de tu equipo");
        
        for (int i = 0; i < 5; i++) {
            nombres [i] = leer.next();
            
            
        }
        
    }
    
}

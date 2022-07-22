
package javaejemplo;

import java.util.Scanner;

public class Ejercicio9aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        
        String letra = palabra.substring(0, 1));
        
        if (letra.toLowerCase().equals("a")) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}

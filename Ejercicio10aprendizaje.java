
package javaejemplo;

import java.util.Scanner;

public class Ejercicio10aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int limite = 20;
        int suma = 0;
        
        do {
            System.out.println("Ingrese numero");
        int num = leer.nextInt();

        suma = suma + num;
            
        } while (suma < limite);
        
        System.out.println(suma);
    }
    
}

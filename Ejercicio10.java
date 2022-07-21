
package javaejemplo;

import java.util.Scanner;


public class Ejercicio10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if (numero > 0 && numero < 21) {
                System.out.print(numero + " ");
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                
            }
        }
    }
}

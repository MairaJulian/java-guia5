
package javaejemplo;

import java.util.Scanner;


public class Guia5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una nota 0-10");
        int numero = leer.nextInt();

        while (numero > 0 || numero > 10) {
            System.out.println("Ingrese una nota 0-10");
            numero = leer.nextInt();
        }

    }

}



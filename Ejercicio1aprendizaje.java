
package javaejemplo;

import java.util.Scanner;

public class Ejercicio1aprendizaje {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}

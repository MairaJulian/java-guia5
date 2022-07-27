
package javaejemplo;

import java.util.Scanner;

public class Ejercicio20aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int contador1 = 0;
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();   
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");    
            }
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                
                contador = contador + matriz[i][j];  
            }
            System.out.println("Suma de la primera fila: " + contador);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                
                contador1 = contador1 + matriz[i][j]; 
            }
        }
        System.out.println("Suma de la primera columna: " + contador1);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                contador1 = contador1 + matriz[i][j]; 
            }
        }
        System.out.println("");
    }
    
}

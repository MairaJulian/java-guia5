package javaejemplo;

import java.util.Scanner;


public class Ejercicio19aprendizaje {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] valores = new int[3][3];
        int contador = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                valores[i][j] = leer.nextInt();
            }   
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                
                System.out.print(valores[i][j] + " ");
            }   
        }
        System.out.println("");
        
        int[][] val = new int[3][3];

        
        for (int j = 0; j < 3; j++) {
            System.out.println("");
            for (int i = 0; i < 3; i++) {
                
                System.out.print(valores[i][j] + " ");
                val[i][j] = valores[j][i] * -1;
            }
        }
         System.out.println(""); 
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                if (val[i][j] == valores[i][j]) {
                    contador++;
                }
               
                System.out.print(val[i][j] + " ");
            }   
        }
        System.out.println("");
        if (contador == 9) {
            
            System.out.println("La matriz es anti simétrica");
        }else {
            System.out.println("La matriz no es anti simétrica");
        }
    } 
}

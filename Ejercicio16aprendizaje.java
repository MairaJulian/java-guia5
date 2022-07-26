
package javaejemplo;

import java.util.Scanner;


public class Ejercicio16aprendizaje {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[5];
       
        
        for (int i = 0; i < 5; i++) {
            vector[i] = ((int)(Math.random()*10));
            System.out.println(vector[i]);
//            System.out.println("posicion " + i + " -> " + vector[i]);
      
        }
        System.out.println("Ingrese numero a buscar, entre 1 y 10");
        int numero = leer.nextInt(), vecesEncontrado = 0;
        System.out.println("");
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                System.out.println("Numero encontrado en la posicion " + i);
                vecesEncontrado++;
            }
            
            
        }
        System.out.println("En total se encontró " + vecesEncontrado + " veces");
        
        
        
        
    }
    
}

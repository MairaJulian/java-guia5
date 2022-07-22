
package javaejemplo;

import java.util.Scanner;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
        
        int retorno = esMultiplo(num1, num2);
//        System.out.println(retorno);
        
        if (retorno == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        
        }else {
            System.out.println("El primero numero no es multiplo del segundo");
        
        }
        
    }
    
    public static int esMultiplo(int num1, int num2) {
        int resto;
        resto = Math.floorMod(num1, num2);
        
        return resto;
    
    
    }
}


package javaejemplo;

import java.util.Scanner;


public class Ejercicio9 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int numero, contador=0, suma=0;
        //int contador;

        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if(numero != 0 && numero > 0){
                contador++;
                suma+=numero;
            }
            if(numero ==0){
                System.out.println("Se capturó el numero CERO");
            }
        }while(numero != 0 && contador != 3);
        System.out.println("El total es :" + suma);
    }

}

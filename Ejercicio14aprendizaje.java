
package javaejemplo;

import java.util.Scanner;


public class Ejercicio14aprendizaje {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de euros");
        double euro = leer.nextInt();
        
        System.out.println("Ingrese tipo de moneda");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");
        String moneda = leer.next();
        cambio(euro,moneda);
     
    }
    
    public static void cambio(double euro, String moneda) {
        switch (moneda.toLowerCase()) {
            case "libras":
                System.out.println("Tus " + euro + " equivalen a " + (euro * 0.86) + " Libras");
                break;
            case "dolares":
                System.out.println("Tus " + euro + " equivalen a " + (euro * 1.28611) + " Dolares");
                break;
            case "yenes":
                System.out.println("Tus " + euro + " equivalen a " + (euro * 129.852) + " Yenes");
                break;
                default:
                    System.out.println("No ingresó una moneda dentro de las opciones");
        }
    }
    
}

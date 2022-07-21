
package javaejemplo;

import java.util.Scanner;


public class Ejercicio11aprendizaje {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int p, j;
        System.out.println("Ingrese los valores para p y j:");
        p = leer.nextInt();
        j = leer.nextInt();
        
        boolean menu = true;
        
        while (menu) {
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. SALIR");
            System.out.println("Elija una por favor");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    suma(p,j);
                    break;
                case 2:
                    resta(p,j);
                    break;
                case 3:
                    division(p,j);
                    break;
                case 4:
                    multiplicacion(p,j);
                    break;
                case 5:
                    menu=salir();
                    break;
                default:
                    System.out.println("Intente de nuevo");
            }
        
        
        }
        
        
        
        
    }
    public static void suma(int xp, int xj) {
        System.out.println("La suma de los valores es: " + (xp + xj));

    
    }
    
    public static void resta(int xp, int xj) {
        System.out.println("La resta de los valores es: " + (xp - xj));

    
    }
    
    public static void division(float xp, float xj) {
        float pp = xp/xj;
        System.out.println("La división es: " + (pp));

    
    }
    
    public static void multiplicacion(int xp, int xj) {
        System.out.println("La suma de los valores es: " + (xp * xj));

    
    }
    
    public static boolean salir() {
        System.out.println("Esta seguro de querer salir?");
        System.out.println("S/N");
        Scanner leer = new Scanner(System.in);
        String p=leer.next();
        return !"S".equals(p);
    
    }
}
//while menu{
//            System.out.println("MENU:");
//            System.out.println("1. SUMAR");
//            System.out.println("2. RESTAR\n3.MULTIPLICAR\n4.DIVIDIR");
//            System.out.println("5.SALIR");
//            System.out.println("Elija una opción");
//            int opcion=read.nextInt();
//                switch (opcion){
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    default:
//                        System.out.println("Intente de nuevo");
//                }
//        }
//    }

package javaejemplo;

import java.util.Scanner;

public class Ejercicio12aprendizaje {

    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena1;

        int correctas = 0;
        int incorrectas = 0;

//        do {
//            System.out.println("Ingrese cadena");
//            cadena1 = leer.nextLine();
//            
//            if (cadena1.length() == 5) {
//                if (cadena1.toLowerCase().startsWith("x") && cadena1.toLowerCase().endsWith("o")) {
//                    correctas++;
//           
//                }else {
//                    incorrectas++;
//                }
//          
//            }else {
//                System.out.println("La cadena debe ser de 5 caracteres");
//            }
//
//        } while (cadena1.equals("&&&&&"));
//        System.out.println("INFORME: " + correctas + " lecturas correctas y " + incorrectas + " lecturas incorrectas");
         
           do {
            System.out.println("Ingrese cadena");
            cadena1 = leer.nextLine();
            
            if (cadena1.length() == 5) {
                if (cadena1.toLowerCase().startsWith("x") && cadena1.toLowerCase().endsWith("o")) {
                    correctas++;
           
                }else {
                    incorrectas++;
                }
          
            }else {
                if (cadena1.equals("&&&&&") || (cadena1.length() != 5)) {
                    System.out.println("Programa finalizado");
                }
                
            }

        } while (cadena1.length() == 5);
        System.out.println("INFORME: " + correctas + " lecturas correctas y " + incorrectas + " lecturas incorrectas");

    }

}



package javaejemplo;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        frase1(frase);
        System.out.println(frase.replace("a", "@"));
    }

    public static void frase1(String frase) {
//        System.out.println(frase.length());
        String letra, frasenueva = "";

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            switch (letra.toLowerCase()) {
                case "a":
                    frasenueva = frasenueva + "@";
                    break;
                case "e":
                    frasenueva = frasenueva + "#";
                    break;
                case "i":
                    frasenueva = frasenueva + "$";
                    break;
                case "o":
                    frasenueva = frasenueva + "%";
                    break;
                case "u":
                    frasenueva = frasenueva + "*";
                    break;
                default:
                    frasenueva = frasenueva + letra;
            }

        }
        System.out.println(frasenueva);

    }

}

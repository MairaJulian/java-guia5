package javaejemplo;

public class Ejercicio18aprendizaje {

    public static void main(String[] args) {
        int[][] valores = new int[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                valores[i][j] = ((int) (Math.random() * 10));
                System.out.print(valores[i][j] + " ");

            }

        }
        System.out.println("");
        
        

        int[][] val = new int[4][4];

        for (int j = 0; j < 4; j++) {
            System.out.println("");
            for (int i = 0; i < 4; i++) {

                System.out.print(valores[i][j] + " ");
                val[i][j] = valores[j][i];

            }

        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {

                System.out.print(val[i][j] + " ");

            }

        }
    }

}

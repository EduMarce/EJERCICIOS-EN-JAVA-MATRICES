/*
    Rellenar matriz de 3 x 3 con solo números positivos 
 */
package matriz.pkg3.x.pkg3._numpos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Matriz3X3_NumPos {

    public static void main(String[] args) {
        //Objeto Scanner 
        Scanner sc = new Scanner(System.in);

        //Matriz 3 x 3 
        int matriz[][] = new int[3][3];
        int numeroPos;
        //Pedimos datos al usuario
        System.out.println("\tMATRIZ 3 X 3 POSITIVA\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.print("Posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                    numeroPos = sc.nextInt();
                    if (numeroPos < 0) {
                        System.out.println("ERROR. número negativo ingresado");
                    }
                } while (numeroPos < 0);
                matriz[i][j] = numeroPos;
            }
        }

        //Mostrando la matriz
        System.out.println("\n\tMATRIZ CREADA");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }

}

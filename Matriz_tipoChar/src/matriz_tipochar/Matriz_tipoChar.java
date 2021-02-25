/*
    Rellenar matriz de 3 x 5 (No cuadrada), con datos tipo char
    MATRIZ
    A  B  C  D  E
    F  G  H  I  J
    K  L  M  N  O
 */
package matriz_tipochar;

/**
 *
 * @author eduardo
 */
public class Matriz_tipoChar {

    public static void main(String[] args) {
        //Indicamos la matriz
        char matriz[][] = new char[3][5];
        char inicial = 'A';

        System.out.println("\t---MATRIZ TIPO CHAR---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = inicial;
                inicial++;
            }
        }

        //Mostramos la matriz creada
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(char matriz[][]) {
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println(" ");
        }
    }

    // for-each
    /*
    for (tipo variable : array) { 
    declaraciones usando variable;
    }

    Es equivalente a:


    for (int i=0; i<arr.length; i++){ 
    tipo variable = arr;
    declaraciones usando variable;
    }
     */
}

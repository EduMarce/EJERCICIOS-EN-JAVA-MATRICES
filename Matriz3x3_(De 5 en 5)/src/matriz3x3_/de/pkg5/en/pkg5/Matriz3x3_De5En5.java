/*
    Almacenar serie de 5 en 5 en una matriz de 3 x 3
    Así quedaría la matriz.
        
    5   10   15
    20  25   30
    35  40   45
*/
package matriz3x3_.de.pkg5.en.pkg5;

/**
 *
 * @author eduardo
 */
public class Matriz3x3_De5En5 {

    public static void main(String[] args) {
       //Variables
       int matriz[][] = new int[3][3];
       int valorInicial = 5;
       
       System.out.println("\tMATRIZ 3 X 3\n");
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
              matriz[i][j] = valorInicial;
              valorInicial+=5;
           }
       }
       
       //Imprimimos la matriz
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
             System.out.print(matriz[i][j] + "\t");
           }
           System.out.println(" ");
       }
    }
    
}

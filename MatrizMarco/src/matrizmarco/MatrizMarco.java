/*
    Matriz de 4 x 5, con unos en las orillas, y ceros en el centro
    1 1 1 1 1
    1 0 0 0 1
    1 0 0 0 1
    1 1 1 1 1
*/
package matrizmarco;

/**
 *
 * @author eduardo
 */
public class MatrizMarco {

    public static void main(String[] args) {
        //Indicamos la matriz
        int matriz[][] = new int[4][5];
        
        //PARTE USUARIO
        System.out.println("\tMATRIZ DE 1 Y 0\n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
              if(i==0 || i==3){
                 matriz[i][j] = 1;
              }
             if(j==0 ||j==4){
                matriz[i][j] = 1;
             }
            }
        }
        mostrarMatriz(matriz);
    }
    
    public static void mostrarMatriz(int matriz[][]){
      for(int i=0;i<matriz.length;i++){
         for(int j=0;j<matriz[i].length;j++){
            System.out.print(matriz[i][j] + "\t" );
         }
         System.out.println(" ");
      }
    
    }
    
}

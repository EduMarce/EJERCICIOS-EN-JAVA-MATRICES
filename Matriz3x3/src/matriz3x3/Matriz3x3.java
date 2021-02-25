/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz3x3;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Matriz3x3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int matriz[][] = new int[3][3];
       
       System.out.println("\tLLENAR LA MATRIZ");
       for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
           System.out.print("Posición ["+i+"]["+j+"]: ");
           matriz[i][j] = sc.nextInt();
         }
       }
       
       System.out.println("\tMATRIZ CREADA");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          System.out.print(matriz[i][j] + " ");
        }
        System.out.println(" ");
       }
    }
    
}

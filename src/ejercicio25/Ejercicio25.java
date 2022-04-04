/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int corr = 0;
        int F = 3;
        int C = 3;
        int num, fila1 = 0,fila2 = 0, fila3 = 0, colum1 = 0, colum2 = 0, colum3 = 0;
        
        
        int[][] Matriz;
        Matriz = new int[F][C];
        
        
        System.out.println("Ingrese los Elementos a la Matriz: ");
        
        // rellenando la matriz y validacion de elementos entre 1 y 9.
         for (int i = 0; i < F; i++) {
             
                 for (int j = 0; j < C; j++) {
                
                   do { 
                    Scanner N;
                    N = new Scanner(System.in);
                    System.out.print("[ "+i+" ] [ "+j+" ] = ");
                    num = N.nextInt();
                    Matriz[i][j]= num;
                    
                       if (Matriz[i][j]>0 && Matriz[i][j]<10) {
                           corr = 1;
                       } else if (Matriz[i][j]>=10 || Matriz[i][j]<= 0) {
                           System.out.println("El numero no esta entre 1 y 9.");
                           corr = corr + 0;
                       }
                   } while (corr != 1);
            }
         }
         
        System.out.println();
         System.out.println(" CUADRADO: ");
         
         //Forma cuadrada matriz:
         for (int i = 0; i < F; i++) {
             for (int j = 0; j < C; j++) {
                 System.out.print(" " + Matriz[i][j] + " ");
             }
             System.out.println();
        }
         
         System.out.println("");
         
         int sumaFilas;
         int sumaColum;
         int sumadiag;
         int Resultado;
         
        sumaFilas(Matriz, F, C, fila1, fila2, fila3);
        
        sumaColum(Matriz, F, C, colum1, colum2, colum3);
        
        
        
    }
    
    public static void sumaFilas(int[][] Matriz, int F, int C, int fila1, int fila2, int fila3){
        
        
        for (int i = 0; i < F; i++) {
            fila1 = 0;
            fila2 = 0;
            fila3 = 0;
            for (int j = 0; j < C; j++) {
                
                switch ( i ) {
                    case 0: 
                        fila1 += Matriz[i][j];
                        break;
                    case 1: 
                        fila2 += Matriz[i][j];
                        break;
                    case 2:
                        fila3 += Matriz[i][j];
                        break;
                }
            }
            
        }
            System.out.println(" La suma de la Fila 1 es: " + fila1);
            System.out.println(" La suma de la Fila 2 es: " + fila2);
            System.out.println(" La suma de la Fila 3 es: " + fila3);
    }
    
    public static void sumaColum(int[][] Matriz, int F, int C, int colum1, int colum2, int colum3) {
    
        for (int j = 0; j < C; j++) {
             colum1 = 0;
             colum2 = 0;
             colum3 = 0;
            for (int i = 0; i < F; i++) {
               
                switch (j) {
                    case 0:
                        colum1 += Matriz[i][j];
                        break;
                    case 1:
                        colum2 += Matriz[i][j];
                        break;
                    case 2:
                        colum3 += Matriz[i][j];
                        break;
                }
                
            }
            System.out.println(" La suma de las Columna ["+j+"] es: " + colum1);
            System.out.println(" La suma de las Columna ["+j+"] es: " + colum2);
            System.out.println(" La suma de las Columna ["+j+"] es: " + colum3);
        }
        
}
    
    
}

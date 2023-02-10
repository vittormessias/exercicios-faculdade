/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vitor
 */

public class ex091 {
    public static void main(String[] args) {
        
        int[][] A = new int[5][5];
        int[] somaLinhas = new int [5];
        int[] somaColunas = new int [5];
        int soma;
        
        for(int l = 0; l < 5; l ++){
            for(int c = 0; c < 5; c ++){
                System.out.printf("Valor da linha %d e coluna %d : ", l+1, c+1);
                Scanner var = new Scanner(System.in);
                A[l][c] = var.nextInt();
                
            }
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println(Arrays.toString(somaLinhas));
        
        for(int l = 0; l < 5; l++){
            soma = 0;
            for(int c = 0; c < 5; c++){
                soma = soma + A[l][c];
            }
            somaLinhas[l] = soma;
        }
        
        System.out.println("Linha ");
        
        for(int l = 0; l < 5; l ++){
            System.out.printf("Linha %d: %d%n", l+1, somaLinhas[l]);
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println(Arrays.toString(somaColunas));
        
        for(int c =0; c < 5; c ++){
            soma = 0;
            for(int l = 0; l < 5; l ++){
                soma = soma + A[l][c];
            }
            somaColunas[c] = soma;   
        }
        
        System.out.println("Coluna ");
        
        for(int c = 0; c < 5; c ++){
            System.out.printf("Coluna %d: %d%n", c+1, somaColunas[c]);
        }
    }
}



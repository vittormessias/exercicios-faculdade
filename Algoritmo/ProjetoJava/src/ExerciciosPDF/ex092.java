/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class ex092 {
    public static void main(String[] args) {
        
        int[][] A = new int[5][5];
        
        for(int l = 0; l < 5; l ++){
            for(int c = 0; c < 5; c ++){
                System.out.printf("Valor da linha %d e coluna %d : ", l+1, c+1);
                Scanner var = new Scanner(System.in);
                A[l][c] = var.nextInt();
                
            }
        }
        
        if((A[0] == A[1]) && (A[2] == A[3])){
            System.out.println("É uma matriz simétrica");
        }
        else{
            System.out.println("Não é uma matriz simétrica");
        }
        
        if(A[0][4] == A[1][0]){
            System.out.println("É uma matriz diagonal principal");
        }
        else{
            System.out.println("Não é uma matriz diagonal principal");
        }
    }
}

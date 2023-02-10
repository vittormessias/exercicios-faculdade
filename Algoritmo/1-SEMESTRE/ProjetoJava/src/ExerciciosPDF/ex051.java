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
public class ex051 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Digite quantos termos devem aparecer: ");
        int valor = var.nextInt();
        
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        
        int c;
        
        System.out.print("F("+valor+") = ");
        
        for(c = 0; c <= valor; c ++){
            f0 = f1;
            f1 = fn;
            System.out.print(fn + ", ");
            fn = f0 + f1;
        }
        System.out.print("... ");
    } 
}

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
public class ex050 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Digite um valor:");
        int valor = var.nextInt();
        
        for(int c1 = 1 ; c1 <= valor; c1 ++){   
            for(int c2 = 1 ; c2 <= valor; c2 ++){  
                
                if(c1 + c2 == valor){
                    System.out.println(c1 + " e " + c2);
                }         
            }
        }
    }
}

     


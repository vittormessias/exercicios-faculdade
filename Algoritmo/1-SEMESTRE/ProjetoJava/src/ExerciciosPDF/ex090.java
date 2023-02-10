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
public class ex090 {
    public static void main(String[] args) {
        
        System.out.print("Digite uma palavra: ");
        Scanner var = new Scanner(System.in); 
	String frase = var.next().toUpperCase();

        System.out.print("Vogais: ");
	for(int i = 0; i < frase.length(); i ++){
            char caracter = frase.toUpperCase().charAt(i);
            
            if(caracter == 'A'||caracter == 'E'||caracter == 'I'||caracter == 'O'||caracter == 'U'){
                System.out.print(caracter);
            } 
	}
        System.out.println();
        
        System.out.print("Consoantes: ");
	for(int i = 0; i < frase.length(); i ++){
            char caracter = frase.toUpperCase().charAt(i);

            if(caracter == 'B'||caracter == 'C'||caracter == 'D'||caracter == 'F'||caracter == 'G' ||caracter == 'J' ||caracter == 'K' ||caracter == 'L' ||caracter == 'M' ||caracter == 'N'
                    ||caracter == 'P' ||caracter == 'Q' ||caracter == 'R' ||caracter == 'S' ||caracter == 'T' ||caracter == 'V' ||caracter == 'W' ||caracter == 'X' ||caracter == 'Z'){
                System.out.print(caracter);
            } 
        }
        System.out.println();
    }
}

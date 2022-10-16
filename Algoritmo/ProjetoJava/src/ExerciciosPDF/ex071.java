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
public class ex071 {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        System.out.println("Informe Dez inteiros");
        
      
        for(int c = 0; c < vetor.length; c++){
            System.out.printf("Digite o %d valor:", c+1);
            Scanner var = new Scanner(System.in);
            int seq = var.nextInt();
            vetor[c] = seq;
        }
        System.out.println("*******************************");
        System.out.println("O programa deve informar a posição onde este inteiro ocorre no vetor");
        System.out.println("*******************************");
        
        System.out.println("Informe Um inteiro");
        System.out.print("Digite um valor: ");
        Scanner var = new Scanner(System.in);
        int x = var.nextInt();
        
        //Percorrendo cada um dos elementos com forEach
        for(int c : vetor){
            if(vetor[c] == x){
                System.out.printf("O valor %d ocorre na posição: %d%n ", x, c+1);
                break;
            }else if(x == vetor.length-1){
                System.out.println("Número não encontrado no vetor");
            }
        }
        System.out.println("Lista: " + Arrays.toString(vetor));
    }
}

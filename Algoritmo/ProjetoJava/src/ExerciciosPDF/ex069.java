/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;
import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author vitor
 */
public class ex069 {
    public static void main(String[] args) {
                
        int []valor;
        valor = new int[15];
        
        int c;

        for(c = 0; valor.length > c; c ++){
            System.out.println("Digite o " + c + ". valor: ");
            Scanner var = new Scanner(System.in);
            valor[c] = var.nextInt();
        }
        
        System.out.println("Digite um valor inteiro entre 1 e 10: ");
        Scanner var = new Scanner(System.in);
        int inteiro = var.nextInt();
        
        int i, cont = 0;
        for (i = 0; i < valor.length; i ++){
            if(valor[i] == inteiro){
                cont++;
            }
        }
        System.out.println("O numero " + inteiro + " aparece no vetor " + cont + " vezes");
    }
}

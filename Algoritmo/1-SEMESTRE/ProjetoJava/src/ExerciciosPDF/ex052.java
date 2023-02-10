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
public class ex052 {
    public static void main(String[] args) {
        
        System.out.print("Informe o valor do primeiro termo: ");
        Scanner var = new Scanner(System.in);
        int A1 = var.nextInt();
        
        System.out.print("Informe o valor do segundo termo: ");
        Scanner var2 = new Scanner(System.in);
        int A2 = var2.nextInt();
        
        System.out.print("Digite a quantidade de termos: ");
        Scanner var3 = new Scanner(System.in);
        int numeroTermos = var3.nextInt();
        
        while(true){
            if(numeroTermos < 3){
                System.out.println("A quantidade mínima de termos é 3!");
                System.out.print("Digite a quantidade de termos: ");
                numeroTermos = var3.nextInt();
            }
            else{
                break;
            }    
        }
        
        System.out.print(A1 + ", ");
        System.out.print(A2 + ", ");
        
        int i;
        int valorTermo;
        
        for(i = 3; i <= numeroTermos; i++){
            if(i % 2 == 0){
                valorTermo = A2 - A1;
            }else{
                valorTermo = A2 + A1;
            }
            A1 = A2;
            A2 = valorTermo;
            System.out.print(valorTermo + ", ");
        }        
    }
}

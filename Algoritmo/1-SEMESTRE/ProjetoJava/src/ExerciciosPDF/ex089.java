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
public class ex089 {
    public static void main(String[] args) {
        
        System.out.print("Digite o seu nome: ");
        Scanner var = new Scanner(System.in);
        String nome = var.nextLine();
        
        System.out.print("Digite seu nome do meio: ");
        Scanner var2 = new Scanner(System.in);
        String nomeDoMeio = var2.nextLine();
        
        System.out.print("Você tem sobrenome? [S/N] ");
        Scanner var3 = new Scanner(System.in);
        String condicao = var3.nextLine().toUpperCase();
        
        if("S".equals(condicao)){
            System.out.print("Digite seu ultimo nome ");
            Scanner var4 = new Scanner(System.in);
            String sobrenome = var4.nextLine();
            sobrenome = sobrenome.substring(0,1).toUpperCase() + sobrenome.substring(1);
            System.out.printf("%s, %s. %s.", sobrenome, nomeDoMeio.toUpperCase().charAt(0), nome.toUpperCase().charAt(0));
        }else{
            nomeDoMeio = nomeDoMeio.substring(0,1).toUpperCase() + nomeDoMeio.substring(1);
            System.out.printf("%s, %s", nomeDoMeio, nome.toUpperCase().charAt(0));
        }
        System.out.println();
    }
}

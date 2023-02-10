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
public class ex070 {
    public static void main(String[] args) {
        
        int[] lista;
        lista = new int[100];
        int c = 0;
        
        System.out.print("Digite um valor: ");
        Scanner var = new Scanner(System.in);
        int i = var.nextInt();
        lista[c] = i;
        
        System.out.print("Quer continuar? [S/N] ");
        Scanner var2 = new Scanner(System. in);
        String parar = var2.nextLine().toUpperCase();
        
        while(true){
            if("S".equals(parar)){
                c ++;
                System.out.print("Digite um valor: ");
                var = new Scanner(System.in);
                i = var.nextInt();
                lista[c] = i;
                
                System.out.print("Quer continuar? [S/N] ");
                var2 = new Scanner(System. in);
                parar = var2.nextLine().toUpperCase();
                
            }else{
                if("N".equals(parar)){
                    break;
                }
            }
        System.out.println(Arrays.toString(lista));
        }
    }
}

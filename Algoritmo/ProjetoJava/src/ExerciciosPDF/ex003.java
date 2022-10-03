/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;

import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ex003 {
    
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro valor: "));
        
        if (valor1 < valor2){
                if (valor2 > valor3){
                    if (valor3 < valor1){
                            System.out.println("Sequência: " + valor3 + ", " + valor1 + ", " + valor2);
                    } else{
                        System.out.println("Sequência: " + valor1 + ", " + valor3 + ", " + valor2);
                    }
                } else{
                    System.out.println("Sequência: " + valor1 + ", " + valor2 + ", " + valor3);
                }
        } else if (valor3 > valor2){
                    if (valor3 < valor1){
                                System.out.println("Sequência: " + valor2 + ", " + valor3 + ", " + valor1);
                    }else{
                        System.out.println("Sequência: " + valor2 + ", " + valor1 + ", " + valor3);
                    }      
        } else{
            System.out.println("Sequência: " + valor3 + ", " + valor2 + ", " + valor1);
        }    
    }  
}

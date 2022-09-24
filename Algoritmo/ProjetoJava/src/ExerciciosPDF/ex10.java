/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ex10 {
    public static void main(String[] args) {
        int base;
          
        /*inteiro informado*/
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro menor que 32:"));
        
        /*teste inteiro informado menor que 32*/
        while (true){
            if (base < 32){
                break;   
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor inválido");
                base = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro menor que 32:"));
            }
        }
        
        /*Converter um inteiro informado para binário*/
        String b = Integer.toBinaryString(base);
        System.out.println("O número convertido para binario é: " + b);
    }
}

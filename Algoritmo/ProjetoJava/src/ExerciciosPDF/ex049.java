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
public class ex049 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        
        if (valor % 2 == 0){
            if (valor == 2){
                System.out.println("Primo");
            }else{
                System.out.println("Não é primo");
            }
        }else{
            System.out.println("Primo");
        }
    }
    
}

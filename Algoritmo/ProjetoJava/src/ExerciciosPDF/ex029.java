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
public class ex029 {
    public static void main(String[] args) {
        float salario;
        
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));
        
        float salarioFinal = salario - (salario * 11 / 100);
        
        System.out.println("Salario: " + salario + " / Desconto de 11%: " + salarioFinal);
        
        double desconto = salario * 11 / 100;
        if (desconto > 334){
            System.out.println("O valor de desconto " + desconto + " ultrapassa o valor máximo de 33429");     
        }else{
            System.out.println("Está dentro do limite de desconto");
        }
    }
}

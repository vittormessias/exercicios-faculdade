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
public class ex011 {
    public static void main(String[] args) {
        
        //Cada nota de bimestre é composta por 2 notas de provas
        double nota1, nota2;
        
        JOptionPane.showMessageDialog(null, "1°BIMESTRE");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 1° prova: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 2° prova: "));
        
        JOptionPane.showMessageDialog(null, "2°BIMESTRE");
        double nota3, nota4;
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 1° prova: "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 2° prova: "));
        
        //calcular a nota semestral
        double media = (nota1 + nota2 + nota3 + nota4) / 2;
        
        //média aritmética entre a nota de 2 bimestres
        System.out.println("Média final " + media);
    }
}

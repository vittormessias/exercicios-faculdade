/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Exercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author vitor
 */
public class OperacoesArit {
    
   
    public static void main(String[] args) {
        
        float n1;
        float n2; 
        
        float resAD;
        float resSU;
        float resMU;
        float resDV;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro numero"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo numero"));
        
        resAD = n1 + n2;
        resSU = n1 - n2;
        resMU = n1 * n2;
        resDV = n1 / n2;
        
        JOptionPane.showMessageDialog(null, "Resultado da Adição = " + resAD);
        JOptionPane.showMessageDialog(null, "Resultado da Subtração = " + resSU);
        JOptionPane.showMessageDialog(null, "Resultado da Multiplicação = " + resMU);
        JOptionPane.showMessageDialog(null, "Resultado da Divisão = " + resDV);
        
        
    
    }
    
}

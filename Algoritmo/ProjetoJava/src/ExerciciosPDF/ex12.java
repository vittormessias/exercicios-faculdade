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
public class ex12 {
    public static void main(String[] args) {
        
        double velocidade;
        
        JOptionPane.showMessageDialog(null, "Transformação de m/s para km/h");
        
        // velocidade fornecida
        velocidade = Float.parseFloat(JOptionPane.showInputDialog("Digite uma velocidade: "));
        
        // multiplicando o valor em m/s por 3,6
        double velocidadeFinal = velocidade * 3.6;
        
        // velocidade em Km/h
        System.out.println("Velocidade em m/s convertida para " +velocidadeFinal+ "Km/h");
    }
}

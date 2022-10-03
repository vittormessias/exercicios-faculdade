/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPDF;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author vitor
 */
public class ex009 {
    public static void main(String[] args) {
        
        double raio, altura, volume;
        
        raio = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual é o raio"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual é a altura? "));
        
        raio = 3.14 * Math.pow(raio,2);    
        volume = raio * altura;
        
        System.out.println("O volume é igual a " + volume + "cm³ ");
        
    }
}

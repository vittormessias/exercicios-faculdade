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
public class ex031 {
    public static void main(String[] args) {
        
        float ATT = Float.parseFloat(JOptionPane.showInputDialog("Passes tentados: "));
        float COMP = Float.parseFloat(JOptionPane.showInputDialog("Passes completos: "));
        float YARDS = Float.parseFloat(JOptionPane.showInputDialog("Jardas: "));
        float TD = Float.parseFloat(JOptionPane.showInputDialog("Passes para touchdown: "));
        float INT = Float.parseFloat(JOptionPane.showInputDialog("Passes interceptados: "));
        
        double A = ((COMP / ATT) - 0.3) * 5;
        if (A > 2.375){
            A = 2.375;
        } else if (A < 0){
            A = 0;
        }else{
            A = A;
        }
        
        double B = ((YARDS / ATT) - 3) * 0.25;
        if (B > 2.375){
            B = 2.375;
        } else if (B < 0){
            B = 0;
        }else{
            B = B;
        }
        
        double C = (TD / ATT) * 20;
        if (C > 2.375){
            C = 2.375;
        } else if (C < 0){
            C = 0;
        }else{
            C = C;
        }
    
        double D = 2.375 - ((INT / ATT) * 25);
        if (D > 2.375){
            D = 2.375;
        } else if (D < 0){
            D = 0;
        }else{
            D = D;
        }
    
        double passerRating = ((A + B + C + D) / 6) * 100;
        System.out.printf("QB Rating do quarterback: %.2f %n ", passerRating);
        
        
    }
}

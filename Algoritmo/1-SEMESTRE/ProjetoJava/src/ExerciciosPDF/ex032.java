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
public class ex032 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Esse programa diz se o valor digitado é uma vogal, consoante, número ou um símbolo");
        
        String caracter;
        caracter = JOptionPane.showInputDialog("Digite aqui: ");
        
        
        String[] vogal = {"A","E","I","O","U"};
        String[] consoante = {"B","C","D","F","G","J","K","L","M","N","P","Q","R","S","T","V","W","X","Z"};
        int[] numero = {1,2,3,4,5,6,7,8,9,10};
        
        int i;
        
        for (i=0; i <5; i++){
            String toUpperCaracter = caracter.toUpperCase();
            if ((vogal[i].equals(toUpperCaracter))){
                System.out.println("É uma vogal");
            }
        }
        
        for (i=0; i <19; i++){
            String toUpperCaracter = caracter.toUpperCase();
            if ((consoante[i].equals(toUpperCaracter))){
                System.out.println("É uma consoante");
            }
        }
        
        for (i=0; i <numero.length; i++){
            int num = Integer.parseInt(caracter);
            if (numero[i] == num){
                System.out.println("É um numero");
            } 
        }       
    }
}

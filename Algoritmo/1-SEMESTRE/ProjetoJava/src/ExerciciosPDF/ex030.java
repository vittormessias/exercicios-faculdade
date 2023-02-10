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
public class ex030 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
       "|Álcool Até 25 litros, desconto de 2% por litro      |\n" +
       "|Acima de 25 litros, desconto de 4% por litro       |\n" +
       "|Gasolina Até 25 litros, desconto de 3% por litro |\n" +
       "|Acima de 25 litros, desconto de 5% por litro       |");
    
    String valorInserido = JOptionPane.showInputDialog(
            "A - álcool\n" +
            "G - gasolina\n" +
            "Digite aqui: '");
    
    while (true){
        if ("A".equals(valorInserido) || "G".equals(valorInserido)){
            break;
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor inválido");
            valorInserido = JOptionPane.showInputDialog(
                    "A - álcool\n" +
                            "G - gasolina\n" +
                            "Digite aqui: '");
        }
    }
    
    float valorLitros = Float.parseFloat(JOptionPane.showInputDialog("Litros vendidos: "));
    
    if (valorInserido.equals("A")){
        String combustivelEscolhido = "álcool";
        if (valorLitros < 25){
            double valorPorLitro = valorLitros * 2.70;
            double desconto = valorPorLitro - (valorPorLitro * 0.02 / 100);
            System.out.println("Valor por litro: " + valorPorLitro + "\n"
                    + "Total a pagar com desconto: " + desconto);
        } else{
            if (valorLitros > 25){
                double valorPorLitro = valorLitros * 2.70;
                double desconto = valorPorLitro - (valorPorLitro * 0.04 / 100);
                System.out.println("Valor por litro: " + valorPorLitro + "\n"
                    + "Total a pagar com desconto: " + desconto);
            }
        }
        System.out.println("Tipo de combustivel: " + combustivelEscolhido);  
    } else {
        if (valorInserido.equals("G")){
            String combustivelEscolhido = "gasolina";
            if (valorLitros > 25){
                double valorPorLitro = valorLitros * 1.90;
                double desconto = valorPorLitro - (valorPorLitro * 0.03 / 100);
                System.out.println("Valor por litro: " + valorPorLitro + "\n"
                        + "Total a pagar com desconto: " + desconto);
            } else{
                   if (valorLitros > 25){
                        double valorPorLitro = valorLitros * 1.90;
                        double desconto = valorPorLitro - (valorPorLitro * 0.05 / 100);
                        System.out.println("Valor por litro: " + valorPorLitro + "\n"
                        + "Total a pagar com desconto: " + desconto);
                    }
                }
            System.out.println("Tipo de combustivel: " + combustivelEscolhido);
        }
    }
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author vitor
 */
public class Decisao {
    
    public static void DecisaoSimples(String texto) {
       
        if (texto.equals("TESTE")){
            System.out.println("Igual " + texto);
        }       
    }
    
    public static void DecisaoComposta(String texto) {
        
        if (texto.equals("TESTE")){
            System.out.println("igual " + texto);
        }
        else{
            System.out.println("diferente " + texto);
        }
    }
    
    public static void DecisaoEncadeada(String texto) {
        
        if (texto.equals("TESTE")){
            System.out.println("igual " + texto);
        }
        else if (texto.equals("NAO TESTE")){
            System.out.println("NÃO TESTE " + texto);
        }
        else{
            System.out.println("diferente " + texto);
        }
    }
}

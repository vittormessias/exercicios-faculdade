/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author vitor
 */
public class Operadores {
        
    public static void atribuicao() {
        int lado = 2;
        double pi = 3.14;
        char caract = 'A';
        String texto = "DevMedia";
        int area = 2;
        area *= 2;
        
        System.out.println("Lado = " + lado);
        System.out.println("PI = " + pi);
        System.out.println("Caracter = " + caract);
        System.out.println("Texto = " + texto);
        System.out.println("Area = " + area);   
    }
    
    public static void aritmeticos(double n1, double n2) {
        double resultado = n1 + n2;
        System.out.println("Soma = " + resultado);
        
        resultado = n1 - n2;
        System.out.println("Sub = " + resultado);
        
        resultado = n1 * n2;
        System.out.println("Mult = " + resultado);
        
        resultado = n1 / n2;
        System.out.println("Div = " + resultado);
    }

    public static void incremento() {
        int numero = 5;
        System.out.println("Numero = " + numero);
        
        numero++;
        System.out.println("Numero = " + numero);
        
        numero--;
        System.out.println("Numero = " + numero);
    }

    public static void igualdade() {
        int valorA = 1;
        int valorB = 2;
        String textoA = "TESTE";
        String textoB = "TEXTO";
        
        if (valorA == valorB){
            System.out.println("Valores iguais");          
            }
        else{
            System.out.println("Valores diferentes");
        }
        
        if (valorA != valorB){
            System.out.println("Valores diferentes");
        }
        else{
            System.out.println("Valores iguais");
        }
        
        if (textoA.equals(textoB)){
            System.out.println("TEXTOS iguais");      
        }
        else{
            System.out.println("TEXTOS diferentes");
        }
        
        if (!textoA.equals(textoB)){
            System.out.println("TEXTOS diferentes");
        }
        else{
            System.out.println("TEXTOS iguais");
        }
   
    }

    public static void relacionais() {
        int valorA = 1;
        int valorB = 2;
        
        
        if (valorA > valorB){
            System.out.println("igual");
        }
             
        if (valorA == valorB){
            System.out.println("igual");                
        }
        else{
            System.out.println("menor");
        }  
    }
    
    public static void logicos() {
        if ((1 == (2 - 1)) && (2 == (1 + 1))){
            System.out.println("Ambas as expressões são verdadeiras");
        }
        
        if ((1 != (2 - 1)) || (2 == (1 + 1))){
            System.out.println("iguais");
        } 
    }
    
    public static void exemplos() {
        int quantidadeAnos = 5;
        int horasTrabalhadas = 40;
        int valorHora = 50;
        int salario = 0;
        
        if (quantidadeAnos <= 1){
            salario = 1500 + (valorHora * horasTrabalhadas);
        }
        else if ((1 < quantidadeAnos) && (quantidadeAnos < 3)){
            salario = 2000 + (valorHora * horasTrabalhadas);
        }
        else{
            salario = 3000 + (valorHora * horasTrabalhadas);
        }
        System.out.println("salario " + salario);
    }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_28_02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    Scanner teclado = new Scanner (System.in);


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        double soma = 0;
        
        
         final int QUANTIDADE = 5;
        
        System.out.println("Calculo da media de " + QUANTIDADE + " numeros");
        System.out.println("-------------------------------------");
        
        
        for (int i = 1; i <= QUANTIDADE; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            double numero = teclado.nextDouble();
            soma += numero; 
        }
        
        
        double media = soma / QUANTIDADE;
        
        
        System.out.println("-------------------------------------");
        System.out.println("A soma dos numeros e: " + soma);
        System.out.println("A media dos numeros e: " + media);
        
        
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_24_02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_9 {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("digite a primeira nota");
         double nota = teclado.nextDouble();
         
         System.out.println("digite a segunda nota");
         double frequencia = teclado.nextDouble();
         
         boolean aprovado = (nota >= 60) && (frequencia >75);
         
         System.out.println("o aluno foi aprovado? "+aprovado);
         
    }
    
}

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
public class exercicio_6 {
    
    Scanner teclado = new Scanner (System.in);


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite um caractere: ");
        char caractere = teclado.next().charAt(0);
        
        
        System.out.print("Digite o número de vezes para repetir o caractere: ");
        int repeticoes = teclado.nextInt();
        
        System.out.println("\nResultado:");
        
        
        for (int i = 1; i <= repeticoes; i++) {
            System.out.print(caractere);
        }
        
        
        System.out.println();
        
        
        System.out.println("\nAlternativa (um caractere por linha):");
        for (int i = 1; i <= repeticoes; i++) {
            System.out.println(caractere);
        }
        
        // Fecha o scanner
        teclado.close();
    }
}
    
    
    
    


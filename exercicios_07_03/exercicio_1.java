/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_07_03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
    public static void main(String[] args) {
        
        


    
       Scanner teclado = new Scanner(System.in);
        
        int idade;
        int somaIdades = 0;
        int quantidadeAlunos = 0;
        
        System.out.println("Cálculo da Média de Idade dos Alunos");
        System.out.println("Digite a idade de cada aluno (um valor negativo para encerrar):");
        
        
        System.out.print("Idade do aluno: ");
        idade = teclado.nextInt();
        
        
        while (idade >= 0) {
           
            somaIdades += idade;
            
            quantidadeAlunos++;
            
           
            System.out.print("Idade do aluno: ");
            idade = teclado.nextInt();
        }
        
        
        if (quantidadeAlunos > 0) {
            
            double media = (double) somaIdades / quantidadeAlunos;
            
            System.out.println("\nResultados:");
            System.out.println("Quantidade de alunos: " + quantidadeAlunos);
            System.out.println("Soma das idades: " + somaIdades);
            System.out.printf("Média das idades: %.2f\n", media);
        } else {
            System.out.println("\nNenhum aluno foi registrado.");
        }
        
        teclado.close();
    }
}
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios19_fev;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_1  {
    public static void main(String[] args) {
    Scanner teclado1 = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    
    int salario;
    String nome; 
    
    System.out.print("Qual o nome do funcionario? ");
    nome = teclado1.nextLine();
    
    System.out.print("\nQual o salario do funcionario? ");
    salario = teclado2.nextInt();
    
    System.out.println("entao " + nome + " recebe isso tudo de " + salario + ", legal");
    }
}
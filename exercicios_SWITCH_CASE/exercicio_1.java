/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_SWITCH_CASE;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;

    
        
        System.out.println("-------------------------");
        System.out.println("     CALCULADORA    ");
        System.out.println("-------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("[1] soma");
        System.out.println("[2] subtracao");
        System.out.println("[3] multiplicacao");
        System.out.println("[4] divisao");
        
        int opcao = teclado.nextInt();
        String mensagem = null;
        switch(opcao) {
            case 1:
                System.out.println("digite o primeiro numero");
                num1 = teclado.nextInt();
                System.out.println("digite o segundo numero numero");
                num2 = teclado.nextInt();
                System.out.println(+(num1) +(num2));
                break;
            case 2:
                System.out.println("digite o primeiro numero");
                num1 = teclado.nextInt();
                System.out.println("digite o segundo numero numero");
                num2 = teclado.nextInt();
                System.out.println(+(num1) -(num2));
                
                break;
            case 3:
                System.out.println("digite o primeiro numero");
                num1 = teclado.nextInt();
                System.out.println("digite o segundo numero numero");
                num2 = teclado.nextInt();
                System.out.println(+(num1) *(num2));
                break;
            case 4:
                System.out.println("digite o primeiro numero");
                num1 = teclado.nextInt();
                System.out.println("digite o segundo numero numero");
                num2 = teclado.nextInt();
                System.out.println(+(num1) /(num2));
                break;
           
            default:
                mensagem = "Opção inválida.";
                break;
        }
        
    }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    


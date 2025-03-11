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
public class exercicio_2 {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        final String SENHA_CORRETA = "1234";
        
        
        String senhaDigitada;
        
        System.out.println("Sistema de Verificacao de Senha");
        
        
        System.out.print("Digite a senha: ");
        senhaDigitada = teclado.nextLine();
        
       
        while (!senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.println("Senha incorreta! Tente novamente.");
            
            
            System.out.print("Digite a senha: ");
            senhaDigitada = teclado.nextLine();
        }
        
        
        System.out.println("Senha correta! Acesso permitido.");
        
        teclado.close();
    }
} 
   
    


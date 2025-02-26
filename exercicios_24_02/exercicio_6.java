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
public class exercicio_6 {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("digite o primeiro numero: ");
         int num1 = teclado.nextInt();
         
         System.out.println("digite o segundo numero: ");
         int num2 = teclado.nextInt();
         
         if(num1 > num2) {
             System.out.println("o maior numero e :" +num1);
         } else if (num2 > num1) {
             System.out.println("o maior numero e" +num2);
         }else {
             System.out.println("os numeros sao iguais");
             
         } 
             
             
         
         
         
        
        
        
        
        
        
    }
    
    
    
    
    
    
}

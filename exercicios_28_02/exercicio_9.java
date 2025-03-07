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
public class exercicio_9 { 
    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner (System.in);
     
        System.out.println("digite o numero 1");
        double numero = teclado.nextDouble();
        double maior = numero;
        double menor = numero;
        
        for(int i=2; i<=7; i++) {
            System.out.println("digite o numero " +i+ ": ");
            if(numero > maior) {
                maior = numero;
                
            }
              if(numero <= menor) {
                  menor = numero;
              }     
          
        } System.out.println("o maior valor e: " +maior);
            System.out.println("o menor valor : " +menor);
        
    }
    
}

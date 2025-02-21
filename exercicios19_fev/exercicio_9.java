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
public class exercicio_9 {


      public static void main(String[] args) {
        
          Scanner teclado = new Scanner (System.in);
          
          double quilometros;
          int dias;
          
          System.out.println("quantos quilometros foi andado com o carro?");
          quilometros = teclado.nextDouble();
          
          System.out.println("por quantos dias o carro foi alugado?");
          dias = teclado.nextInt();
          
          System.out.println("o carro foi usado em quilometros" +quilometros+ "entao fica" +(quilometros * 0.20));
          
          System.out.println("e foi usado por dias" +dias+ "entao fica" + (dias * 90));
          
          System.out.println("o total fica em R$" +(dias * 90 + quilometros * 0.20));
          
          
         
          
          
          
          
          
          
          
          
          
          
          
          
    }
    
}

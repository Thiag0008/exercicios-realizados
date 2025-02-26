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
public class exercicio_10 {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("digite um numero");
         int num = teclado.nextInt();
         
         boolean foraDoIntervalo = (num < 100 || num > 200);
         
         System.out.println("o numero" +num+ "esta fora do intervalo?" +foraDoIntervalo);
         
         
         
         
    }
    
}

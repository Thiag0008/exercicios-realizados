/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
      ArrayList<String> letras = new ArrayList<>();
      
      System.out.println("digite 2 letras para a lista  :");
         for (int i = 0; i < 2; i++) {
             System.out.println("letra " +(i+1)+ ": ");
             letras.add(teclado.nextLine().toUpperCase());
             
        }
      
        System.out.println("letras digitadas em maiusculo :" +letras);
        
        
        
        
        
        
    }
    
}

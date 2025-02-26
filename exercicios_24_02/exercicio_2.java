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
public class exercicio_2 {
 
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner (System.in);
       
       int ano;
               
               
        System.out.println("me diga um ano");
        ano = teclado.nextInt(); 
        
        boolean bissexto = ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
        
        System.out.println("o ano "+ano+" e bissexto? "+bissexto);
        
        
        
        
        
        
         
        
        
        
        
            
            
                
                
       
       
       
        
        
        
        
        
        
    }
    
    
    
    
}

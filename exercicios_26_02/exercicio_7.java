/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_26_02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_7 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("qual o dia da semana ?");
        String dia = teclado.nextLine();
        
        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
        System.out.println("dia de semana"); 
        } else {
            System.out.println("fim de semana");
    }  
                     
                
        
        
        
        
        
        
    }
    
}

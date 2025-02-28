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
public class exercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("onde voce trabalha? ");
        String trabalho = teclado.nextLine();
        
        System.out.println("em que turno ?");
        String turno = teclado.nextLine();
        
        if (turno.equalsIgnoreCase("noite")) {
            System.out.println("nao");
        } else {
            System.out.println("parabens por estar de manha ou de tarde ");
        }
            
        
        
        
        
        
        
    }
    
    
    
    
    
    
}

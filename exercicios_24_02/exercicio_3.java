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
public class exercicio_3 {
    
    public static void main(String[] args) {
        
        
        
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("digite sua idade");
        int idade = teclado.nextInt();
        
        System.out.println("voce possui carteira de motorista (true/false) ?");
        boolean temCNH = teclado.nextBoolean();
        
        
        
        boolean podeDirigir = (idade >= 18) && temCNH;
        
        System.out.println("a pessoa pode dirigir "+podeDirigir);
        
        
        
        
       
        
     
        
        
        
    }
    
    
    
}

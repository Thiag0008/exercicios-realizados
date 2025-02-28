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
public class exercicio_6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("digite a primeira palavra");
        String pala1 = teclado.nextLine();
        
        System.out.println("digite a segunda palavra");
        String pala2 = teclado.nextLine();
        
        if (pala1.equalsIgnoreCase(pala2)) {
            System.out.println("essas palavras sao iguais");
        } else {
            System.out.println("nao sao iguias");
        }
        
        
        
        
        
        
    }
    
    
    
}

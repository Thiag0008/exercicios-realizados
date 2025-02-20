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
public class exercicio_5 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
     
       
       double reais;
    
        System.out.println("quantos reais voce tem?");
        reais = teclado.nextDouble();
        
        System.out.println("com" +reais+ "voce pode comprar" + (reais * 5.45)+ "dolares");
        
        
        
    }
    
}

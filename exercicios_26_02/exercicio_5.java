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
public class exercicio_5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("escreva seu login");
        String login = teclado.nextLine();
        
        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("valido"); 
        } else {
            System.out.println("invalido");
            
        }
        
        
        
        
        
        
    }
    
}

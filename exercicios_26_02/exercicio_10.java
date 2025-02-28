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
public class exercicio_10 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("fala seu email ai");
        String email = teclado.nextLine();
        
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("email valido");
        } else {
            System.out.println("email invalido");
            
        }
        
        
        
        
        
    }
    
    
    
}

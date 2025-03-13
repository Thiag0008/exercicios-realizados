/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_SWITCH_CASE;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        int dia;
        
        System.out.println("me diga um numero ");
        dia =teclado.nextInt();
        
         int opcao = teclado.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
             case 6:
                 System.out.println("sexta");
                break;
              case 7:
                  System.out.println("sabado");
                break;  
                
                default:
                    System.out.println("dia invalido");
                break;
        
        
    }
    
}
    
}

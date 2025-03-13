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


public class exercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("-------------------------");
        System.out.println("     MENU DE BEBIDAS        ");
        System.out.println("-------------------------");
        System.out.println("Escolha uma opcoo:");
        System.out.println("[1] refrigerante");
        System.out.println("[2] suco");
        System.out.println("[3] agua");
        
        int opcao = teclado.nextInt();
       
        switch(opcao) {
            case 1:
                System.out.println("pepsi ou coca?");
                break;
            case 2:
                System.out.println("morango ou uva?");
                break;
            case 3:
                System.out.println("com ou sem gas?");
                break;
            default:
                System.out.println("indefinida");
                break;
        }
        
    }
}

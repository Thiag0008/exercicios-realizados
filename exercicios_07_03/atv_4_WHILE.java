/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_casa_WHILE;

import java.util.Scanner;

/**
 *
 * @author contr
 */
public class atv_4_WHILE {
    
    Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        
        System.out.print("Digite um numero inteiro nao negativo para calcular seu fatorial: ");
        numero = teclado.nextInt();
        
        while (numero < 0) {
            System.out.println("Numero invalido! Por favor, digite um número inteiro nao negativo:");
            numero = teclado.nextInt();
        }
        
       
        long fatorial = 1; 
        int contador = numero;
        
        while (contador > 0) {
            fatorial *= contador; 
            contador--;
        }
        
       
        System.out.println("O fatorial de " + numero + " e: " + fatorial);
        
        teclado.close();
    }
    
}

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
public class atv_3_WHILE {
    
    
    Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        
        System.out.print("Digite um numero inteiro positivo para ver sua tabuada: ");
        numero = teclado.nextInt();
        
        while (numero <= 0) {
            System.out.println("Numero inválido! Por favor, digite um número inteiro positivo:");
            numero = teclado.nextInt();
        }
        
        
        System.out.println("Tabuada do " + numero + ":");
        
        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        
        teclado.close();
    }
}
    


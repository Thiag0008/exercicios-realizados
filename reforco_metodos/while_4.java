/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class while_4 {
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int numero = solicitarNumeroNaoNegativo(sc);
        System.out.println("op fatorial de" +numero+ "e: " +calcularFatorial(numero));
     
        
    }

    public static int solicitarNumeroNaoNegativo(Scanner sc) {
        System.out.println("digite um numero inteiro nao negativo: ");
        int numero = sc.nextInt();
        while(numero < 0){
            System.out.println("numero invalido digite um numero inteiro");
            numero = sc.nextInt();
        }
        return numero;
    }

    public static int calcularFatorial(int numero) {
       int fatorial = 1;
       for(int cont = 1; cont <= numero; cont++){
           fatorial *= cont;
       }
        return fatorial;
    }
    
}

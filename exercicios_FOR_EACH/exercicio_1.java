/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
       int[] numeros = {1,2,3,4,5};
       int soma = 0;
       
       for(int numero : numeros) {
           soma += numero;
       }
       
        System.out.println("soma :" +soma);
         
        
        
        
        
    }
    
}

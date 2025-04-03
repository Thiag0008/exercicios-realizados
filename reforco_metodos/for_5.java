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
public class for_5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("a media dos numeros e: " +calcularMedia(sc));
        
        
    }

    public static Double calcularMedia(Scanner sc) {
        double soma = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("digite o numero" +i+": ");
           double numero = sc.nextDouble();
           soma += numero;
            
        }
        return soma / 5;
        
    }
    
}

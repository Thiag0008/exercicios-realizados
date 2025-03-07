/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_28_02;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
   
    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("\nTabuada do " + numero + ":");
            
            
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
            }
            
            
            System.out.println("----------------------");
        }
    }
}


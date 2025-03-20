/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_6 {
    
    public static void main(String[] args) {
        
        int[] numeros = {10,20,30,40,50};
        int contador = 0;
        
        for (int numero : numeros) {
            if (numero > 10) {
                contador++;
            }
        }
        
          System.out.println("esses sao os elementos maior que dez: " +contador);  
        
        
    }
    
}

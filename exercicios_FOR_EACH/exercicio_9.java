/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_9 {
    
    public static void main(String[] args) {
        
      int[] numeros = {1,2,3,4,5};
        
        
        
        
        
      int menor = numeros[0];
        
        
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        
        
        System.out.println("O menor numero no array e: " + menor);
    }
}  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
    
    


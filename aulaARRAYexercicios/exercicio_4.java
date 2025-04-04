/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaARRAYexercicios;

/**
 *
 * @author Aluno
 */
public class exercicio_4 {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5};
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { 
                numeros[i] = 0;        
            }
        }
        
       for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        
        
        
        
        
        
        
        
    }
    
    
}

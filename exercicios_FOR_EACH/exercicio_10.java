/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_10 {
    
    public static void main(String[] args) {
        
        
         int[] numeros = {1,2,3,4,5};
         
        int contadorPares = 0;
        
        
        for (int numero : numeros) {
            
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        
        
        System.out.println("a quantidade de numeros pares no array: " + contadorPares);
        
        
        
        
        
        
    }
    
}

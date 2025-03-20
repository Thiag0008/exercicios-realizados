/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_8 {
    
    public static void main(String[] args) {
        
       int[] numeros = {1,2,3,4,5,6,7,8,9,};
       
       for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) { 
                numeros[i] = 0;        
            }
        }
        
       for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
       
       
       
       
    }
    
}

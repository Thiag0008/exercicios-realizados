/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_3 {
    
    public static void main(String[] args) {
        
      int[] numeros = {1,2,3,4,5};
      
      int maior = Integer.MIN_VALUE;
int indiceMaior = -1;
for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] > maior) {
        maior = numeros[i];
        indiceMaior = i;
    }
}
System.out.printf("Maior numero e %d", maior, indiceMaior);
      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

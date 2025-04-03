/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

/**
 *
 * @author Aluno
 */
public class foreach_1 {
    
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = somatotal(numeros);
        
        
        System.out.println("A soma total e: " + soma);
    }
    
    public static int somatotal(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}

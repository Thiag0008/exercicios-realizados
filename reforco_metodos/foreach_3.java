/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;

/**
 *
 * @author contr
 */
public class foreach_3 {
    
    
    
    public static void main(String[] args) {
        
        int[] numeros = {12, 45, 7, 23, 56, 89, 34, 2};
        
        
        int maior = encontrarMaior(numeros);
        System.out.println("O maior numero no array e: " + maior);
    }
    
    
    public static int encontrarMaior(int[] array) {
        
        if (array.length == 0) {
            throw new IllegalArgumentException("O array está vazio");
        }
        
        
        int maior = array[0];
        
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        
        return maior;
    }
}
    


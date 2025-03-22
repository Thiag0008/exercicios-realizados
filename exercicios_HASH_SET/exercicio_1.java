/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_HASH_SET;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
    public static void main(String[] args) {
        
        
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
       System.out.println(numeros); 
        
        if(numeros.contains(5)) {
            System.out.println("numero cinco encontrado");
        }
        
        
        
        
        
        
        
    }
    
}

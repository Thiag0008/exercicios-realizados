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
public class exercicio_9 {
    
    public static void main(String[] args) {
        
        Set<String> letras = new HashSet<>();
        
        letras.add("g");
        letras.add("x");
        letras.add("w");
        letras.add("t");
        
        int  size  = letras.size();
        
        System.out.println(letras);       
       
        System.out.println( "Tamanho do HashSet: " + size);
        
    }
    
}

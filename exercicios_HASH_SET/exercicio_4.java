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
public class exercicio_4 {
    
    public static void main(String[] args) {
        
       Set<String> cidades = new HashSet<>(); 
        
        cidades.add("sao paulo");
        cidades.add("tramandai");
        cidades.add("tokyo");
        cidades.add("nova iorque");
        
        
        System.out.println(cidades);
        
         boolean  isEmpty  = cidades.isEmpty();
        
        System.out.println( "O HashSet esta vazio? " + isEmpty);
        
        
        
        
        
        
        
    }
    
}

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
public class exercicio_7 {
    
    public static void main(String[] args) {
        
        
        Set<String> cores = new HashSet<>(); 
        
       cores.add("roxo");
       cores.add("vermelho");
       cores.add("azul");
       cores.add("rosa");
        
       System.out.println(cores);
       
       if(cores.contains("vermelho")) {
            System.out.println("tem vermelho na lista");
        }  
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

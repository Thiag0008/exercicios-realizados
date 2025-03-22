/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_HASH_SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    public static void main(String[] args) {
        
        
       Set<String> cores = new HashSet<>(); 
        
       cores.add("roxo");
       cores.add("vermelho");
       cores.add("azul");
       cores.add("rosa");
        
        
       
       List<String> cores2 = new ArrayList<>();
        cores2.addAll(cores);
        System.out.println(cores2);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_HASH_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class exercicio_10 {
    
    public static void main(String[] args) {
        
       Set<String> animais = new HashSet<>();  
        
       animais.add("tigre");
       animais.add("leao");
       animais.add("onca"); 
        
      System.out.println(animais);
       
        System.out.println( "Usando o iterador:" );
        
        
        
        Iterator<String> iterator = animais.iterator(); 
        while (iterator.hasNext()) { 
        System.out.println(iterator.next());
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

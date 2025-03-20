/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    public static void main(String[] args) {
        
      HashSet<String>itens=new HashSet<String>();
      
     itens.add("chocolate");
     itens.add("bala");
     itens.add("brigadeiro");
        
      for (String s : itens) {
            System.out.println(s);
        }   
        
        
        
        
    }
    
}

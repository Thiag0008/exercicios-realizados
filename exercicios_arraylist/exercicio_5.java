/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_arraylist;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaDeCara = new ArrayList<>();
        
      listaDeCara.add("B");
      listaDeCara.add("Y");
      listaDeCara.add("X");
      listaDeCara.add("D");
      
      for(String nome : listaDeCara) {
        System.out.println(nome);
        }
        
      int tamanho = listaDeCara.size(); 
      System.out.println("a quantidade de caracteres e " +tamanho);
        
        
        
        
        
    }
    
    
    
    
    
    
}

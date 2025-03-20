/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class exercicio_7 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        
         nomes.add("ana");
         nomes.add("andre");
         nomes.add("jorge");
         nomes.add("michael");
         
        
      int contador = 0;
      
      for (String nome : nomes) {
          if (nome != null && (nome.startsWith("a"))) {
          contador++;
      }
      }
        
        System.out.println("esses sao a quantidade de nomes que comecam com A " +contador+ "e essa e a lista" +nomes); 
        
    }
    
}

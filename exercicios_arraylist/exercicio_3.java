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
public class exercicio_3 {
    
    public static void main(String[] args) {
        
      ArrayList<Double> listaDeDoubles = new ArrayList<>();
      
      listaDeDoubles.add(1.1);
      listaDeDoubles.add(2.1);
      listaDeDoubles.add(3.1);
      listaDeDoubles.add(4.1);
      listaDeDoubles.add(5.1); 
      
      listaDeDoubles.remove(1.1);
      listaDeDoubles.remove(2.1);
      listaDeDoubles.remove(4.1);
      listaDeDoubles.remove(5.1);
      
      for(Double nome : listaDeDoubles) {
        System.out.println(nome);
        }
      
        
        
        
        
        
        
    }
    
}

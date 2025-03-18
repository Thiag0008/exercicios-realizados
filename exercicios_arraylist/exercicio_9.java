/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class exercicio_9 {
    
    public static void main(String[] args) {
        
      ArrayList<Integer> listaDuplicada = new ArrayList<>();
      
      listaDuplicada.add(10);
      listaDuplicada.add(10);
      listaDuplicada.add(10);
      listaDuplicada.add(30);
      listaDuplicada.add(60);
      listaDuplicada.add(10);
      listaDuplicada.add(10);
      listaDuplicada.add(60);
      listaDuplicada.add(100);
      listaDuplicada.add(2);
      
      HashSet uniqueItems = new HashSet();
List<Integer> duplicates = listaDuplicada.stream()
                                .filter(n -> !uniqueItems.add(n))
                                .toList();
System.out.println("os numeros duplicados sao :" +duplicates);
      
        
        
        
        
        
        
        
        
        
    }
    
}

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
public class exercicio_7 {
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> listacrescente = new ArrayList<>();
        
        listacrescente.add(12);
        listacrescente.add(20);
        listacrescente.add(100);
        listacrescente.add(44);
        listacrescente.add(28);
        listacrescente.add(50);
        listacrescente.add(51);
        listacrescente.add(75);
        listacrescente.add(99);
        listacrescente.add(1000);
        
        System.out.println("Elementos em ordem crescente:");
        listacrescente.stream()
                      .sorted()
                      .forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

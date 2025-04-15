/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class ex_19 {
    
    public static void main(String[] args) {
         
      ArrayList<String> listaDeCara = new ArrayList<>();
        
      listaDeCara.add("ceu");
      listaDeCara.add("sol");
      listaDeCara.add("lua");
      listaDeCara.add("escudo");
      listaDeCara.add("madeira");
      listaDeCara.add("queijo");
        
        for(String nome : listaDeCara) {
        System.out.println(nome);
        }
        
      int tamanho = listaDeCara.size(); 
      System.out.println("a quantidade de palavras e " +tamanho);
        
        
        
        
        
    }
    
}

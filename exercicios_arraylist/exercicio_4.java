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
public class exercicio_4 {
    
    public static void main(String[] args) {
        
      ArrayList<String> listaDeCores = new ArrayList<>();
      
      listaDeCores.add("vermelho");
      listaDeCores.add("verde");
      listaDeCores.add("amarelo");
      
      for(String nome : listaDeCores) {
        System.out.println(nome);
        }
       
        boolean contemamarelo = listaDeCores.contains("amarelo");
        System.out.println("na minha lista de cores tem amarelo ?" +contemamarelo);
        
        
        
        
        
    }
    
    
}

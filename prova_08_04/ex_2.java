/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex_2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaDeCara = new ArrayList<>();
        
      listaDeCara.add("walter");
      listaDeCara.add("mike");
      listaDeCara.add("michael");
      listaDeCara.add("gus");
      listaDeCara.add("jesse");
      listaDeCara.add("jeremias");
      listaDeCara.add("bartolomeu");
      listaDeCara.add("belladona");
      listaDeCara.add("diana");
      listaDeCara.add("bruce");
      
     ArrayList<String> palavrasFiltradas = new ArrayList<>();
        for(String palavra : listaDeCara) {
            if(palavra.length() > 6){
                palavrasFiltradas.add(palavra);
            }
        }
        
        System.out.println("nomes com mais de 6 caracteres: " +palavrasFiltradas); 
      
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}

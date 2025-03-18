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
public class exercicio_2 {
    
    public static void main(String[] args) {
        
        
         ArrayList<String> listaDeNumeros = new ArrayList<>();
         
        listaDeNumeros.add("1");
        listaDeNumeros.add("2");
        listaDeNumeros.add("3");
        listaDeNumeros.add("4");
        listaDeNumeros.add("5");
        listaDeNumeros.add("6");
        listaDeNumeros.add("7");
        listaDeNumeros.add("8");
        listaDeNumeros.add("9");
        listaDeNumeros.add("10");
        
        listaDeNumeros.remove("2");
        listaDeNumeros.remove("4");
        listaDeNumeros.remove("6");
        listaDeNumeros.remove("8");
        listaDeNumeros.remove("10");
        
        for(String nome : listaDeNumeros) {
        System.out.println(nome);
        }
        
         
        
        
        
        
        
        
    }
    
    
    
    
    
    
}

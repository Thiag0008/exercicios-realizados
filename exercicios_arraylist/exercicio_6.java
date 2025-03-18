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
public class exercicio_6 {
    
    public static void main(String[] args) {
        
        
        ArrayList<String> listaDeFrutas = new ArrayList<>();
        
        listaDeFrutas.add("uva");
        listaDeFrutas.add("limao");
        listaDeFrutas.add("maracuja");
        listaDeFrutas.add("melancia");
        listaDeFrutas.add("tomate");
        
        int indice = listaDeFrutas.indexOf("maracuja");
        
        if (indice != -1) {
    listaDeFrutas.set(indice, "morango");
}
        
         for(String nome : listaDeFrutas) {
        System.out.println(nome);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

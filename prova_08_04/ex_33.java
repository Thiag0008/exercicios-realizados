/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class ex_33 {
    
    public static void main(String[] args) {
        
        
        Set<String> frutas = new HashSet<>();
        
       frutas.add("maca");
       frutas.add("banana");
       frutas.add("laranja");
       frutas.add("abacaxi");
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("qual fruta voce quer? caso nao for encontrado nao esta disponivel");
        String compra = teclado.nextLine();
        
        if(compra.contains("maca")) {
            System.out.println("maca encontrado");
        
        
        if(compra.contains("banana")) 
            System.out.println("banana encontrado");
        
        
        if(compra.contains("laranja")) 
            System.out.println("laranja encontrado");
        
        
        if(compra.contains("abacaxi")) 
            System.out.println("abaxi encontrado");
        }
           
    
        
        
        
        
        
        
        
             
        
        
    }
    
    
    
}

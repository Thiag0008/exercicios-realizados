/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;

/**
 *
 * @author contr
 */
public class arimetrica_2 {
    
    public static void main(String[] args) {
        
        int ano1 = 2024;  
        int ano2 = 2023;  
        int ano3 = 2000;  
        int ano4 = 1900;  
        
        
        verificarExibirResultado(ano1);
        verificarExibirResultado(ano2);
        verificarExibirResultado(ano3);
        verificarExibirResultado(ano4);
    }
    
    
    public static void verificarExibirResultado(int ano) {
        if (Bissexto(ano)) {
            System.out.println(ano + " e um ano bissexto.");
        } else {
            System.out.println(ano + " nao e um ano bissexto.");
        }
    }
    
    
    public static boolean Bissexto(int ano) {
        
        
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
    


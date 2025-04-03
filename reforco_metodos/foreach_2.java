/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */


public class foreach_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("Digite o numero de palavras que deseja inserir: ");
        int qtd = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite uma palavra: ");
            String palavra = sc.nextLine();
            palavras.add(palavra);
        }
         exibirSemMaiusculas(palavras);   
         
         
    }
    
    private static void exibirSemMaiusculas(ArrayList<String> palavras) {
        palavras.forEach(palavra -> System.out.println(palavra.toLowerCase()));
    }
    
}

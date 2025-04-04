/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaARRAYexercicios;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String palavra = sc.nextLine();
        
        char[] carac = palavra.toCharArray();
        
        for (int i = 0; i < carac.length/ 2; i++) {
            char temp = carac[i];
            carac[i] = carac[carac.length -1 -i];
            carac[carac.length -1 -i] = temp;
        }
        
        String palavraInvertida = new String(carac);
        System.out.println("palavra invertida: " +palavraInvertida);
        
        
    }
    
}

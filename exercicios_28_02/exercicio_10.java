/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_28_02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_10 { 
    
    public static void main(String[] args) {
        
        random rm = new random();
        Scanner teclado = new Scanner (System.in);
        
        int numero = rm.nextInt(100);
        int tentativas = 0;
        int palpite = 0;
        
        System.out.println("tente adivinhar o numero entre 1 e 100");
        
        for(tentativas = 1; tentativas <= 7; tentativas++){
            System.out.println("tentativas" +tentativas+": ");
            palpite = teclado.nextInt();
        } 
        
        if(palpite == numero) {
            System.out.println("acertou em " +tentativas+"tentativas");
            
        }else if(palpite < numero){
            System.out.println("o numero e maior");
            
        }else{
            System.out.println("o numero e menor");
        }
        
        if(palpite != numero){
            System.out.println("voce nao conseguiu adivinhar o numero. \n o numero era" +numero);
            
            
        }
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios19_fev;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        int a;
        int s;
    
        System.out.print("Digite o seu numero: ");
        n = teclado.nextInt();
        
        a = n-1;
        s = n+1;
        
        System.out.println("\nO antecessor do seu numero e " + a + " e o sucessor e " + s);
    }
}

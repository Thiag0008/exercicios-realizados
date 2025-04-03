/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */


public class funcoes_arimetricas_3 {
    public static boolean podeDirigir(int idade, boolean temCNH) {
        return idade >= 18 && temCNH;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        
        System.out.println("Voce possui carteira de motorista? (true/false)");
        boolean temCNH = sc.nextBoolean();
        
        boolean resultado = podeDirigir(idade, temCNH);
        System.out.println("A pessoa pode dirigir: " + resultado);
        
        
    }
}

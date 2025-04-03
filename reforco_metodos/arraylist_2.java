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
public class arraylist_2 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
      ArrayList<Integer> numeros = adicionarNumeros(sc);
      removerNumerosPares(numeros);
      imprimerNumeros(numeros);
       
       
        
    }

    public static ArrayList<Integer> adicionarNumeros(Scanner sc) {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("digite 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++){
            System.out.println("numero" +(i+1)+": ");
            numeros.add(sc.nextInt());
        }
        return numeros;
    }

    public static void removerNumerosPares(ArrayList<Integer> numeros) {
        numeros.removeIf(n -> n % 2 == 0);
    }

    public static void imprimerNumeros(ArrayList<Integer> numeros) {
        System.out.println("numeros apos remover pares: " +numeros);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;

/**
 *
 * @author Aluno
 */
public class ex_37 {
    public static void main(String[] args) {
        
        System.out.println("os produtos que voce comprou foram pao,vinho e queijo");
        System.out.println("a seguir os precos e a soma total");
        System.out.println("10,25.67,22.22");
        double[] preco = {10,25.67,22.22,};
       int soma = 0;
       
       for(double numero : preco) {
           soma += numero;
       }
       
        System.out.println("soma :" +soma);
        
        
        
    }
    
}

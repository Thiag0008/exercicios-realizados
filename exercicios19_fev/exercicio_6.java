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
public class exercicio_6 {
   
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner (System.in);
       
       double metros;
       double largura;
       
        System.out.println("quantos metros tem a parede?");
        metros = teclado.nextDouble();
        
        System.out.println("qual a largura da parede?");
        largura = teclado.nextDouble();
        
          System.out.println("a quantidade de tinta que voce vai precisar sera" +(largura * metros));
          
   
        
              
       
       
               
        
    }
}

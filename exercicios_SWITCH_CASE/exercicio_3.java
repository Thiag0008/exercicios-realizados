/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_SWITCH_CASE;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_3 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
      double lado1;
      double lado2;
      double lado3;
      
      System.out.println("me diga o tamanho do primeiro lado");
        lado1 = teclado.nextDouble();
        
        System.out.println("me diga o tamanho do segundo lado");
        lado2 = teclado.nextDouble();
        
        System.out.println("me diga o tamanho do terceiro lado");
        lado3 = teclado.nextDouble();
        
        
       if ((lado1 + lado2 > lado3) && (lado1 + lado3>2) && (lado2 +lado3>lado1)) {
           int triangulo = 0;
           if(lado1 == lado2) triangulo++;
           if(lado1 == lado3) triangulo++;
           if(lado2 == lado3) triangulo ++;
           
           switch(triangulo) {
               case 3:
                   System.out.println("equilatero");
                   break;
               case 1:
                   System.out.println("isosceles");
                   break;
               case 0:
                   System.out.println("escaleno");
                   break;
               default:
                   System.out.println("indefinida");
                   break;
           }
           
           
       } else {
           System.out.println("os lados nao formam um triangulo");
       }
        
        
        
        
        
    }
    
}

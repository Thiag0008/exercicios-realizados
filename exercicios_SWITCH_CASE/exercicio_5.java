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
public class exercicio_5 {
    
    
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("digite o seu peso (em kg)");
        double peso = teclado.nextDouble();
        
        System.out.println("digite a sua altura");
        double altura = teclado.nextDouble();
        
        double imc = peso / (altura*altura);
        int categoria;
        
        if(imc < 18.5) { categoria = 1;
        
        
        }else if (imc < 25) {
            categoria = 2;
            
        }else if(imc < 30) {
            categoria = 3;
            
        }else{
            categoria = 4;
        }
        
        switch(categoria) {
            case 1:
                System.out.printf("seu IMC e %.2f - abaixo do peso",imc);
                break;
            case 2:
                System.out.println("seu IMC e" +imc+ "- peso normal");
                break;
            case 3:
                System.out.println("seu IMC e" +imc+ "- sobrepeso");
                break;
            case 4:
                System.out.println("seu IMC e" +imc+ "- obesidade");
                break;
            default:
                System.out.println("categoria invalida");
                break;
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_METODOS;

 import java.util.Scanner;

/**
 *
 * @author contr
 */
public class exercicio_1 {
    
    public static int somarNumeros(int num1, int num2) {
        return num1 + num2;
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite o primeiro numero inteiro: ");
        int primeiroNumero = teclado.nextInt();

        
        System.out.print("Digite o segundo numero inteiro: ");
        int segundoNumero = teclado.nextInt();

        
        int resultado = somarNumeros(primeiroNumero, segundoNumero);

        
        System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " = " + resultado);

        
        teclado.close();
    }
}
    


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
public class exercicio_2 {
    
    public static boolean Par(int numero) {
        
        return numero % 2 == 0;
    }

    
    public static void mostrarParidade(int numero) {
        if (Par(numero)) {
            System.out.println(numero + " e um numero par.");
        } else {
            System.out.println(numero + " e um numero ímpar.");
        }
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = teclado.nextInt();

        
        mostrarParidade(numeroDigitado);

        
        teclado.close();
    }
}
    


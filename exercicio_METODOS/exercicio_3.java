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
public class exercicio_3 {
    
    public static long calcularFatorial(int numero) {
        
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        
        if (numero < 0) {
            throw new IllegalArgumentException("Fatorial nao pode ser calculado para numeros negativos.");
        }
        
        
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }
    
    
    public static void mostrarFatorial(int numero) {
        try {
            long resultado = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite um numero inteiro positivo para calcular o fatorial: ");
        int numeroDigitado = teclado.nextInt();

        
        mostrarFatorial(numeroDigitado);

        
        teclado.close();
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_METODOS;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    


    
    
    public static boolean Vogal(char caractere) {
        
        caractere = Character.toLowerCase(caractere);
        
        
        return caractere == 'a' || 
               caractere == 'e' || 
               caractere == 'i' || 
               caractere == 'o' || 
               caractere == 'u';
    }
    
    
    public static int contarVogais(String texto) {
        int contadorVogais = 0;
        
        
        for (int i = 0; i < texto.length(); i++) {
            
            if (Vogal(texto.charAt(i))) {
                contadorVogais++;
            }
        }
        
        return contadorVogais;
    }
    
    
    public static String lerTexto() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        return teclado.nextLine();
    }
    
    
    public static void imprimirResultado(String texto, int numeroVogais) {
        System.out.println("Texto digitado: " + texto);
        System.out.println("Numero de vogais: " + numeroVogais);
    }
    
    
    public static void main(String[] args) {
        
        String texto = lerTexto();
        
        
        int numeroVogais = contarVogais(texto);
        
        
        imprimirResultado(texto, numeroVogais);
    }
}
    
    
    


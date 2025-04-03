/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;

/**
 *
 * @author contr
 */
public class arimetrica_5 {
    
    
    
    public static void main(String[] args) {
        
        int numero1 = 15;
        int numero2 = 5;
        int numero3 = 10;
        int numero4 = 20;
        int numero5 = 30;
        
        
        verificarEExibir(numero1);
        verificarEExibir(numero2);
        verificarEExibir(numero3);
        verificarEExibir(numero4);
        verificarEExibir(numero5);
    }
    
    
    public static boolean estaNoIntervalo(int numero) {
        
        return numero >= 10 && numero <= 20;
    }
    
    
    public static void verificarEExibir(int numero) {
        if (estaNoIntervalo(numero)) {
            System.out.println(numero + " esta no intervalo entre 10 e 20.");
        } else {
            System.out.println(numero + " nao esta no intervalo entre 10 e 20.");
        }
    }
}
    


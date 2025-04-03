/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;

/**
 *
 * @author contr
 */
public class arimetrica_1 {
    
    public static void main(String[] args) {
        
        int numero1 = 222;
        int numero2 = 111;
        
        
        if (Par(numero1)) {
            System.out.println(numero1 + " e um numero par.");
        } else {
            System.out.println(numero1 + " e um numero ímpar.");
        }
        
        if (Par(numero2)) {
            System.out.println(numero2 + " e um número par.");
        } else {
            System.out.println(numero2 + " e um número ímpar.");
        }
    }
    
   
    public static boolean Par(int numero) {
        
        return numero % 2 == 0;
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;

/**
 *
 * @author contr
 */
public class arimetrica_4 {
    
    public static void main(String[] args) {
        
        double cateto1 = 3.0;
        double cateto2 = 4.0;
        
        
        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        
        System.out.println("Triangulo retangulo com catetos: " + cateto1 + " e " + cateto2);
        System.out.println("Hipotenusa: " + hipotenusa);
        
        
        cateto1 = 5.0;
        cateto2 = 12.0;
        hipotenusa = calcularHipotenusa(cateto1, cateto2);
        
        System.out.println("Triangulo retangulo com catetos: " + cateto1 + " e " + cateto2);
        System.out.println("Hipotenusa: " + hipotenusa);
    }
    
    
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        
        return Math.hypot(cateto1, cateto2);
        
        
    }
}
    


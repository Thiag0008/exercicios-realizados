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
public class exercicio_4 {
    
   public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }
    
    
    public static double lerTemperaturaCelsius() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        return teclado.nextDouble();
    }
    
   
    public static void imprimirResultado(double celsius, double fahrenheit) {
        System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, fahrenheit);
    }
    
    
    public static void main(String[] args) {
        
        double temperaturaCelsius = lerTemperaturaCelsius();
        
        
        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);
        
        
        imprimirResultado(temperaturaCelsius, temperaturaFahrenheit);
    }
}
    


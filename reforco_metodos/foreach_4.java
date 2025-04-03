/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

/**
 *
 * @author Aluno
 */
public class foreach_4 {
    
    public static void main(String[] args) {
        
       double[]notas = {8.5,7.0,9.3,6.5}; 
       double media = calcularMedia(notas);
        System.out.println("media das notas: " +media);
        
        
        
    }

    public static double calcularMedia(double[] notas) {
       double soma = 0;
       for(double nota : notas) {
           soma+=nota;
           
       }
       return soma / notas.length;
       
       
       
    }
        
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    


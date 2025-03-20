/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_FOR_EACH;

/**
 *
 * @author Aluno
 */
public class exercicio_4 {
    
    public static void main(String[] args) {
        
      double[] nota = {1.1,2.2,3.3,4.4,5.5};
      double soma = 0;
      
      for (double numero : nota) {
          soma+= numero;
      }
        
       double media = soma / nota.length;
       
        System.out.println("essa e a media das notas" +media);
        
        
        
        
        
        
        
        
      }
    
    
    
    
    
    
    
    
    }

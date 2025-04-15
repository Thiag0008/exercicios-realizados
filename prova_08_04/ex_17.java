/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;

/**
 *
 * @author Aluno
 */
public class ex_17 {
    
    public static void main(String[] args) {
        
        
        int[][] matriz = {
            
            {1,2,10},
            {4,10,6},
            {10,8,9}
        };
        
        
        int somaSecundaria = 0;
        
        for (int i = 0; i < 3; i++) {
          
            
            
            somaSecundaria += matriz[i][2 - i];
            
        }
        
        System.out.println("matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz [i][j] + " ");
            }
            
            System.out.println();
            
        } 
        
        
       System.out.println("soma secundaria: " +somaSecundaria);
        
        
        
        
        
        
    }
    
}

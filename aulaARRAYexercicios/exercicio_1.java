/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaARRAYexercicios;

/**
 *
 * @author Aluno
 */
public class exercicio_1 {
    
    public static void main(String[] args) {
        
        double[] notas = {8.5,9.0,7.5,6.0,10.0};
        double media = 0;
        
        for(double nota : notas) {
            media += nota;
        }
        media /= notas.length;
        System.out.println("media das notas: " +media);
        
    }
    
}

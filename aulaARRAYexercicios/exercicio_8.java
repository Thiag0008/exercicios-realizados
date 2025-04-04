/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaARRAYexercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */


public class exercicio_8 {
    public static void main(String[] args) {
        
        String[] frutas = {"maca", "banana", "manga", "laranja", "melancia", "melancia"};
        
        Set<String> conjunto = new HashSet<>(Arrays.asList(frutas));
        
        String[] arraySemDuplicadas = conjunto.toArray(new String[0]);
        
        System.out.println("Array com duplicadas: " + Arrays.toString(frutas));
        System.out.println("Array sem duplicadas: " + Arrays.toString(arraySemDuplicadas));
    }
}

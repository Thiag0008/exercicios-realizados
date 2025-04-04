/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaARRAYexercicios;

/**
 *
 * @author Aluno
 */
public class exercicio_5 {
    
    public static void main(String[] args) {
       
        String[]naipes = {"copas","ouros","paus","espadas"};
        String[]valores = {"as","2","3","4","5","6","7","8","9","10","valete","dama"};
        String[]baralho = new String [52];
        
        int indice = 0;
        
        for(String naipe : naipes) {
       for(String valor : valores) {
           baralho[indice++] = valor + "de" +naipe;
       }   
}
        for(String carta : baralho){
            System.out.println(carta);
        }
        
        
        
        
        
        
        
    }
    
}

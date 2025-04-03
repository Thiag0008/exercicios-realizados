/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;
import java.util.HashSet;

/**
 *
 * @author contr
 */
public class foreach_5 {
    
    public static void main(String[] args) {
        
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Maca");
        conjunto.add("Banana");
        conjunto.add("Laranja");
        conjunto.add("Uva");
        conjunto.add("Morango");
        
        
        exibirElementos(conjunto);
    }
    
    
    public static void exibirElementos(HashSet<String> conjunto) {
        
        if (conjunto.isEmpty()) {
            System.out.println("O conjunto está vazio.");
            return;
        }
        
        System.out.println("Elementos do HashSet:");
        
        
        for (String elemento : conjunto) {
            System.out.println("- " + elemento);
        }
        
        
        System.out.println("elemetos ao todo sao: " + conjunto.size());
    }
}
    


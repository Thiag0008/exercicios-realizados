/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforco_metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class if_5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite seu login: ");
        String login = sc.nextLine();
        
        if(verificarLogin(login)){
            System.out.println("login invalido");
        }else{
            System.out.println("login invalido");
        }
        
    }

    public static boolean verificarLogin(String login) {
        return login.length() >= 6 && !login.contains(" ");
    }
    
    
}

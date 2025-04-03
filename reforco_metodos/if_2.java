/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforcos_metodos;
import java.util.Scanner;

/**
 *
 * @author contr
 */
public class if_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        
        System.out.print("Digite seu turno (M para Manha, T para Tarde, N para Noite): ");
        String turno = sc.nextLine().toUpperCase();
        
        
        String saudacao = gerarSaudacao(nome, turno);
        System.out.println(saudacao);
        
        
    }
    
    
    public static String gerarSaudacao(String nome, String turno) {
        String mensagem;
        
        if (turno.equals("M")) {
            mensagem = "Bom dia, " + nome + "! Tenha um bom turno da manha de estudos!";
        } else if (turno.equals("T")) {
            mensagem = "Boa tarde, " + nome + " Aproveite seus estudos nesta tarde!";
        } else if (turno.equals("N")) {
            mensagem = "Boa noite, " + nome + " Desejo um belo período noturno de estudos!";
        } else {
            mensagem = "Ola, " + nome + "vou chamar a policia";
        }
        
        return mensagem;
    }
}
   


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_casa_WHILE;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author contr
 */
public class atv_5_WHILE {
    
        Scanner teclado = new Scanner(System.in);
        


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        
        String escolhaUsuario;
        int numeroUsuario;
        int numeroComputador;
        int soma;
        boolean continuarJogo = true;
        int vitoriasUsuario = 0;
        int vitoriasComputador = 0;
        
        System.out.println("=== JOGO DE PAR OU IMPAR ===");
        System.out.println("Digite 'sair' a qualquer momento para encerrar o jogo");
        
        while (continuarJogo) {
            // Usuário escolhe par ou ímpar
            System.out.print("Escolha 'par' ou 'impar': ");
            escolhaUsuario = teclado.next().toLowerCase();
            
            // Verificar se o usuário quer sair
            if (escolhaUsuario.equals("sair")) {
                continuarJogo = false;
                continue;
            }
            
            // Validar a escolha do usuário
            while (!escolhaUsuario.equals("par") && !escolhaUsuario.equals("impar")) {
                System.out.println("Escolha invalida! Digite 'par' ou 'impar':");
                escolhaUsuario = teclado.next().toLowerCase();
                
                if (escolhaUsuario.equals("sair")) {
                    continuarJogo = false;
                    break;
                }
            }
            
            if (!continuarJogo) {
                continue;
            }
            
            
            System.out.print("Digite um numero de 0 a 5: ");
            
            
            while (!teclado.hasNextInt()) {
                String entrada = teclado.next();
                if (entrada.equals("sair")) {
                    continuarJogo = false;
                    break;
                }
                System.out.println("Entrada invalida! Digite um numero de 0 a 5:");
            }
            
            if (!continuarJogo) {
                continue;
            }
            
            numeroUsuario = teclado.nextInt();
            
           
            while (numeroUsuario < 0 || numeroUsuario > 5) {
                System.out.println("Numero invalido! Digite um numero de 0 a 5:");
                
                
                while (!teclado.hasNextInt()) {
                    String entrada = teclado.next();
                    if (entrada.equals("sair")) {
                        continuarJogo = false;
                        break;
                    }
                    System.out.println("Entrada invalida! Digite um numero de 0 a 5:");
                }
                
                if (!continuarJogo) {
                    break;
                }
                
                numeroUsuario = teclado.nextInt();
            }
            
            if (!continuarJogo) {
                continue;
            }
            
            
            numeroComputador = random.nextInt(6); 
            
            
            soma = numeroUsuario + numeroComputador;
            boolean ehPar = (soma % 2 == 0);
            
            
            System.out.println("\nVocê escolheu: " + numeroUsuario);
            System.out.println("O computador escolheu: " + numeroComputador);
            System.out.println("Soma: " + soma + " (" + (ehPar ? "par" : "ímpar") + ")");
            
            
            if ((ehPar && escolhaUsuario.equals("par")) || (!ehPar && escolhaUsuario.equals("impar"))) {
                System.out.println("Voce ganhou esta rodada!");
                vitoriasUsuario++;
            } else {
                System.out.println("O computador ganhou esta rodada!");
                vitoriasComputador++;
            }
            
           
            System.out.println("\nPLACAR:");
            System.out.println("Você: " + vitoriasUsuario);
            System.out.println("Computador: " + vitoriasComputador);
        }
        
        
        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println("Placar final:");
        System.out.println("Voce: " + vitoriasUsuario);
        System.out.println("Computador: " + vitoriasComputador);
        
        if (vitoriasUsuario > vitoriasComputador) {
            System.out.println("Parabens! Voce venceu o jogo!");
        } else if (vitoriasComputador > vitoriasUsuario) {
            System.out.println("O computador venceu o jogo. Mais sorte na proxima!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
        
        teclado.close();
    }
}
    


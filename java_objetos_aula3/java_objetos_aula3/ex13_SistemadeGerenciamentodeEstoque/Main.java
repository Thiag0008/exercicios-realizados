/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex13_SistemadeGerenciamentodeEstoque;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Produto celular = new Eletronico("Smartphone", 1500.00, 10);
        Produto camiseta = new Roupa("Camiseta Polo", 79.90, 50);
        Produto arroz = new Alimento("Arroz 5kg", 25.90, 100);

        Produto[] produtos = {celular, camiseta, arroz};

        for (Produto p : produtos) {
            System.out.println(p.obterNome() + " - R$" + p.obterPreco() +
                               " | Estoque: " + p.obterQuantidadeEmEstoque());
        }
    }
}


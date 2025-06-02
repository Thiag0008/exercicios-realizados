/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex13_SistemadeGerenciamentodeEstoque;

/**
 *
 * @author contr
 */
public class Eletronico implements Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Eletronico(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String obterNome() {
        return nome;
    }

    @Override
    public double obterPreco() {
        return preco;
    }

    @Override
    public int obterQuantidadeEmEstoque() {
        return estoque;
    }
}


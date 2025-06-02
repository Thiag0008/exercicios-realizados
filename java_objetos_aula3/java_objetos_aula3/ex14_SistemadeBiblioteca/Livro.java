/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_SistemadeBiblioteca;

/**
 *
 * @author contr
 */
public class Livro implements Midia {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String obterTitulo() {
        return titulo;
    }

    @Override
    public String obterAutor() {
        return autor;
    }

    @Override
    public void emprestar() {
        System.out.println("Livro '" + titulo + "' emprestado.");
    }
}


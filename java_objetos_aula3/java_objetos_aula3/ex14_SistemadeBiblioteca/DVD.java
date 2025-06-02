/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_SistemadeBiblioteca;

/**
 *
 * @author contr
 */
public class DVD implements Midia {
    private String titulo;
    private String diretor;

    public DVD(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
    }

    @Override
    public String obterTitulo() {
        return titulo;
    }

    @Override
    public String obterAutor() {
        return diretor;
    }

    @Override
    public void emprestar() {
        System.out.println("DVD '" + titulo + "' emprestado.");
    }
}


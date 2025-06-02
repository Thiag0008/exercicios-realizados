/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_SistemadeBiblioteca;

/**
 *
 * @author contr
 */
public class Revista implements Midia {
    private String titulo;
    private String editor;

    public Revista(String titulo, String editor) {
        this.titulo = titulo;
        this.editor = editor;
    }

    @Override
    public String obterTitulo() {
        return titulo;
    }

    @Override
    public String obterAutor() {
        return editor;
    }

    @Override
    public void emprestar() {
        System.out.println("Revista '" + titulo + "' emprestada.");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_SistemadeBiblioteca;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Midia livro = new Livro("1984", "George Orwell");
        Midia revista = new Revista("Superinteressante", "Abril");
        Midia dvd = new DVD("Matrix", "Wachowski");

        Midia[] colecao = {livro, revista, dvd};

        for (Midia m : colecao) {
            System.out.println("Título: " + m.obterTitulo() + " | Autor: " + m.obterAutor());
            m.emprestar();
        }
    }
}


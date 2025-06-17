/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author contr
 */


public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int ano;

    public Filme(int id, String titulo, String genero, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public Filme(String titulo, String genero, int ano) {
        this(0, titulo, genero, ano);
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAno() { return ano; }

    public void setId(int id) { this.id = id; }
}

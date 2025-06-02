/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_FuncionariocomInterface;

/**
 *
 * @author contr
 */
public class FuncionarioAssalariado implements Pagavel {
    private String nome;
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pagamentos;

/**
 *
 * @author contr
 */

public class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println(" Processando pagamento com Cartão no valor de R$ " + valor);
    }
}

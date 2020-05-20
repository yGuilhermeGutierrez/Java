/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios19052020;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ComissaodeVenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preco, qtde, q1, comissao;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o preço unitário da peça? ");
        preco =entrada.nextDouble();
        System.out.println("Qual a quantidade de peças que serão vendidas?");
        qtde =entrada.nextDouble();
        
        //processamento
        q1 = preco*qtde;
        comissao = (q1*5)/100;
        //saida
        System.out.println("A comissão à ser paga será de "+comissao);
    }
    
}

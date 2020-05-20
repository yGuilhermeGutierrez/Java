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
public class ConversaoDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor, dolar, conversao;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em real que quer converter: ");
        valor = entrada.nextDouble();
        //processamento
        dolar = 4.50;
        conversao = valor/dolar;
        //saida
        System.out.println("O valor em dólar será: "+conversao);
    }
    
}

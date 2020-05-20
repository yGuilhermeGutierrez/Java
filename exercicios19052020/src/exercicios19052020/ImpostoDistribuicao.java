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
public class ImpostoDistribuicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c, r1, r2, impostos, distribuicao;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do veículo ");
        c = entrada.nextDouble();
        //processamento
        impostos = c*45/100;
        r1 = c+impostos;
        distribuicao = r1*28/100;
        r2 = r1+distribuicao;
        //saida
        System.out.println("O valor do carro, acrescentado os impostos e a distribuição será" +r2+" R$");
    }
    
}

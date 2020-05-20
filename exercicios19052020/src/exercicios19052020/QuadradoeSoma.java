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
public class QuadradoeSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2, n3, n4, q1, q2, q3, q4, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os quatro números separados ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        n4 = entrada.nextDouble();
        
        //processamento
        q1 = n1*n1;
        q2 = n2*n2;
        q3 = n3*n3;
        q4 = n4*n4;
        resultado = q1+q2+q3+q4;
        //saida
        System.out.println("O resultado da operação é "+resultado);
    }
    
}

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
public class HoraMinuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hora, minuto, converte;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        hora =entrada.nextDouble();
        System.out.println("Digite os minutos: ");
        minuto =entrada.nextDouble();
        
        //processamento
        converte = (minuto/60)+hora;
        //saida
        System.out.println("Em segundos, o tempo é equivalente à "+converte);
    }
    
}

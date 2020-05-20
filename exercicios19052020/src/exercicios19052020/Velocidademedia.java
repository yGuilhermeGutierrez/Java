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
public class Velocidademedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double percurso, hora, totalhora, minuto, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a distância do percurso em KM?");
        percurso =entrada.nextDouble();
        System.out.println("Quantas horas para finalizar o percurso? (se for apenas em minutos, deixe em branco)");
        hora =entrada.nextDouble();
        System.out.println("Quantos minutos para finalizar o percurso? (se não houver, deixe em branco)");
        minuto =entrada.nextDouble();
        
        //processamento
        totalhora = minuto/60 + (hora);
        resultado = percurso/totalhora;
        //saida
        System.out.println("A velocidade média do veículo deverá ser de: "+ resultado+ " km/h");
    }
    
}

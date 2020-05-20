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
public class Horaextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hora, minuto, valor, resultado, extra, adicional;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("No mês todo, quantas horas você trabalhou? Digite a hora ");
        hora =entrada.nextDouble();
        System.out.println("E os minutos? Digite os minutos");
        minuto =entrada.nextDouble();
        System.out.println("Quanto você ganha por hora?");
        valor =entrada.nextDouble();
        
        //processamento
        extra = (minuto/60)+(hora)*valor;
        adicional = (70*extra)/100;
        resultado = adicional+extra;
        //saida
        System.out.println("O valor será de "+resultado);
    }
    
}

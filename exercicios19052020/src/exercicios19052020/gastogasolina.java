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
public class gastogasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km, consumo, preco, totalconsumo, ida, volta;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quandos kilometros você irá percorrer? ");
        km =entrada.nextDouble();
        System.out.println("Quanto seu carro consome de gasolina?");
        consumo =entrada.nextDouble();
        System.out.println("Qual o preço médio da gasolina");
        preco =entrada.nextDouble();
        
        //processamento
        totalconsumo = km/consumo;
        ida = totalconsumo*preco;
        volta = ida*2;
        //saida
        System.out.println("Na ida, você irá gastar"+ida+" reais, e na ida e volta gastará"+volta+" reais");
    }
    
}

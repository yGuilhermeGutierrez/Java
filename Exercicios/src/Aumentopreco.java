
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Aumentopreco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variaveis
        double preco, resul;
        String nome;
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        nome =entrada.next();
        
        System.out.println("Digite o preço do Produto:");
        preco = entrada.nextDouble();
        //processamento
        resul= (preco*1.65);
        //saida
        System.out.println("Você vai vender o produto: "+nome+" por R$"+resul);
    }
    
}

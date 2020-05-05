
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
public class Retangulo {
    
    
    public static void main(String[] args) {
        //variaveis
        double base, altura, area, perimetro;
        
        Scanner leitura = new Scanner(System.in);
        //entrada
        System.out.println("Digite a base do retângulo:");
        base = leitura.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        altura = leitura.nextDouble();
        //processamento
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        
        //Saida
        System.out.println("A área do retangulo é: "+area);
        System.out.println("O Perímetro do retângulo é "+perimetro);
    }
    
}

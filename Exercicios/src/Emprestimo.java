
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
public class Emprestimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variaveis
        double emp,taxa, result;
        int temp;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quanto quer emprestado:");
        emp =entrada.nextDouble();
        System.out.println("Em quantos meses vai pagar?");
        temp= entrada.nextInt();
        
        taxa =0.02;
            //processamento
           
           result = emp*(Math.pow((1+taxa), temp));
      
           //saida
           System.out.println("Ao final de "+ temp+ " meses, você pagará R$"+result +"reais");
        
    }
    
}

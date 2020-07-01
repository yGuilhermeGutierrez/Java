
package Condicionais;

import javax.swing.JOptionPane;


public class Triangulo {

    public static void main(String[] args) {
        double a,b,c;
a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo:"));
        
b= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triângulo:"));
        
c= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo:"));


if (((a <(b+c)) && (a >(Math.abs(b-c)))) && ((b <(a+c)) && (b >(Math.abs(a-c)))) && ((c <(b+a)) && (b >(Math.abs(b-a))))) {
        
    if(((a==b)&& (b==c))){
        JOptionPane.showMessageDialog(null, "É um triângulo equilátero");
        
    }
    if(((a!=b) && (b!=c) && (a!=c))){
        JOptionPane.showMessageDialog(null, "É um triângulo escaleno");
        
    }
    if((((a==b) && (c!=b)) || ((b==c) && (c!=a)) || ((a==c) && (c!=b)))){
        JOptionPane.showMessageDialog(null, "É um triângulo isóceles");
    
    JOptionPane.showMessageDialog(null, "É um triângulo");    
        
}else{
    JOptionPane.showMessageDialog(null, "Não é um triângulo"); 
            
    }
    
    }
    
    }
}

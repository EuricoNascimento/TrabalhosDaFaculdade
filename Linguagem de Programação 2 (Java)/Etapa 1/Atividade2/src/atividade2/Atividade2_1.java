package atividade2;

import javax.swing.JOptionPane;
public class Atividade2_1 {
    
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        numero=numero%2;
        
        if(numero==0){
            System.out.println("O numero é par" );
        } else {
            System.out.println("O numero é impar");
        };
        
    }
    
}

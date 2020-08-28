package atividade2;

import javax.swing.JOptionPane;

public class Atividade2_3 {

    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digete um numero"));
        
        if(numero1!=numero2){
            numero1=numero1*numero1;
            numero2=numero2*numero2;
            System.out.println("Numero 1 = " + numero1 +"\nNumero 2 = " + numero2);
        } else {
            numero1=numero1*numero1*numero1;
            System.out.println("O numro 1 e 2 = "+numero1);
        }
        
    }
    
}

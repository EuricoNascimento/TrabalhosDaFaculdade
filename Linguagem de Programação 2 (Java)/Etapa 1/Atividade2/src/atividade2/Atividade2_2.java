package atividade2;

import javax.swing.JOptionPane;
public class Atividade2_2 {

    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        
        numero=numero*2;
        
        if(numero>30){
            System.out.println("Numero: "+numero);
        }
        
    }
    
}

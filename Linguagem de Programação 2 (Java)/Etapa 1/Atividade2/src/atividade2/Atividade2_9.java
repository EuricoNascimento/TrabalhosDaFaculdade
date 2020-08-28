package atividade2;

import javax.swing.JOptionPane;

public class Atividade2_9 {

    public static void main(String[] args) {
        
        int numero, modulo5, modulo3;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        
        modulo5=numero%5;
        modulo3=numero%3;
        if(modulo5==0 & modulo3!=0){
            System.out.println("O numero " + numero + "é divisivel por 5 e não por 3");
        } else if(modulo5!=0 & modulo3==0){
            System.out.println("O numero " + numero + "é divisivel por 5 e não por 3");
        }
    
}

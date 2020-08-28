package atividade2;

import javax.swing.JOptionPane;
public class Atividade2_4 {

    public static void main(String[] args) {
        
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        
        if(idade>4 && idade<8){
            System.out.println("Infantil A");
        } else if (idade>7 && idade<11){
            System.out.println("Infantil B");
        } else if (idade>10 && idade<14){
            System.out.println("Juvenil A");
        } else if (idade>13 && idade<18){
            System.out.println("Juvenil B");
        }
        
    }
    
}

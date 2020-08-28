package atividade.pkg3;

import javax.swing.JOptionPane;
public class Atividade3_5 {

    public static void main(String[] args) {
        
        int natural, i;
        
        natural = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        for(i=natural;i>=0;i--)
            System.out.println(i);
        
        
    }
    
}

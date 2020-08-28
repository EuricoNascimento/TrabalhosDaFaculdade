package atividade.pkg3;

import javax.swing.JOptionPane;
public class Atividade3_3 {

    public static void main(String[] args) {
        
        int inferior, superior, i;
        
        inferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior: "));
        superior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior: "));
        
        for(i=inferior;i<=superior;i++)
            System.out.println(" "+i);
        
    }
    
}

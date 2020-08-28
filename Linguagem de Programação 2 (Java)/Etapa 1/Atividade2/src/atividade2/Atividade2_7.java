package atividade2;

import javax.swing.JOptionPane;

public class Atividade2_7 {

    public static void main(String[] args) {
        
        String senha;
        
        senha = JOptionPane.showInputDialog("Senha");
        
        if(senha.equals("123ab"))
            System.out.println("Login feito com suceesso");
        
    }
    
}

package atividade.pkg3;

import javax.swing.JOptionPane;
public class Atividade3_4 {

    public static void main(String[] args) {
        
        int i,numero,par=0,impar=0;
        
        for(i=0;i<10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            if(numero%2==0){
                par++;
            }
            else {
                impar++;
            }
        }
        
        System.out.println("Tem "+impar+" numeros impares e "+par+" numeros pares");
        
    }
    
}

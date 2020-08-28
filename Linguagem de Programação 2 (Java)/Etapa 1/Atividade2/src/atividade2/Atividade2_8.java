package atividade2;

import javax.swing.JOptionPane;
public class Atividade2_8 {

    public static void main(String[] args) {
        
        float altura;
        float peso;
        float resultado;
        
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
        
        resultado=peso/(altura*altura);
        
        if(resultado<20){
            System.out.println("Abaixo do peso");
        } else if (resultado>=20 && resultado<=25){
            System.out.println("Normal");
        } else if (resultado>25 && resultado<=30){
            System.out.println("Acima do peso");
        } else if (resultado>30 && resultado<=35){
            System.out.println("Obesidade");
        } else if (resultado>35){
            System.out.println("Obesadade Morbida");
        }

    }
    
}

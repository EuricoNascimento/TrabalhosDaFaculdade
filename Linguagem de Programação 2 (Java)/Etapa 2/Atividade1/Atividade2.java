package atividade1;

import javax.swing.JOptionPane;
public class Atividade2 {
    
    float salario (float x, float y){
        float result = x*((y/100)+1);
        return result;
        
    }
    public static void main(String[] args) {
        Atividade2 atividade = new Atividade2();
        float salario, porcentagem, reajustado;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));
        porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do reajuste"));
        reajustado = atividade.salario(salario, porcentagem);
        System.out.println("O novo salario é de "+reajustado);
    }
    
}

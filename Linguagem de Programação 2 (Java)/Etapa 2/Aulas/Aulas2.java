package aulas;

import javax.swing.JOptionPane;

public class Aulas2 {
    
    public int algebra (int x){
        int resultado;
        resultado = (3*(x*x))+(2*x)+7;
        return resultado;
    }
    public static void main(String[] args) {
        Aulas2 aulas = new Aulas2();
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite numero inteiro: "));
        System.out.println("Resultado: "+aulas.algebra(x));
    }
    
}

package atividade1;
import javax.swing.JOptionPane;
public class Atividade6 {
    void fibonacci (int x){
        int f=1,b=1,aux=1;
        for(int i=0; i<x;i++){
            if(i<=1){
                System.out.print("1 ");
            }else{
                f=aux;
                aux=b;
                b=b+f;
                System.out.print(b+" ");
            }
        }
    }
    public static void main(String[] args) {
        Atividade6 metodo = new Atividade6();
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a sequencia"));
        metodo.fibonacci(x);
    }
    
}

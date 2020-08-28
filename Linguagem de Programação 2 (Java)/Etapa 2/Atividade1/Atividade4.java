package atividade1;
import javax.swing.JOptionPane;
public class Atividade4 {
    static int divisivel (int x, int y){
        if(x%y==0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        int x, y, r;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        r = divisivel(x,y);
        if(r>0)
            System.out.println(x+" é divisivel por "+y);
        else
            System.out.println(x+" não é divisivel por "+y);
    }
    
}

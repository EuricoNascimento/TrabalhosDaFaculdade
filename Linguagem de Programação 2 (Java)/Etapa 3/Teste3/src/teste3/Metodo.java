package teste3;
import javax.swing.JOptionPane;
public class Metodo {
    protected int atividade(){
        int ran1 = (int) (1+(Math.random()*10));
        int ran2 = (int) (1+(Math.random()*10));
        
        int resultado = Integer.parseInt(JOptionPane.showInputDialog(ran1+"x"+ran2+"=??"));
        int total = ran1* ran2;
        if(total==resultado){
            JOptionPane.showMessageDialog(null,"Você acertou ganhe dois pontos", null, JOptionPane.PLAIN_MESSAGE);
            return 2;
        } else {
           return -1;
        }
        
        
    }
}

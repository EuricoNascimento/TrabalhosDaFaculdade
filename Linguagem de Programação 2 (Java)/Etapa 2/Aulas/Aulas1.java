package aulas;


public class Aulas1 {
    
    public  void soma(int a, int b){
        int resultado = a+b;
        System.out.println("RESULTADO: "+resultado);
    }
    public static void main(String[] args) {
        Aulas1 aulas = new Aulas1();
        int x=3;
        int y=5;
        aulas.soma(x, y);
    }
    
}

package exceções;
import java.util.Scanner;
public class DivisãoPorZero {

    public static int quociente (int numerador,int denominador){
        return numerador/denominador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Primeiro Valor: ");
        int numerador = scanner.nextInt();
        System.out.println("Segundo Valor: ");
        int denominador = scanner.nextInt();
        
        int resultado = quociente (numerador, denominador);
        System.out.println("\nResultado "+numerador+" / "+denominador+" = "+resultado);
        
    }
    
}

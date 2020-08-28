package exceções;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisãoPorZeroCorrigido {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Primeiro Valor: ");
        int numerador = scanner.nextInt();
        System.out.println("Segundo Valor: ");
        int denominador = scanner.nextInt();
        
        int resultado = numerador/denominador;
        System.out.println("\nResultado "+numerador+" / "+denominador+" = "+resultado);
        }catch(InputMismatchException inputMismatchException){
            System.err.printf("\nException: %s\n", inputMismatchException);
            scanner.nextLine();
            System.out.println("Você deve inserir numeros inteiros");
        }catch(ArithmeticException arithmeticException){
            System.err.printf("\nException: %s\n", arithmeticException);
            System.out.println("Zero é um denominador invalido!"+"\nTente novamente");
        }
    }
    
}

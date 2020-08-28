package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZeroException {
		
	public static void main( String args[] ){
		
		Scanner scanner = new Scanner( System.in );				
		
        try {
        	System.out.print( "Primeiro Valor: " );
    		int numerador = scanner.nextInt();
    		System.out.print( "Segundo Valor: " );
    		int denominador = scanner.nextInt();

    		int resultado = numerador / denominador;
    		
    		System.out.println("\nResultado: "+numerador+" / "+denominador+
    				            " = "+resultado);
         }catch (InputMismatchException inputMismatchException ){        	 
            System.err.printf( "\nException: %s\n", inputMismatchException );
            // descarta a entrada para o usuario tentar de novo
            scanner.nextLine();            
            System.out.println("Você deve inserir números inteiros!"
            		           + "Tente novamente.\n" );            
         }catch ( ArithmeticException arithmeticException ){
            System.err.printf( "\nException: %s\n", arithmeticException );
            System.out.println("Zero é um denominador Inválido! Tente novamente.\n" );
         }		
   }
}
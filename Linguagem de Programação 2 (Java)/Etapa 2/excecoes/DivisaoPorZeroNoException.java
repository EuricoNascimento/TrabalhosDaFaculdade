package excecoes;

import java.util.Scanner;

public class DivisaoPorZeroNoException {	
	
	/*
	 *demonstra o disparo de uma exceção quando ocorre uma 
	 *divisão por zero 
	 */	
	public static int quociente( int numerador, int denominador ){
		// possível divisão por zero
		return numerador / denominador; 
	}

	public static void main( String args[] ){
		
		Scanner scanner = new Scanner( System.in ); 

		System.out.print( "Primeiro Valor: " );
		int numerador = scanner.nextInt();
		System.out.print( "Segundo Valor: " );
		int denominador = scanner.nextInt();

		int resultado = quociente( numerador, denominador );
		
		System.out.println("\nResultado: "+numerador+" / "+denominador+
				            " = "+resultado);
   }
}
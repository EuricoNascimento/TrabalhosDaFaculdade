package metodos;

import java.math.*;

public class func_predefinidas {

	public static void main(String[] args) {
		double valorMax, valorMin, valorAbs, valorArred;
		
		int maxInt;
		
		valorMax = Math.max(2.5, 1.75);
		System.out.println("Máximo: "+valorMax);
		System.out.println("Máximo: "+Math.max(2.5, 1.75));
		
		maxInt = Math.max(3,5);
		System.out.println("Máx Int: "+maxInt);
		
		valorMin = Math.min(2.5, 1.75);
		System.out.println("Máximo: "+valorMin);
		
		valorAbs = Math.abs(-7.75);
		System.out.println("Valor Absoluto: "+valorAbs);
		
		valorArred = Math.floor(6.9);
		//Arredonda para o maior valor inteiro, e não maior
		System.out.println("Valor Arredondado Floor: "+valorArred);
		
		valorArred = Math.round(7.8);
		//Arredonda para o maior valor
		System.out.println("Valor Arredondado Round: "+valorArred);
		
		System.out.println("2 elevado a 3: "+Math.pow(2, 10));
		
		System.out.println("Raiz de 81: "+Math.sqrt(81));
	}
}

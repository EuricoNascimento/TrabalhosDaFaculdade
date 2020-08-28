package metodos;

public class TestaFuncoes {

	public static void main(String[] args) {
		
		int x = 3, y = 5, soma, subtracao;
		
		//Invoncar uma instância de uma classe
		Funcoes func = new Funcoes();
		
		soma = func.soma(x, y);
		
		subtracao = func.subtrair(x, y);	
		
		System.out.println(x + " + " + y + " = " + soma);
		System.out.println(x + " - " + y + " = " + subtracao);
	}
}

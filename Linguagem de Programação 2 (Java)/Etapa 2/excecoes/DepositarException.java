package excecoes;

public class DepositarException {
	
	private static double saldo;
	
	//Outra maneira de ser feito
	public static void depositar (double valor) throws Exception{
		if( valor < 0) {
			Exception erro = new Exception();
			throw erro;			
		} else {
			saldo = saldo + valor;
			System.out.println("Valor depositado");
		}
	}
	
	public static void depositar2 (double valor){
		if( valor < 0) 
			throw new IllegalArgumentException("Houve um erro ao depositar");		
		else {
			saldo = saldo + valor;
			System.out.println("Valor depositado");
		}
	}

	public static void main(String[] args) {		
		saldo = 1000;		
		/*  
			//Outra maneira de ser feito
			try {
				depositar(100);
			}catch (Exception e) {
				System.out.println("Houve um erro ao depositar");
			}
		*/		
		try {
			depositar2(-100);
		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

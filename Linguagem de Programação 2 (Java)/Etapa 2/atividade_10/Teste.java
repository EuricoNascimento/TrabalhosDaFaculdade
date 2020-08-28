package atividade_10;

import atividade_10.Funcionario;
import atividade_10.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Pedro");
		func.setSalario(800.00);	
		System.out.println("Funcionário >> \n\t"+func.toString());
		
		Professor prof = new Professor();
		prof.setNome("José");
		prof.setSalario(1000.00);
		prof.setHorasDeAula(20);
		System.out.println("\nProfessor >> \n\t"+prof.toString());
	}
}

package atividade_10;

public class Professor extends Funcionario{
	
	private int horasDeAula;	
	
	public int getHorasDeAula() {
		return horasDeAula;
	}
	
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
	public double getTotalSalarial() {
		return this.getSalario() + this.horasDeAula * 20;
	}	
	
	@Override
	public String toString() {
		return super.toString() + "\n\tHoras de Aula: " + 
				this.horasDeAula + "\n\tSalário Total: " + getTotalSalarial();
	}	
}

package teste;

public class Professor extends Funcionario{
    
    double horaAula;

    public double getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(double horaAula) {
        this.horaAula = horaAula;
    }
    
    public double calcular(){
        return this.salario+(this.horaAula*20);
    }
    
}

package teste;

public class Teste {
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Professor p = new Professor();
        
        p.nome = "Eduardo";
        p.salario = 1000.10;
        p.horaAula = 20;
        double salariototal = p.calcular();
        
        f.nome = "Eurico";
        f.salario = 1050.90;
        
        System.out.println("Funcionario\nNome: "+f.nome);
        System.out.println("Salario: "+f.salario);
        System.out.println("Professor\nNome: "+p.nome);
        System.out.println("Salario: "+p.salario);
        System.out.println("Hora aula: "+p.horaAula);
        System.out.println("Salario total: "+salariototal);
        
        
        
    }
    
}

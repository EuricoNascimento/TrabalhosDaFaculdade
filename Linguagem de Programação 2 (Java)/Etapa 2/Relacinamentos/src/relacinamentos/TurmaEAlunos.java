package relacinamentos;

public class TurmaEAlunos {
    
    public static void main(String[] args) {
        Alunos a = new Alunos();
        Turmas t = new Turmas();
        
        t.turmas = "A";
        a.nome = "Eurico";
        
        a.turma = t;
        
        System.out.println(a.nome);
        System.out.println(a.turma);
    }
    
}

package prjpessoa;

public class PrjPessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eurico Nascimento Faria Neto");
        pessoa.setIdade(21);
        pessoa.setAltura(1.93);
        pessoa.setPeso(109.5);
        System.out.println(pessoa.toString());
    }
    
}

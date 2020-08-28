package questões;
import java.util.Scanner;
public class Questões1{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Comandos comando = new Comandos();
        int opcao;
        double aux;
        
        System.out.println("Nome: ");
        comando.nome=scan.nextLine();
        System.out.println("Conta: ");
        comando.numero=scan.nextInt();
        comando.saldo=1000.5;
        comando.limite=1000.5;
        System.out.println("Saldo de: "+comando.saldo);
        System.out.println("\n1-saque\n2-Deposito\n3-Tansferencia");
        opcao = scan.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o valor do saque");
                if(comando.sacar(scan.nextDouble(),comando.saldo)==true){
                    System.out.println("Saque realizado com sucesso\nSaldo atual: "+comando.saldo);
                }else
                    System.out.println("Saque invalido");
                break;
            case 2:
                System.out.println("Deseja depositar quanto");
                comando.depositar(scan.nextDouble(), comando.saldo);
                System.out.println("Deposito realizado com sucesso\nSaldo atual: "+comando.saldo);
                break;
            case 3:
                System.out.println("Deseja depositar quanto");
                comando.transferir(scan.nextDouble(), comando.saldo);
                System.out.println("Deposito realizado com sucesso\nSaldo atual: "+comando.saldo);
                break;
        }
    }
    
}

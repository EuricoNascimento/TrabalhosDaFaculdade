package questões;

public class Comandos extends Conta{
    boolean sacar (double valor, double sald){
        if(valor>sald){
            return false;
        } else{
            saldo=sald-valor;
            return true;
        }
    }
    void depositar(double valor, double sald){
        saldo=sald+valor;
    }
    void transferir(double valor, double sald){
        saldo=sald-valor;
    }
    
}

package cpf;
import java.util.Scanner;
public class CPF  extends ValidaçãoCPF{
    boolean validação(long cpf) {
        int fim1,fim2,result=0;
        int vet1[] = new int[9];
        
        fim1=cpf%100;
        fim2=fim1%10;
        fim1=fim1/10;
        cpf=cpf/100;
        
        for(int i=vet1.length;i>=0;i++){
            vet1[i]=cpf%10;
            cpf=cpf/10;
        }
        for(int i=0;i<9;i++){
            result=(vet1[i]*i+2)+result;
        }
        result=result/11;
        if(result>9){
            result=0;
        }
        if(result!=fim1){
            return false; 
        }
        result=fim1*2;
        for(int i=0;i<9;i++){
            result=(vet1[i]*i+3)+result;
        }
        result=result/11;
        if(result!=fim2){
            return false; 
        }else{
            return true;
        }
    }
    public static void main (String[] args) {
        CPF valida = new CPF();
        Scanner scanner = new Scanner(System.in);
        double c=0;
        System.out.println("Digite o cpf");
        c = scanner.nextLong();
        System.out.println(c);
        if(valida.validação(c)){
            System.out.println("CPF invalido");
        }else{
            System.out.println("CPF valido");
        }
        
    }
    
}

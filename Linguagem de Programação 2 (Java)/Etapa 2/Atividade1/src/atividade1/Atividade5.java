package atividade1;
import java.util.Scanner;;
public class Atividade5 {
    String mes (int x){
        switch (x){
            case 1:
                return "Janeiro";                
            case 2:
                return "Fevereiro";                
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Erro: mês invalido";
        }
    }
    public static void main(String[] args) {
        Atividade5 metodo = new Atividade5();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o mes: ");
        System.out.println(metodo.mes(entrada.nextInt()));
    }
    
}
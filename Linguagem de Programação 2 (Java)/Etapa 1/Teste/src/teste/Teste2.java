package teste;

import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int valor, cont=0, soma=0;
        
        do {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            cont++;
            soma+=valor;
        } while (valor >= 0);
        cont--;
        soma+=(valor*(-1));
        System.out.println("O total de repetições foi de "+cont+"\nSoma total é de "+soma);
    }
    
}

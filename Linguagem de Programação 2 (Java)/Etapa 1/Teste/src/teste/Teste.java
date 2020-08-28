package teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, mv=0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            if (i==1) {
                mv = valor;
            } else if (mv<valor){
                mv=valor;
            }
        }
        System.out.println("Maior valor: " + mv);
    }
    
}

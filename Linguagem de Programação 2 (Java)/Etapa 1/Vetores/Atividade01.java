package vetores;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for (int i=0;i<numeros.length;i++){
            System.out.print("Digite um numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i=0;i<numeros.length;i++)
            System.out.println(numeros[i]);
        
        
    }
    
}

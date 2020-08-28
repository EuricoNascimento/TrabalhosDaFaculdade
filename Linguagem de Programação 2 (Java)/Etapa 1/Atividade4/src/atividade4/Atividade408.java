package atividade4;

import java.util.Random;
import java.util.Scanner;

public class Atividade408 {
    
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner entrada = new Scanner(System.in);
        int vet[] =new int[10];
        int numero;
        int cont=0;
        
        System.out.print("Digite um numero: ");
        numero = entrada.nextInt();
        
        for(int i=0;i<vet.length;i++){
            vet[i]= gerador.nextInt(10);
            if(vet[i]==numero){
                cont++;
            }
        }
        System.out.println("O numero "+numero+" aparece no vetor "+cont);
        
    }
    
}

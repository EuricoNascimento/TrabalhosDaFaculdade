package atividade4;

import java.util.Scanner;
public class Atividade404 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        
        for(int i=0;i<vet3.length;i++){
            System.out.print("Digite um numero para o vetor 1: ");
            vet1[i] = entrada.nextInt();
            System.out.print("Digite um numero para o vetor 2: ");
            vet2[i] = entrada.nextInt();
            
            vet3[i]=vet1[i]+vet2[i];
        }
        
        for(int i=0;i<vet3.length;i++)
            System.out.println((i+1)+"° posição "+vet3[i]);
        
    }
    
}

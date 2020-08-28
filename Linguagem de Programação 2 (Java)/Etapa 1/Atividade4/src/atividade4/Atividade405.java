package atividade4;

import java.util.Scanner;

public class Atividade405 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vet[] = new int[3];
        
        for(int i=0;i<vet.length;i++){
            System.out.print("Digite um numero: ");
            vet[i] = entrada.nextInt();
            if(vet[i]==0){
                vet[i]=-1;
            }
            
        }
        
        for(int i=0;i<vet.length;i++)
            System.out.println(vet[i]);
        
    }
    
}

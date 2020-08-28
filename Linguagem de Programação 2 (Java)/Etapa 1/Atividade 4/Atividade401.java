package atividade4;

import java.util.Scanner;

public class Atividade401 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vet [] = new int[6];
        
        for(int i=0;i<vet.length;i++){
            System.out.print("Digite um numero: ");
            vet[i]= entrada.nextInt();
        }
        
        for(int i=vet.length -1;i>=0;i--){
            System.out.println(vet[i]);
        }
        
    }
    
}

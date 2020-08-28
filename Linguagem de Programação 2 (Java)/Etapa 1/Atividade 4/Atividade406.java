package atividade4;

import java.util.Random;

public class Atividade406 {
    
    public static void main(String[] args) {
        Random gerador = new Random();
        int vet[] = new int[10];
        int par=0;
        int impar=0;
        
        for(int i=0;i<vet.length;i++){
            vet[i] = gerador.nextInt();
            if(vet[i]%2==0){
                par++;
            }
            else{
                impar++;
            }
        }
        
        System.out.print("Tem "+par+" pares e  "+impar+" impares");
    }
    
}

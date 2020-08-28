package atividade4;

import java.util.Scanner;
public class Atividade402 {
    
    public static void main(String[] args) {
        int vet[] = {1,2,3,4,5,6,7,8,9,5};
        int somatorio=0;
        
        for(int i=0;i<vet.length;i++){
            if(vet[i]>0){
                somatorio+=vet[i];
            }
        }
        
        System.out.println("Resultado: "+somatorio);
    }
    
}

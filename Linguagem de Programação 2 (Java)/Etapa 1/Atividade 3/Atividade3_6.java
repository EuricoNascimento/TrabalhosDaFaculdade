package atividade.pkg3;

import java.util.Scanner;
public class Atividade3_6 {

    public static void main(String[] args) {
        
        int fatorial, i=1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        fatorial= entrada.nextInt();
        
        while(fatorial!=0){
            i*=fatorial;
            fatorial--;
        }
        
        System.out.println("O resultado é "+i);
        
    }
    
}

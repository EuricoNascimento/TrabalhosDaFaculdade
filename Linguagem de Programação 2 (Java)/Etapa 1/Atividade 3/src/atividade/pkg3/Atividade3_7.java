package atividade.pkg3;

import java.util.Scanner;
public class Atividade3_7 {

    public static void main(String[] args) {
        int numero;
        int impar=1;
        int i;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        for(i=0;i<numero;i++){
            System.out.println(impar);
            impar+=2;
        }
        
        
    }
    
}

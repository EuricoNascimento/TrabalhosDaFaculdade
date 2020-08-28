package atividade.pkg3;

import java.util.Scanner;

public class Atividade3_8 {

    public static void main(String[] args) {
        
        int numero, somatorio=0;
        
        Scanner entrada = new Scanner(System.in);
        do{  
            System.out.print("Digite um numero: ");
            numero = entrada.nextInt();
            
            if(numero<0){
                somatorio+=numero;
            };
            
        }while(numero!=0);
        
        
        System.out.println("Total é "+somatorio);
        
    }
    
}

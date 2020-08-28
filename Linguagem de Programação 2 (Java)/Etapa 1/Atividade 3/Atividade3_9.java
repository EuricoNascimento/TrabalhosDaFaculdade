package atividade.pkg3;

import java.util.Scanner;

public class Atividade3_9 {

    public static void main(String[] args) {
        
        int numero;
        int somatorio=0;
        int par=0;
        int menor=1;
        int maior=1;
        int total=0;
        int media=0;
        
        Scanner entrada = new Scanner(System.in);
        do{  
            System.out.print("Digite um numero: ");
            numero = entrada.nextInt();
            
            if(numero%2==0){
                somatorio+=numero;
                par++;
            };
            if(numero>maior){
                maior=numero;
            }
            else{
                menor=numero;
            }
            media+=numero;
            
            total++;
        }while(numero!=0);
        
        media=media/2;
        
        System.out.println("Total de numeros é de "+total);
        System.out.println("Total de nuemros pares é "+par+" e seu somatorio é de "+somatorio);
        System.out.println("A media é de "+media);
        System.out.println("O menor numero é "+menor+" e o maior numero é "+maior);
        
    }
    
}

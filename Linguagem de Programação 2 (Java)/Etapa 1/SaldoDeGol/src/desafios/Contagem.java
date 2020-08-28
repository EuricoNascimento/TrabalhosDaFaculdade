package desafios;

import java.util.Scanner;
public class Contagem {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int matriz[][] = new int[5][2];
        int vet[] = new int [5];
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print ("Digite um valor: ");
                matriz[i][j] = entrada.nextInt();
                
            }
            if(matriz[i][0]>matriz[i][1]){
                do{
                    System.out.print ("Digite um novo valor: ");
                    matriz[i][1] = entrada.nextInt();
                }while(matriz[i][1]<matriz[i][0]);
            }
            vet[i]=matriz[i][0];
            do{
                vet[i]++;
            }while(vet[i]<=matriz[i][1]);
        }
        System.out.println("O resultado da matriz é de: ");
        for(int i=0; i<vet.length;i++){
            System.out.println((i+1)+"-"+vet[i]);
        }
    }
    
}

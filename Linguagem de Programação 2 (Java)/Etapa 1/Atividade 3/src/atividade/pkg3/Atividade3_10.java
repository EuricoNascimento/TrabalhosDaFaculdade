package atividade.pkg3;

import java.util.Scanner;

public class Atividade3_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int voltas, melhorVolta = 0;
        float tempo,melhorTempo;
        int media=0;
        int i;
        
        System.out.print("Voltas: ");
        voltas = entrada.nextInt();
        System.out.print("Tempo: ");
        tempo = entrada.nextInt();
        melhorTempo=tempo;
        for(i=0;i<voltas;i++){
            if(tempo<melhorTempo){
                melhorTempo=tempo;
                melhorVolta=i+1;
            }
            media+=tempo;
            System.out.print("Tempo: ");
            tempo = entrada.nextInt();
        }
        
        media=media/voltas;
        System.out.print("Melhor Volta: "+melhorVolta);
        System.out.print("\nTempo: "+melhorTempo);
        System.out.print("\nTempo Medio: "+media);
        
    }
    
}

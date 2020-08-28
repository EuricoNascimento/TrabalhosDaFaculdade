package desafios;

import java.util.Scanner;
public class SaldoDeGol {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int nJogos;
        System.out.print("Numero de partidas: ");
        nJogos = entrada.nextInt();
        int matriz[][] = new int[nJogos][2];
        int gfavor=0;
        int gcontra=0;
        if(nJogos>0){
            for(int i=0; i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print ("Digite os gols do time "+(j+1)+": ");
                    matriz[i][j] = entrada.nextInt();
                    if(j==0 && matriz[i][j]>=0){
                        gfavor+=matriz[i][j];
                    }
                    else if(j==1 && matriz[i][j]>=0){
                        gcontra+=matriz[i][j];
                    }
                }
            }
            
            if(gcontra>gfavor){
                System.out.println("Time 2 venceu com saldo de "+(gcontra-gfavor));
            }
            else if(gcontra<gfavor){
                System.out.println("Time 1 venceu com saldo de "+(gfavor-gcontra));
            }
            else{
                System.out.println("Empate");
            }
        }
        
    }
    
}

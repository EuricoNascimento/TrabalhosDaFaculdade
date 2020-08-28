package atividade1;

import java.util.Scanner;

public class Atividade1 {
    
    int menor (int x, int y){
        
        if (x<y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        Atividade1 atividade = new Atividade1 ();
        Scanner entrada = new Scanner (System.in);
        int x, y, result;
        
        System.out.print("Digite um numero: ");
        x = entrada.nextInt();
        System.out.print("Digite um numero: ");
        y = entrada.nextInt();
        
        result = atividade.menor(x, y);
        
        System.out.println("O menor é "+result);
    }
    
}

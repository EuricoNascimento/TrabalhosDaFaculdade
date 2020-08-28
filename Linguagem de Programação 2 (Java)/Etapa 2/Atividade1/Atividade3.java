package atividade1;

import java.util.Scanner;
public class Atividade3 {
    
    static void retangulo (float x, float y){
        float area, perimetro;
        area = x * y;
        perimetro = (x*2)+(y*2);
        System.out.println("Area: "+area+"\nPerimetro: "+perimetro);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float h, b;
        
        System.out.print("Altura: ");
        h = entrada.nextFloat();
        System.out.print("Base: ");
        b = entrada.nextFloat();
        
        retangulo(h,b);
    }
    
}

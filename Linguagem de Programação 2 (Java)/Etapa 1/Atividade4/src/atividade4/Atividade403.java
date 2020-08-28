package atividade4;

public class Atividade403 {
    
    public static void main(String[] args) {
        int vet[] = {9,2,7,11,322,10001,2,4,6,12};
        int menorImpar;
        int maiorPar;
        
        maiorPar =0;
        menorImpar = vet[0];
        for(int i=0;i<vet.length;i++){
            if(vet[i]%2==0 && vet[i]>maiorPar){
                maiorPar=vet[i];
            }
            else if(vet[i]%2!=0 &&vet[i]<menorImpar){
                menorImpar=vet[i];
            }
        }
        
        System.out.println("O maior par é "+maiorPar+" E menor impar é "+menorImpar);
        
    }
    
}

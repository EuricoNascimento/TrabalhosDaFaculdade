package atividade4;

public class Atividade409 {
    
    public static void main(String[] args) {
        int vet1[]={1,4,5,10,0};
        int vet2[]={1,6,5,10,0,12,3,7};
        int i;
        int j;
        
        for(i=0;i<vet2.length;i++){
            for(j=0;j<vet1.length;j++){
                if(vet2[i]==vet1[j]){
                    System.out.println(vet1[i]);
                }
            }
        }
        
    }
    
}

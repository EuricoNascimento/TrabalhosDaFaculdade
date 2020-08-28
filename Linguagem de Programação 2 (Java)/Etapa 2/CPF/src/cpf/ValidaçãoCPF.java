package cpf;

public class ValidaçãoCPF {

   /* boolean validação(int cpf) {
        boolean validação;
        int fim1,fim2,result=0;
        int vet1[] = new int[9];
        
        fim1=cpf%100;
        fim2=fim1%10;
        fim1=fim1/10;
        cpf=cpf/100;
        
        for(int i=vet1.length;i>=0;i++){
            vet1[i]=cpf%10;
            cpf=cpf/10;
        }
        for(int i=0;i<9;i++){
            result=(vet1[i]*i+2)+result;
        }
        result=result/11;
        if(result>9){
            result=0;
        }
        if(result!=fim1){
            return false; 
        }
        result=fim1*2;
        for(int i=0;i<9;i++){
            result=(vet1[i]*i+3)+result;
        if(result!=fim2){
        }
        result=result/11;
            return false; 
        }else{
            return true;
        }
    
    }
    */
}

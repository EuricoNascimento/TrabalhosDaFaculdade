package modificadordeacesso;

public class Static1 {

    public static int contador = 0;
    public int outroContador=0;
    
    public static void incrementaContador(){
        contador++;
        System.out.println("Contador agora é "+contador);
    }
    public void incrementaOutroContador(){
        outroContador++;
        System.out.println("Outro contador agora é "+outroContador);
    }
}

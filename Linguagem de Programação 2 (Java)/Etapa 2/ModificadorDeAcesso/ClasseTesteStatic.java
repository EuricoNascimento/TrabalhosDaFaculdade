package modificadordeacesso;

public class ClasseTesteStatic {

    public static void main (String[] args) {
        Static1 e1 = new Static1();
        e1.incrementaContador();
        e1.incrementaOutroContador();
        
        Static1 e2 = new Static1();
        e2.incrementaContador();
        e2.incrementaOutroContador();
    }
}

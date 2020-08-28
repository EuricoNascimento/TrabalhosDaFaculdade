package modificadoresdeacesso;

public class ClasseStaticTest{
	
	public static void main(String[] args) {
		
		ClasseStatic s1 = new ClasseStatic();
		s1.incrementaContador();
		s1.incrementaOutroContador();
		
		ClasseStatic s2 = new ClasseStatic();
		s2.incrementaContador();
		s2.incrementaOutroContador();
		
		ClasseStatic s3 = new ClasseStatic();
		s3.incrementaContador();
		s3.incrementaOutroContador();
		
	}
}
package modificadoresdeacesso;

public class ClasseStatic {	
		
	public static int contador = 0;	
	
	public int outroContador = 0;	
	
	public static void incrementaContador() {			
		contador++;
		System.out.println("contador�agora��"
		                    + contador);		 
	}
	
	public void incrementaOutroContador() {			
		outroContador++;
		System.out.println("OutroContador�agora��" 
		                    + outroContador);		 
	}
}
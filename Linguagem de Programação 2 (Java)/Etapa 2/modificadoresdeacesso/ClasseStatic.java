package modificadoresdeacesso;

public class ClasseStatic {	
		
	public static int contador = 0;	
	
	public int outroContador = 0;	
	
	public static void incrementaContador() {			
		contador++;
		System.out.println("contador agora é "
		                    + contador);		 
	}
	
	public void incrementaOutroContador() {			
		outroContador++;
		System.out.println("OutroContador agora é " 
		                    + outroContador);		 
	}
}
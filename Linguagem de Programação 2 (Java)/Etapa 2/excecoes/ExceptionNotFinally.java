package excecoes;

public class ExceptionNotFinally {
	
	public static void main(String[] args) throws Exception {
		try{ 
			System.out.println("\nMétodo sem throwException");			 
			//Não está gerando a Exceção
		} 
	    catch ( Exception exception ){
			System.err.println("\nExceção");			
			//Não está gerando a Exceção
	    } 
	    finally{
	    	System.err.println( "\nFinally executado sem throwException" );
	    }
		System.err.println( "\nFim do método sem throwException" );
	}
}
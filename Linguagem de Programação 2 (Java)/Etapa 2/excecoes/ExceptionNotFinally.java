package excecoes;

public class ExceptionNotFinally {
	
	public static void main(String[] args) throws Exception {
		try{ 
			System.out.println("\nM�todo sem throwException");			 
			//N�o est� gerando a Exce��o
		} 
	    catch ( Exception exception ){
			System.err.println("\nExce��o");			
			//N�o est� gerando a Exce��o
	    } 
	    finally{
	    	System.err.println( "\nFinally executado sem throwException" );
	    }
		System.err.println( "\nFim do m�todo sem throwException" );
	}
}
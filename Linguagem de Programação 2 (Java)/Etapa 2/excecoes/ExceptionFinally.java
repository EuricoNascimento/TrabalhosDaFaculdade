package excecoes;

public class ExceptionFinally {
	
	public static void main(String[] args) throws Exception {
		try{ 
			System.out.println("\nM�todo throwException");
			//Gera a Exce��o
			throw new Exception(); 
		} 
	    catch ( Exception exception ){
			System.err.println("\nExce��o manipulada no m�todo throwException");
			//Gera a Exce��o
			throw exception;
	    } 
	    finally{
	    	System.err.println( "\nFinally executado em throwException" );
	    }
	}
}
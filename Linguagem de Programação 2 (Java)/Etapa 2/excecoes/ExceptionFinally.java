package excecoes;

public class ExceptionFinally {
	
	public static void main(String[] args) throws Exception {
		try{ 
			System.out.println("\nMétodo throwException");
			//Gera a Exceção
			throw new Exception(); 
		} 
	    catch ( Exception exception ){
			System.err.println("\nExceção manipulada no método throwException");
			//Gera a Exceção
			throw exception;
	    } 
	    finally{
	    	System.err.println( "\nFinally executado em throwException" );
	    }
	}
}
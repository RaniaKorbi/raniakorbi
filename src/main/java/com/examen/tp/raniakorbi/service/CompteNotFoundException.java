package springboot.service;

public class CompteNotFoundException  extends RuntimeException {
	  public CompteNotFoundException(String message) {
	        super(message);
	        
	    }
}

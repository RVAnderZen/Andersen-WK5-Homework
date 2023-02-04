/*4. The log method on the AsteriskLogger should print out the String it receives 
 * 	 between 3 asterisks on either side of the String (e.g. if the String passed in is 
 * 	 “Hello”, then it should print ***Hello*** to the console).
 *
 * 5. The error method on the AsteriskLogger should print the String it receives inside 
 * 	  a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” 
 * 	  is the argument, the following should be printed:
 * 
 * 	  ******************
 * 	  ***Error: Hello***
 *    ******************
 */
public class AsteriskLogger implements Logger {

	public void log(String message) {
		System.out.println("*** " + message + " ***");

	}

	public void error(String message) {
		System.out.println("***************************************");
	    System.out.println("***Error: " + message + "***");
	    System.out.println("***************************************");

	}

}

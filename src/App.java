/*9. Create a class named App that has a main method.
 * 
 *10. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
 *
 *11. Test both methods on both instances, passing in Strings of your choice.
 */
public class App {
	public static void main(String[] args) {
	    Logger asteriskLogger = new AsteriskLogger();
	    Logger spacedLogger = new SpacedLogger();
	    
	    asteriskLogger.log("Promineo Tech makes me happy");
	    asteriskLogger.error("Promineo Tech makes me cry");
	    
	    spacedLogger.log("Promineo Tech makes me happy");
	    spacedLogger.error("Promineo Tech makes me cry");
	  }

}

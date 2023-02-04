/*6. The SpacedLogger should add spaces between each character of the String 
 * argument passed into its methods.
 * 
 * 7. If the log method received “Hello” as an argument, it should print H e l l o
 * 
 * 8. The error method should do the same, but with “ERROR:” preceding the spaced 
 * out input (i.e. ERROR: H e l l o)
 */
public class SpacedLogger implements Logger {

	public void log(String message) {
		String spacedMessage = "";
        for (char c : message.toCharArray()) {
            spacedMessage += " " + c + " ";
        }
		System.out.println(spacedMessage);

	}

	public void error(String message) {
		String spacedMessage = "";
        for (char c : message.toCharArray()) {
            spacedMessage += " " + c + " ";
        }
		System.out.println("  ERROR: " + spacedMessage + "  ");

	}

}

/*1. Create an interface named Logger.
 *2. Add two void methods to the Logger interface, each should take a String as an argument
 *	a. Log
 *	b. Error
 *3. Create two classes that implement the Logger interface
 *	a. AsteriskLogger
 *  b. SpacedLogger
 */
public interface Logger {
	 void log(String message);
	 void error(String message);

}

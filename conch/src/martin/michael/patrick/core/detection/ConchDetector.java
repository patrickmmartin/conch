/**
 * 
 */
package martin.michael.patrick.core.detection;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * ConchDetector is a class intended for capturing events in an image stream
 * that are candidates for being part of the final cleaned stream.
 * @author patrick
 * 
 */
public class ConchDetector {

	/**
	 * LOGGER; static instance for logging 
	 */
	private static final Logger LOGGER = Logger.getLogger("martin.michael.patrick");

	public ConchDetector() {
		LOGGER.log(Level.INFO, "{0} construction", this.getClass().toString());
		
	}

}

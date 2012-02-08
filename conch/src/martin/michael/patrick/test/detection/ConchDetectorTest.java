/**
 * 
 */
package martin.michael.patrick.test.detection;

import martin.michael.patrick.core.detection.ConchDetector;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author patrick
 *
 */
public class ConchDetectorTest {

	/**
	 * setup Method for the detector test
	 */
	@BeforeMethod
	public static void setUp() {
		// TODO implement or remove and why does PMD not like this?
	}

	@Test( groups = {"stubs"} )
	public void test() {
		//  nothing here
	}

	@Test( groups = {"stubs"} )
	public void testConstruction() {
		new ConchDetector();
	}

}

/**
 * 
 */
package martin.michael.patrick.conch.core.detection;


import org.testng.annotations.DataProvider;

/**
 * data provider class for the trivial test data
 * @author Patrick
 * 
 */
public class TrivialTestDataProvider {

	/**
	 * @return the trivial test set
	 */
	@DataProvider(name = "trivialMetricsStream")
	public static Object[][] trivialMetricsStream() {
		return new Object[][] {
				new Object[] { new ImageMetrics(), new ImageMetrics(), new ImageMetrics() } };
	}

}

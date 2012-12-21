/**
 * 
 */
package martin.michael.patrick.conch.core.detection;

import martin.michael.patrick.conch.core.detection.types.ImageMetrics;

import org.testng.annotations.DataProvider;

/**
 * data provider class for the trivial test data
 * @author Patrick
 * 
 */
public class TrivialTestDataProvider {

	@DataProvider(name = "trivialMetricsStream")
	public static Object[][] trivialMetricsStream() {
		return new Object[][] {
				new Object[] { new ImageMetrics(), new ImageMetrics(), new ImageMetrics() } };
	}

}

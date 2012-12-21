package martin.michael.patrick.conch.core.detection;


import org.testng.annotations.DataProvider;

/**
 * data provider class for the scenes test data
 * @author Patrick
 * 
 */
public class SceneTestDataProvider {

	/**
	 * @return the test data for a single scene
	 */
	@DataProvider(name = "singleSceneMetricsStream")
	public static Object[][] singleSceneMetricsStream() {
		return new Object[][] { new Object[] {
				new ImageMetrics(1, 0, 0), new ImageMetrics(1, 0, 0), new ImageMetrics(1, 0, 0)
				} };
	}

	/**
	 * @return the test data for two scenes
	 */
	@DataProvider(name = "twoSceneMetricsStream")
	public static Object[][] twoSceneMetricsStream() {
		return new Object[][] { new Object[] { new ImageMetrics(1, 0, 0),
				new ImageMetrics(1, 0, 0), new ImageMetrics(1, 0, 0), new ImageMetrics(1, 0, 0),
				new ImageMetrics(0, 1, 0), new ImageMetrics(0, 1, 0), new ImageMetrics(0, 1, 0) } };
	}

}

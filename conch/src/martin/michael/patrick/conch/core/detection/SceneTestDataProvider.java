package martin.michael.patrick.conch.core.detection;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

/**
 * data provider class for the scenes test data
 * 
 * @author Patrick
 * 
 */
public final class SceneTestDataProvider {

	private SceneTestDataProvider()
	{
		// for PMD warning
	}
	
	/**
	 * @return the trivial test set
	 */
	@DataProvider(name = "trivialScene")
	public static Object[][] trivialSourceStream() {

		final List<ImageMetrics> imageMetricsList = new ArrayList<ImageMetrics>();
		imageMetricsList.add(new ImageMetrics());
		imageMetricsList.add(new ImageMetrics());
		imageMetricsList.add(new ImageMetrics());

		return new Object[][] { new Object[] { imageMetricsList } };
	}

	/**
	 * @return the test data for a single scene
	 */
	@DataProvider(name = "singleScene")
	public static Object[][] singleSceneMetricsStream() {

		final List<ImageMetrics> imageMetricsList = new ArrayList<ImageMetrics>();
		imageMetricsList.add(new ImageMetrics(1, 0, 0));
		imageMetricsList.add(new ImageMetrics(1, 0, 0));
		imageMetricsList.add(new ImageMetrics(1, 0, 0));

		return new Object[][] { new Object[] { imageMetricsList } };

	}

	/**
	 * @return the test data for two scenes
	 */
	@DataProvider(name = "twoScenes")
	public static Object[][] twoSceneMetricsStream() {
		final List<ImageMetrics> imageMetricsList = new ArrayList<ImageMetrics>();
		imageMetricsList.add(new ImageMetrics(1, 0, 0));
		imageMetricsList.add(new ImageMetrics(1, 0, 0));
		imageMetricsList.add(new ImageMetrics(1, 0, 0));

		imageMetricsList.add(new ImageMetrics(0, 1, 0));
		imageMetricsList.add(new ImageMetrics(0, 1, 0));
		imageMetricsList.add(new ImageMetrics(0, 1, 0));

		return new Object[][] { new Object[] { imageMetricsList } };
	}

}

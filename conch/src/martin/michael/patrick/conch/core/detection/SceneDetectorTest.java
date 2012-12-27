package martin.michael.patrick.conch.core.detection;

import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;


/**
 * @author Patrick
 *
 */
public class SceneDetectorTest {

/**
 * @param imageMetricsList injected list of ImageMetrics instances
 * 
 */
@Test(dataProvider="trivialScene", dataProviderClass=SceneTestDataProvider.class)
public void testTrivialSceneDetection(final List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
	fail("test not implemented");
}

/**
 * @param imageMetricsList injected list of ImageMetrics instances
 * 
 */
@Test(dataProvider="singleScene", dataProviderClass=SceneTestDataProvider.class)
public void testSingleSceneDetection(final List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
	fail("test not implemented");
}

/**
 * @param imageMetricsList injected list of ImageMetrics instances
 * 
 */
@Test(dataProvider="twoScenes", dataProviderClass=SceneTestDataProvider.class)
public void testTwoSceneDetection(final List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
	fail("test not implemented");
}

}

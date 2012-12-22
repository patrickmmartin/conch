package martin.michael.patrick.conch.core.detection;

import java.util.List;

import org.testng.annotations.Test;

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
public void testTrivialSceneDetection(List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
    throw new RuntimeException("Test not implemented");
}

/**
 * @param imageMetricsList injected list of ImageMetrics instances
 * 
 */
@Test(dataProvider="singleScene", dataProviderClass=SceneTestDataProvider.class)
public void testSingleSceneDetection(List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
    throw new RuntimeException("Test not implemented");
}

/**
 * @param imageMetricsList injected list of ImageMetrics instances
 * 
 */
@Test(dataProvider="twoScenes", dataProviderClass=SceneTestDataProvider.class)
public void testTwoSceneDetection(List<ImageMetrics> imageMetricsList)
{
	// TODO this would ideally yield a SceneDescriptor with the correct results
    throw new RuntimeException("Test not implemented");
}

}

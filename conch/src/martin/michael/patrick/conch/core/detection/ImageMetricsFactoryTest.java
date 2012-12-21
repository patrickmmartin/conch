package martin.michael.patrick.conch.core.detection;

import martin.michael.patrick.conch.core.detection.types.ImageMetrics;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * class for the test suite on the {@link ImageMetricsFactory}
 * @author Patrick
 *
 */
public class ImageMetricsFactoryTest {

  @Test
  public void buildMetrics() {
    ImageMetrics imageMetrics = ImageMetricsFactory.buildMetrics(null);
    assertNotNull(imageMetrics, "results should be returned");
    
    
  }
}

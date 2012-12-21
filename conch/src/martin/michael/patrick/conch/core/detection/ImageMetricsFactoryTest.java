package martin.michael.patrick.conch.core.detection;

import static org.testng.Assert.assertNotNull;

import java.awt.image.BufferedImage;

import martin.michael.patrick.conch.core.detection.types.ImageMetrics;

import org.testng.annotations.Test;

/**
 * class for the test suite on the {@link ImageMetricsFactory}
 * @author Patrick
 *
 */
public class ImageMetricsFactoryTest {

  /**
 * 
 */
@Test(expectedExceptions = IllegalArgumentException.class)
  public void buildMetricsNull() {
    ImageMetricsFactory.buildMetrics(null);
  }
  
  /**
 * 
 */
@Test
  public void buildMetrics() {
  
	BufferedImage ri = new BufferedImage(100, 50,
              BufferedImage.TYPE_INT_ARGB);	  
	ImageMetrics imageMetrics = ImageMetricsFactory.buildMetrics(ri);
    assertNotNull(imageMetrics, "results should be returned");        
  }
  
}

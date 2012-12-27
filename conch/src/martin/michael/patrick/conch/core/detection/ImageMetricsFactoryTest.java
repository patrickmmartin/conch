package martin.michael.patrick.conch.core.detection;

import static org.testng.Assert.assertNotNull;

import java.awt.image.BufferedImage;


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
  
	final BufferedImage image = new BufferedImage(100, 50,
              BufferedImage.TYPE_INT_ARGB);	  
	final ImageMetrics imageMetrics = ImageMetricsFactory.buildMetrics(image);
    assertNotNull(imageMetrics, "results should be returned");        
  }
  
}

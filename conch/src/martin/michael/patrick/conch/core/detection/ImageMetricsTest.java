package martin.michael.patrick.conch.core.detection;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Patrick
 *
 */
public class ImageMetricsTest {

  /**
 * 
 */
@Test
  public void constructorRGB() {
	  final ImageMetrics imageMetrics = new ImageMetrics(2.0, 3.0, 5.0);
	  assertEquals(imageMetrics.red, 2.0, "red value incorrect");
	  assertEquals(imageMetrics.green, 3.0, "green value incorrect");
	  assertEquals(imageMetrics.blue, 5.0, "blue value incorrect");
  }

  /**
 * 
 */
@Test
  public void constructor() {
	  final ImageMetrics imageMetrics = new ImageMetrics();
	  Assert.assertEquals(imageMetrics.red, 0.0);
	  Assert.assertEquals(imageMetrics.green, 0.0);
	  Assert.assertEquals(imageMetrics.blue, 0.0);
  }

}

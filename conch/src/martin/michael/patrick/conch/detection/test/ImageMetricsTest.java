package martin.michael.patrick.conch.detection.test;

import martin.michael.patrick.conch.core.detection.types.ImageMetrics;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ImageMetricsTest {

  @Test
  public void constructorRGB() {
	  final ImageMetrics imageMetrics = new ImageMetrics(2.0, 3.0, 5.0);
	  assertEquals(imageMetrics.getR(), 2.0);
	  assertEquals(imageMetrics.getG(), 3.0);
	  assertEquals(imageMetrics.getB(), 5.0);
  }

  @Test
  public void constructor() {
	  final ImageMetrics imageMetrics = new ImageMetrics();
	  Assert.assertEquals(imageMetrics.getR(), 0.0);
	  Assert.assertEquals(imageMetrics.getG(), 0.0);
	  Assert.assertEquals(imageMetrics.getB(), 0.0);
  }

}

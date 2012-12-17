package martin.michael.patrick.test.detection;

import martin.michael.patrick.core.detection.SimpleImageCategoriser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class SimpleImageCategoriserTest {
  @BeforeSuite
  public void beforeSuite() {
	  // TODO write out some test image files
	  // all R, all G, all B
  }


  @Test
  public void categorise() {
    
	  SimpleImageCategoriser sic = new SimpleImageCategoriser();
	  // TODO need to use the images created in beforeSuite()
	  // to pass into this
	  sic.categorise(null);
  }
}

/**
 * 
 */
package martin.michael.patrick.core.detection;

import java.awt.image.RenderedImage;

/**
 * SimpleImageCategoriser performs simple image categorisations
 * such as average intensity per colour band
 * @author Patrick
 *
 */
public class SimpleImageCategoriser {

	public ImageMetrics categorise(RenderedImage ri)
	{
		if (ri == null)
			throw new IllegalArgumentException ("The image instance parameter cannot be null.");
		return new ImageMetrics(ri);
	}
	
	
	 
}

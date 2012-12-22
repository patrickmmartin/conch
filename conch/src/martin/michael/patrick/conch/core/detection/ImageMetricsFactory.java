package martin.michael.patrick.conch.core.detection;

import java.awt.image.RenderedImage;


/**
 * @author Patrick
 *
 */
public class ImageMetricsFactory {

	/**
	 * @param ri the RenderedImage to be analysed
	 * @return the ImageMetrics for the RenderedImage
	 */
	public static ImageMetrics buildMetrics(RenderedImage ri)
	{
		if (ri == null)
			throw new IllegalArgumentException ("The image instance parameter cannot be null.");
		return new ImageMetrics(0, 0, 0);
	}
	
}

package martin.michael.patrick.conch.core.detection;

import java.awt.image.RenderedImage;


/**
 * @author Patrick
 *
 */
public final class ImageMetricsFactory {

	private ImageMetricsFactory()
	{
		// for PMD warning
	}
	/**
	 * @param image the RenderedImage to be analysed
	 * @return the ImageMetrics for the RenderedImage
	 */
	public static ImageMetrics buildMetrics(final RenderedImage image)
	{
		if (image == null)
		{
			throw new IllegalArgumentException ("The image instance parameter cannot be null.");
		}
		return new ImageMetrics(0, 0, 0);
	}
	
}

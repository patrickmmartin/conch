package martin.michael.patrick.conch.core.detection;

import java.awt.image.RenderedImage;

import martin.michael.patrick.conch.core.detection.types.ImageMetrics;

public class ImageMetricsFactory {

	public static ImageMetrics buildMetrics(RenderedImage ri)
	{
		if (ri == null)
			throw new IllegalArgumentException ("The image instance parameter cannot be null.");
		return new ImageMetrics(0, 0, 0);
	}
	
}

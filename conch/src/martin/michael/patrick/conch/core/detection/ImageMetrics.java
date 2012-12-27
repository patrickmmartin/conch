package martin.michael.patrick.conch.core.detection;

/**
 * ImageMetrics wraps up deduced information on an image
 * 
 * @author Patrick
 * 
 */
public class ImageMetrics {

	/**
	 * 
	 */
	public final double red;
	/**
	 * 
	 */
	public final double green;
	/**
	 * 
	 */
	public final double blue;

	/**
	 * constructor taking the R, G, B properties
	 * 
	 * @author Patrick
	 * @param red
	 *            the red geometric mean
	 * @param green
	 *            the green geometric mean
	 * @param blue
	 *            the blue geometric mean
	 */
	public ImageMetrics(final double red, final double green, final double blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/**
	 * 
	 */
	public ImageMetrics() {
		red = 0.0;
		green = 0.0;
		blue = 0.0;

	}

}

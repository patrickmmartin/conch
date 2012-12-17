/**
 * 
 */
package martin.michael.patrick.core.detection;

import java.awt.image.RenderedImage;

/**
 * ImageMetrics wraps up deduced information on an image
 * @author Patrick
 *
 */
public class ImageMetrics {
	
	private double _R;
	private double _G;
	private double _B;
	private RenderedImage _ri;

	public double getR() { return _R; }
	public double getG() { return _G; }
	public double getB() { return _B; }
	
	public ImageMetrics(RenderedImage ri) {
		if (ri == null)
			throw new IllegalArgumentException ("The image instance parameter cannot be null.");
		_ri = ri;
		_ri.getProperty("dummy");
		_R = 0.0;
		_G = 0.0;
		_B = 0.0;
	}
	

}

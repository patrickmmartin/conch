package martin.michael.patrick.conch.core.detection.types;


/**
 * ImageMetrics wraps up deduced information on an image
 * @author Patrick
 *
 */
public class ImageMetrics {
	
	private double _R = 0.0;
	private double _G = 0.0;
	private double _B = 0.0;

	public double getR() { return _R; }
	public double getG() { return _G; }
	public double getB() { return _B; }
	
	/**
	 * constructor taking the R, G, B properties
	 * @author Patrick
	 * @param R
	 * @param G
	 * @param B
	 */
	public ImageMetrics(double R, double G, double B) {
		_R = R;
		_G = G;
		_B = B;
	}
	
	/**
	 * default constructor 
	 */
	public ImageMetrics() {
	}
	
	

}

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

	/**
	 * @return the R value
	 */
	public double getR() { return _R; }
	/**
	 * @return the G value
	 */
	public double getG() { return _G; }
	/**
	 * @return the B value
	 */
	public double getB() { return _B; }
	
	/**
	 * constructor taking the R, G, B properties
	 * @author Patrick
	 * @param R the R geometric mean
	 * @param G the G geometric mean
	 * @param B the B geometric mean
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

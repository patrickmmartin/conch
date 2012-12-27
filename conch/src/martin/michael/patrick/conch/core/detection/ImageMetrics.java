package martin.michael.patrick.conch.core.detection;


/**
 * ImageMetrics wraps up deduced information on an image
 * @author Patrick
 *
 */
public class ImageMetrics {
	
	private double R = 0.0;
	private double G = 0.0;
	private double B = 0.0;

	/**
	 * @return the R value
	 */
	public double getR() { return R; }
	/**
	 * @return the G value
	 */
	public double getG() { return G; }
	/**
	 * @return the B value
	 */
	public double getB() { return B; }
	
	/**
	 * constructor taking the R, G, B properties
	 * @author Patrick
	 * @param R the R geometric mean
	 * @param G the G geometric mean
	 * @param B the B geometric mean
	 */
	public ImageMetrics(double R, double G, double B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}
	
	/**
	 * default constructor 
	 */
	public ImageMetrics() {
	}
	
	

}

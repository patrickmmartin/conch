/**
 * 
 */
package martin.michael.patrick.conch.core.detection;

/**
 * @author Patrick
 *
 */
public class ImageSourceDescriptor {

	/**
	 * class to wrap up describing the basic characteristics
	 * of an individual frame under consideration 
	 * @author Patrick
	 *
	 */
	public enum SourceType {
		/**
		 * 
		 */
		Undefined,
		/**
		 * 
		 */
		File,
		/**
		 * 
		 */
		Stream,
		/**
		 * 
		 */
		Unknown
			

	}
	
	/**
	 * 
	 */
	public final long position;
	
	/**
	 * 
	 */
	public final SourceType sourceType;
	
	/**
	 * 
	 */
	public final String sourceFile;

	/**
	 * @param position time position of the frame
	 * @param sourceType type of the frame source
	 * @param sourceFile the source file for the underlying data
	 */
	public ImageSourceDescriptor(final long position, final SourceType sourceType, final String sourceFile) {
		this.position = position;
		this.sourceType = sourceType;
		this.sourceFile = sourceFile;
		
	}

}

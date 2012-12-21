/**
 * 
 */
package martin.michael.patrick.conch.core.detection.types;

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
	
	final long position;
	
	final SourceType sourceType;
	
	final String sourceFile;

	/**
	 * @param position_ time position of the frame
	 * @param sourceType_ type of the frame source
	 * @param sourceFile_ the source file for the underlying data
	 */
	public ImageSourceDescriptor(long position_, SourceType sourceType_, String sourceFile_) {
		this.position = position_;
		this.sourceType = sourceType_;
		sourceFile = sourceFile_;
		
	}

}

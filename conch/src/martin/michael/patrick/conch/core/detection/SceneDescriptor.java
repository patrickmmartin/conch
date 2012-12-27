/**
 * 
 */
package martin.michael.patrick.conch.core.detection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * class to wrap up grouping frames into a scene
 * 
 * @author Patrick
 * 
 */

// TODO perhaps consider what additional useful queries might be served?
public class SceneDescriptor implements Iterable<ImageSourceDescriptor> {

	private final List<ImageSourceDescriptor> imageSources = new ArrayList<ImageSourceDescriptor>();

	/**
	 * implement Iterable for the for each syntax
	 * 
	 * @return the iterator from the backing store
	 */
	public Iterator<ImageSourceDescriptor> iterator() {
		return imageSources.iterator();
	}

	/**
	 * return the image count of the backing store
	 * 
	 * @return no of images in the scene
	 */
	public long imageCount() {
		return imageSources.size();
	}

	/**
	 * @param image image source descriptor
	 */
	public void add(final ImageSourceDescriptor image) {
		if (null == image) {
			throw new IllegalArgumentException("image source may not be null");
		}
		if (imageSources.contains(image)) {
			throw new IllegalArgumentException(
					"image source is already present");
		}
		imageSources.add(image);
	}

	/**
	 * @param images image source descriptors
	 */
	public void add(final List<ImageSourceDescriptor> images) {
		if (null == images) {
			throw new IllegalArgumentException(
					"image source list may not be null");
		}
		if (Collections.disjoint(images, imageSources)) {
			imageSources.addAll(images);
		} else {
			throw new IllegalArgumentException(
					"image source list must be disjoint");
		}
	}

	/**
	 * immutable name for the scene set upon construction
	 */
	public final String name;

	/**
	 * constructor - the class will contain no frames
	 * 
	 * @param name_
	 *            name of the scene
	 */
	// TODO - make the backing store for frames immutable too?
	public SceneDescriptor(final String name_) {
		name = name_;
		if (scenes.containsKey(name)) {
			throw new IllegalArgumentException(String.format(
					"a scene with the name [%s] exists", name));

		}
		scenes.put(name, this);
	}

	/**
	 * clears down the scenes store
	 */
	public static void clearScenes() {
		scenes.clear();
	}

	/**
	 * 
	 */
	public static Map<String, SceneDescriptor> scenes;

	static {
		scenes = new TreeMap<String, SceneDescriptor>();
	}

	/**
	 * deleter for a scene - after this the scene's name can be used again
	 */
	public void delete() {
		scenes.remove(name);
	}
}

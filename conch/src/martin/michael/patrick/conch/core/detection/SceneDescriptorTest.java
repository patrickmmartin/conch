package martin.michael.patrick.conch.core.detection;

import java.util.ArrayList;
import java.util.List;

import martin.michael.patrick.conch.core.detection.ImageSourceDescriptor.SourceType;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * testNG test for the {@link SceneDescriptor} class
 * @author Patrick
 *
 */
public class SceneDescriptorTest {

	
	@BeforeMethod
	private void clearScenes()
	{
		SceneDescriptor.clearScenes();
	}
	
	/**
	 * 
	 */
	@Test
	public void constructor() {
		new SceneDescriptor("dummy");
	}

	/**
	 * 
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void constructDupes() {
		new SceneDescriptor("dummy");
		new SceneDescriptor("dummy");
	}

	/**
	 * 
	 */
	@Test
	public void imageCount() {
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		assert (0 == sceneDescriptor.imageCount());

	}

	/**
	 * 
	 */
	@Test
	public void iterator() {
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		for (@SuppressWarnings("unused") ImageSourceDescriptor f : sceneDescriptor)
		{
			fail("new instance should be empty");
		}
	}
	
	/**
	 * 
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testAddNull()
	{
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		ImageSourceDescriptor dummy = null;
		sceneDescriptor.add(dummy);
	}

	/**
	 * 
	 */
	@Test
	public void testAddValid()
	{
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		sceneDescriptor.add(new ImageSourceDescriptor(0, SourceType.File, ""));
		sceneDescriptor.add(new ImageSourceDescriptor(2, SourceType.File, ""));
		sceneDescriptor.add(new ImageSourceDescriptor(3, SourceType.File, ""));
	}
	
	/**
	 * 
	 */
	@Test
	public void testAddList()
	{
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		List<ImageSourceDescriptor> images = new ArrayList<ImageSourceDescriptor>();
		images.add(new ImageSourceDescriptor(0, SourceType.File, ""));
		images.add(new ImageSourceDescriptor(2, SourceType.File, ""));
		images.add(new ImageSourceDescriptor(3, SourceType.File, ""));
		sceneDescriptor.add(images);
		assertEquals(images.size(), sceneDescriptor.imageCount(), "image count should be size of list");
	}
	
	/**
	 * 
	 */
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void testAddListTwice()
	{
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		List<ImageSourceDescriptor> images = new ArrayList<ImageSourceDescriptor>();
		images.add(new ImageSourceDescriptor(0, SourceType.File, ""));
		images.add(new ImageSourceDescriptor(2, SourceType.File, ""));
		images.add(new ImageSourceDescriptor(3, SourceType.File, ""));
		sceneDescriptor.add(images);
		assertEquals(images.size(), sceneDescriptor.imageCount(), "image count should be size of list");
		try
		{
		sceneDescriptor.add(images);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(images.size(), sceneDescriptor.imageCount(), "image count should be size of list");
			throw e;
		}
	}
		
}

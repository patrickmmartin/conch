package martin.michael.patrick.conch.core.detection;

import java.util.ArrayList;
import java.util.List;

import martin.michael.patrick.conch.core.detection.ImageSourceDescriptor.SourceType;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * testNG test for the {@link SceneDescriptor} class
 * @author Patrick
 *
 */
public class SceneDescriptorTest {

	
	private static final String DUMMY_SCENENAME = "dummy";

	/**
	 * clears prior created scenes 
	 */
	@BeforeMethod
	public void clearScenes()
	{
		SceneDescriptor.clearScenes();
	}
	
	/**
	 * 
	 */
	@Test
	public void constructor() {
		new SceneDescriptor(DUMMY_SCENENAME);
		fail("test not implemented");
	}

	/**
	 * 
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void constructDupes() {
		new SceneDescriptor(DUMMY_SCENENAME);
		new SceneDescriptor(DUMMY_SCENENAME);
	}

	/**
	 * 
	 */
	@Test
	public void imageCount() {
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		assertEquals(sceneDescriptor.imageCount(), 0, "image count of new instance should be zero");

	}

	/**
	 * 
	 */
	@Test
	public void iterator() {
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		for (@SuppressWarnings("unused") ImageSourceDescriptor f : sceneDescriptor)
		{
			fail("new instance should be empty");
		}
	}
	
	static private ImageSourceDescriptor dummy = null;
	
	/**
	 * 
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testAddNull()
	{
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		sceneDescriptor.add(dummy);
		fail("should not get here");
	}

	/**
	 * 
	 */
	@Test
	public void testAddValid()
	{
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		sceneDescriptor.add(new ImageSourceDescriptor(0, SourceType.File, ""));
		sceneDescriptor.add(new ImageSourceDescriptor(2, SourceType.File, ""));
		sceneDescriptor.add(new ImageSourceDescriptor(3, SourceType.File, ""));
		assertEquals(sceneDescriptor.imageCount(), 3, "image count should match number of additions");
	}
	
	/**
	 * 
	 */
	@Test
	public void testAddList()
	{
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		final List<ImageSourceDescriptor> images = new ArrayList<ImageSourceDescriptor>();
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
		final SceneDescriptor sceneDescriptor = new SceneDescriptor(DUMMY_SCENENAME);
		final List<ImageSourceDescriptor> images = new ArrayList<ImageSourceDescriptor>();
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

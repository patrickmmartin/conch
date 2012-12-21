package martin.michael.patrick.conch.core.detection.types;

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
	
	@Test
	public void constructor() {
		new SceneDescriptor("dummy");
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void constructDupes() {
		new SceneDescriptor("dummy");
		new SceneDescriptor("dummy");
	}

	@Test
	public void imageCount() {
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		assert (0 == sceneDescriptor.imageCount());

	}

	@Test
	public void iterator() {
		SceneDescriptor sceneDescriptor = new SceneDescriptor("dummy");
		for (@SuppressWarnings("unused") ImageSourceDescriptor f : sceneDescriptor)
		{
			fail("new instance should be empty");
		}
	}
}

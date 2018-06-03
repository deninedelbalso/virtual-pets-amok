package shelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboCatTest {
	// boredom, health, happiness
	RoboCat anyRoboCat = new RoboCat("name", 10, 10, 10, 10, "description");

	@Test
	public void shouldReturnAllCatProperties() {
		String name = anyRoboCat.getName();
		int boredom = anyRoboCat.getBoredom();
		int health = anyRoboCat.getHealth();
		int happiness = anyRoboCat.getHappiness();
		int oilLevel = anyRoboCat.getOilLevel();
		String description = anyRoboCat.getDescription();
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
	}

	@Test
	public void shouldHavePlayDecreaseBoredomBy5() {
		anyRoboCat.play();
		int boredom = anyRoboCat.getBoredom();
		assertEquals(5, boredom);
	}

	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyRoboCat.reduceHealth();
		int health = anyRoboCat.getHealth();
		assertEquals(5, health);

	}

	@Test
	public void shouldHaveOilLevelDecreaseBy5() {
		anyRoboCat.reduceOilLevel();
		int oilLevel = anyRoboCat.getOilLevel();
		assertEquals(5, oilLevel);

	}

	@Test
	public void shouldDecreaseOilLevelBy5ThroughPlay() {
		anyRoboCat.play();
		int oilLevel = anyRoboCat.getOilLevel();
		assertEquals(5, oilLevel);

	}

	@Test
	public void shouldIncreaseOilLevelBy5ThroughOiling() {
		anyRoboCat.increaseOilLevel();
		int oilLevel = anyRoboCat.getOilLevel();
		assertEquals(15, oilLevel);

	}

}

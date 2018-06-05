package shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter myVirtualPetShelter;
	RoboDog plops;
	RoboCat misterBigToes;
	Dog raffles;
	Cat pickles;
	
	@Before
	public void setUp() {
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		plops = new RoboDog("Plops", 10, 10, 10, 10, "smells like a virtual junkyard");
		misterBigToes = new RoboCat("Mister Big Toes", 10, 10, 10, 10, "has a luscious silver sheen");
		raffles = new Dog("Raffles", 10, 10, 10, 10, 10, 10, "is a Virgo");
		pickles = new Cat("Pickles", 10, 10, 10, 10, 10, 10, "enjoys playing on his phone");

	}
	
	
	@Test
	public void virtualPetShelterShouldBeAbleToAdoptOutAPet() {
		myVirtualPetShelter.adopt(plops);
		Pet foundRoboDog = myVirtualPetShelter.findPet(plops.getName());
		assertThat(foundRoboDog, is(nullValue()));
	
	}

	@Test
	public void virtualPetShelterShouldBeAbleToAdoptOutTwoPets() {
		myVirtualPetShelter.adopt(plops);
		myVirtualPetShelter.adopt(misterBigToes);
		Pet foundRoboDog = myVirtualPetShelter.findPet(plops.getName());
		Pet foundRoboCat = myVirtualPetShelter.findPet(misterBigToes.getName());
		assertThat(foundRoboDog, is(nullValue()));
		assertThat(foundRoboCat, is(nullValue()));

	}
	
	
	
	
	
	
	
}

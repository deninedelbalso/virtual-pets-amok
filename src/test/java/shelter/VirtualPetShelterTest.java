package shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	private VirtualPetShelter myVirtualPetShelter;
	private RoboDog plops;
	private RoboCat misterBigToes;
	private Dog raffles;
	private Cat pickles;
	
	@Before
	public void setUp() {
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		plops = new RoboDog("Plops", 10, 10, 10, 10, "smells like a virtual junkyard");
		misterBigToes = new RoboCat("Mister Big Toes", 10, 10, 10, 10, "has a luscious silver sheen");
		raffles = new Dog("Raffles", 10, 10, 10, 10, 10, 10, "is a Virgo");
		pickles = new Cat("Pickles", 10, 10, 10, 10, 10, 10, "enjoys playing on his phone");

	}
	
	
	@Test
	public void virtualPetShelterShouldBeAddOutAPet() {
		myVirtualPetShelter.adopt(plops);
		Pet foundRoboDog = myVirtualPetShelter.findPet(plops.getName());
		assertThat(foundRoboDog, is(nullValue()));
	
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
	
	

	@Test
	public void virtualPetShelterShouldBeAbleToAddMultiplePets() {
		myVirtualPetShelter.adopt(plops);
		myVirtualPetShelter.adopt(misterBigToes);
		myVirtualPetShelter.adopt(raffles);
		myVirtualPetShelter.adopt(pickles);
		Pet foundRoboDog = myVirtualPetShelter.findPet(plops.getName());
		Pet foundRoboCat = myVirtualPetShelter.findPet(misterBigToes.getName());
		Pet foundDog = myVirtualPetShelter.findPet(raffles.getName());
		Pet foundCat = myVirtualPetShelter.findPet(pickles.getName());
		assertThat(foundRoboDog, is(plops));
		assertThat(foundRoboDog, is(misterBigToes));
		assertThat(foundRoboDog, is(raffles));
		assertThat(foundRoboDog, is(pickles));

	}
	
}

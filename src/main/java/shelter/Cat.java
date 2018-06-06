package shelter;

public class Cat extends OrganicPet {


	public Cat(String name, int hunger, int thirst, int boredom, int waste, int health, int happiness,
			String description) { // TODO Auto-generated constructor stub
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.health = health;
		this.happiness = happiness;
		this.description = description;

	}

	public void cleanLitterBox() {
			waste -=5;
	}

}

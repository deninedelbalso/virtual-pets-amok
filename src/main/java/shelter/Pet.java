package shelter;

public abstract class Pet {

	protected String name;
	protected int boredom;
	protected int health;
	protected int happiness;
	protected String description;


	public String getName() {
		return name;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public String getDescription() {
		return description;
	}
	public void play() {
		boredom -= 1;

	}
	
	public void reduceHealth() {
		health -= 5;
	}

	public void tick() {
		health -= 1;
		happiness -= 10;
		boredom-= 10;
	}

}
package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();
	Object OrganicPet;
	Object RoboticPet;

	public Collection<Pet> getAllPets() {
		return pets.values();

	}

	public void waterAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
	}

	public void playWithAllPets() {
		for (Pet pet : pets.values()) {
			pet.play();
		}
	}

	public void walkAllDog() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}
	}

	public void adopt(Pet pet) {
		pets.remove(pet.getName(), pet);

	}

	public void feedAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}

	public void cleanAllDogCages() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).clean();
			}
		}
	}

	public void add(Pet pet) {
		pets.put(pet.getName(), pet);

	}

	public void oilAllRoboticPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).increaseOilLevel();
			}
		}
	}

	public void cleanLitterBox() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat) pet).cleanLitterBox();
			}

		}
	}

	public Pet findPet(String name) {
		return pets.get(name);
	}

	public void showAllPets() {
		for (Pet pet : pets.values()) {
			System.out.println("Pet name: " + pet.getName() + " " + pet.getDescription() + " ");
		}
	}

	public void showStats() {
		for (Pet pet : pets.values()) {
			System.out.println(pet.getName() + " " + pet.getDescription() + " " + "Boredom: " + pet.getBoredom() + " "
					+ "Happiness: " + pet.getHappiness() + " " + "Health: " + pet.getHealth());

		}
	}

	public void tickAll() {
		for (Pet pet : pets.values()) {
			pet.tick();
		}
	}


	public void tick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((OrganicPet) pet).tick();
			} else {
				((RoboticPet) pet).tick();

			}
		}
	}

}
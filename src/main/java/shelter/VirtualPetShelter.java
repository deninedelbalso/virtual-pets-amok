package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import virtualpetshelter.VirtualPet;



public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	public void add(Pet anyPet) {
		pets.put(anyPet.getName(),anyPet);
	}
	
	public Pet findPet(String name) {
		return pets.get(name);
	}
	
	public Collection<Pet> getAllPets() {
		return pets.values();
	
	}
	
	public void adopt(Pet anyPet) {
		pets.remove(anyPet.getName(), anyPet);
	}
	
	public void showAllPets() {
		for (Pet pet : pets.values()) {
			System.out.println("Pet name: " + pet.getName() + " " + pet.getDescription() + " ");
		}
	
	}
	public void play(Pet anyPet) {
		anyPet.play();
	
	}
	

}



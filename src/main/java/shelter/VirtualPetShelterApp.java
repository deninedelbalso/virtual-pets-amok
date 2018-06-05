package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		RoboDog plops = new RoboDog("Plops", 10, 10, 10, 10, "smells like a virtual junkyard");
		RoboCat misterBigToes = new RoboCat("Mister Big Toes", 10, 10, 10, 10, "has a luscious silver sheen");
		Dog raffles = new Dog("Raffles", 10, 10, 10, 10, 10, 10, "is a Virgo");
		Cat pickles = new Cat("Pickles", 10, 10, 10, 10, 10, 10, "enjoys playing on his phone");

		myVirtualPetShelter.add(plops);
		myVirtualPetShelter.add(misterBigToes);
		myVirtualPetShelter.add(raffles);
		myVirtualPetShelter.add(pickles);

		System.out.println("Welcome to the Virtual Pet Shelter. We carry both robotic and organic pets!");
		System.out.println("Here are our current pets:");
		myVirtualPetShelter.showAllPets();

		String choice = "";
		do {
			System.out.println("Press 1 to play an pet");
			System.out.println("Press 2 to walk a dog");
			System.out.println("Press 3 to clean a pet");
			System.out.println("Press 4 to oil a robotic pet");
			System.out.println("Press 5 to adopt a pet");
			System.out.println("Type exit to leave the Virtual Pet Shelter");
			choice = input.nextLine();
			if (choice.equals("1")) {
				System.out.println("What pet would you like to play with?");
				myVirtualPetShelter.showAllPets();
				System.out.println("Enter the name of the pet you would like to play with");
				String name = input.nextLine();
				myVirtualPetShelter.play(myVirtualPetShelter.findPet(name));

				
			}
		} while (!choice.equals("exit"));

	}
}

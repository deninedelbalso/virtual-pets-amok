package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		RoboDog plops = new RoboDog("Plops", 10, 10, 10, 10, "is a RoboDog who smells like a virtual junkyard.");
		RoboCat misterBigToes = new RoboCat("Mister Big Toes", 10, 10, 10, 10, "is a RoboCat who has a luscious silver sheen.");
		Dog raffles = new Dog("Raffles", 10, 10, 10, 10, 10, 10, "is a dog and a Virgo.");
		Cat pickles = new Cat("Pickles", 10, 10, 10, 10, 10, 10, "is a cat who enjoys playing on his phone.");

		myVirtualPetShelter.add(plops);
		myVirtualPetShelter.add(misterBigToes);
		myVirtualPetShelter.add(raffles);
		myVirtualPetShelter.add(pickles);

		String choice;
		do {
			System.out.println();
			System.out.println("Welcome to the Virtual Pet Shelter. We carry both robotic and organic pets!");
			System.out.println();
			System.out.println("Here is the status of the pets:");
			myVirtualPetShelter.showStats();
			System.out.println();
			System.out.println("Press 1 to play an pet");
			System.out.println("Press 2 to walk a dog");
			System.out.println("Press 3 to oil a robotic pet");
			System.out.println("Press 4 to adopt a pet");
			System.out.println("Type exit to leave the Virtual Pet Shelter");
			
			choice = input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("What pet would you like to play with?");
				myVirtualPetShelter.showAllPets();
				System.out.println("Enter the name of the pet you would like to play with");
				String name = input.nextLine();
				myVirtualPetShelter.play(myVirtualPetShelter.findPet(name));
			} else if (choice.equals("2")) {
				System.out.println("What dog would you like to walk? Plops or Raffles?");
				String name = input.nextLine();
			} else if (choice.equals("3")) {
				System.out.println("What robotic pet would you like to oil? Plops or Mister Big Toes?");
				String name = input.nextLine();
			} else if (choice.equals("4")) {
				System.out.println("Pick a pet you would like to adopt");
				String name = input.nextLine();
				myVirtualPetShelter.adopt(myVirtualPetShelter.findPet(name));
				System.out.println("Congrats on your new pet!");
			}
			myVirtualPetShelter.tickAll();
		} while (!choice.equals("exit"));
		input.close();

	}
}

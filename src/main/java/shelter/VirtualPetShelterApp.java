package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		RoboDog plops = new RoboDog("Plops", 10, 10, 10, 10, "is a RoboDog who smells like a virtual junkyard.");
		RoboCat misterBigToes = new RoboCat("Mister Big Toes", 10, 10, 10, 10,
				"is a RoboCat who has a luscious silver sheen.");
		Dog raffles = new Dog("Raffles", 10, 10, 10, 10, 10, 10, "is a dog and a Virgo.");
		Cat pickles = new Cat("Pickles", 10, 10, 10, 10, 10, 10, "is a cat who enjoys playing on his phone.");

		myVirtualPetShelter.add(plops);
		myVirtualPetShelter.add(misterBigToes);
		myVirtualPetShelter.add(raffles);
		myVirtualPetShelter.add(pickles);

		String choice = "";
		do {
			System.out.println();
			System.out.println("Welcome to the Virtual Pet Shelter. We carry both robotic and organic pets!");
			System.out.println();
			System.out.println("Here is the status of the pets:");
			myVirtualPetShelter.showStats();
			System.out.println();
			System.out.println("Press 1 to water the organic pets");
			System.out.println("Press 2 to play with the pets");
			System.out.println("Press 3 to walk all dogs");
			System.out.println("Press 4 to adopt the pets");
			System.out.println("Press 5 to feed the organic pets");
			System.out.println("Press 6 to clean the dog cages");
			System.out.println("Press 7 to admit the pets");
			System.out.println("Press 8 to oil a robotic pet");
			System.out.println("Press 9 to clean the litter boxes");

			System.out.println("Type exit to leave the Virtual Pet Shelter");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("Lets water these organic pets!");
				myVirtualPetShelter.waterAllOrganicPets();
				System.out.println("Watering is fun! " + "Raffles thirst level is now at " + raffles.getThirst()
						+ ". Pickles thirst level is now at " + pickles.getThirst() + ".");
			} else if (choice.equals("2")) {
				System.out.println("What pet would you like to play with?");
				System.out.println("Enter the name of the pet you would like to play with:");
				System.out.println("You can choose from: Plops, Mister Big Toes, Raffles or Pickles");
				String petName = input.nextLine();
				myVirtualPetShelter.findPet(petName).play();
				System.out.println("Playing is fun! " + "Plops's boredom level is now at " + plops.getBoredom()
						+ ". Mister Big Toes's boredom level is now at " + misterBigToes.getBoredom() + ". "
						+ "Raffles boredom level is now at " + raffles.getBoredom()
						+ ". Pickles boredom level is now at " + pickles.getBoredom() + ".");
			} else if (choice.equals("3")) {
				myVirtualPetShelter.walkAllDog();
				System.out.println("Walking is fun! " + "Plops happiness level is now at " + plops.getHappiness()
						+ ". Raffles happiness level is now at " + raffles.getHappiness() + ". ");
			} else if (choice.equals("4")) {
				System.out.println("Pick a pet you would like to adopt");
				System.out.println("You can choose from: Plops, Mister Big Toes, Raffles or Pickles");
				String adoptName = input.nextLine();
				myVirtualPetShelter.adopt(myVirtualPetShelter.findPet(adoptName));
				System.out.println("Congrats on your new pet!");

			} else if (choice.equals("5")) {
				System.out.println("Lets feed these organic pets!");
				myVirtualPetShelter.feedAllOrganicPets();
				System.out.println("Eating is fun! " + "Raffles hunger level is now at " + raffles.getHunger()
						+ ". Pickles hunger level is now at " + pickles.getHunger() + ".");

			} else if (choice.equals("6")) {
				System.out.println("Lets clean those dog cages!");
				myVirtualPetShelter.cleanAllDogCages();
				System.out.println(
						"Fecal material is no fun! " + "Plops waste level is now at " + raffles.getWaste() + ".");

			} else if (choice.equals("7")) {
				System.out.println("What is the name of the pet you want to admit?");
				String name = input.nextLine();
				System.out.println("What kind of pet is it?");
				String descriptionNewAdmit = input.nextLine();
				myVirtualPetShelter.add(null);
				System.out.println("Your pet is now admitted");

			} else if (choice.equals("8")) {
				System.out.println("What robotic pet would you like to oil? Plops or Mister Big Toes?");
				String name = input.nextLine();
				myVirtualPetShelter.oilAllRoboticPets();
				System.out.println("Oiling is fun! " + "Plops oil level is now at " + plops.getOilLevel()
						+ ". Mister Big Toes oil level is now at " + misterBigToes.getOilLevel() + ". ");

			} else if (choice.equals("9")) {
				String clean= input.nextLine();
				pickles.cleanLitterBox();
				System.out.println("Pickles doesnt have to lie in his poop. Rejoice! His waste level is now at" + pickles.getWaste());

			

			} else 
				System.out.println("Shelter is closed. Come back later");
			
			myVirtualPetShelter.tickAll();
		} while (!choice.equals("exit"));
		input.close();

	}
}
import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetAmukApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petStore = new VirtualPetShelter();
		VirtualPet susan = new RoboticCat("Susan", "RoboticCat", 50, 50);
		petStore.addPet(susan);
		VirtualPet rough = new RoboticDog("Rough", "RoboticDog", 50, 50);
		petStore.addPet(rough);
		VirtualPet bark = new OrganicDog("Bark", "OrganicDog", 50, 50);
		petStore.addPet(bark);
		VirtualPet mioww = new OrganicCat("Mioww", "OrganicCat", 50, 50);
		petStore.addPet(mioww);

		System.out.println("Welcome to the PetStore of the Future!");
		System.out.println("\nThis is the status of your pets: " + "\nName\t|Happy\t|Health\t|Look"
				+ "\n--------|-------|-------|-------");

		String petOptions = "\nPress 1 to water Organic pets." + "\nPress 2 to feed Organic Pets."
				+ "\nPress 3 to choose a pet to play with." + "\nPress 4 to adopt pet." + "\nPress 5 to donate a pet."
				+ "\nPress 6 to clean litterbox/Cages." + "\nPress 7 to oil Robotic Pets"
				+ "\nPress 8 to walk all Dogs." + "\nPress 9 to exit.";

		String userChoice;
		while (!petStore.pets.isEmpty()) {
			for (Entry<String, VirtualPet> entry : petStore.pets.entrySet()) {
				System.out.println(entry.getKey() + "\t|" + entry.getValue().getHappiness() + "\t|"
						+ entry.getValue().getHealth() + "\t|" + entry.getValue().getDescription());
			}

			do {
				System.out.println(petOptions);
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6")
					&& !userChoice.equals("7") && !userChoice.equals("8") && !userChoice.equals("9"));
			switch (userChoice) {
			case "1":
				petStore.tickAllPets();
				petStore.water();
				System.out.println("You chose to give water to all of the pets.");
				break;
			case "2":
				petStore.tickAllPets();
				petStore.feedPets();
				System.out.println("You chose to feed all of the pets");
				break;
			case "3":
				System.out.println("You chose to play with a pet.");
				petStore.tickAllPets();
				for (Entry<String, VirtualPet> entry : petStore.pets.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue().getDescription());
				}
				String petPicked = input.next();
				petPicked = petPicked.substring(0, 1).toUpperCase() + petPicked.substring(1).toLowerCase();
				VirtualPet selectedPet = petStore.getAPet(petPicked);
				selectedPet.play();
				System.out.println(selectedPet.getName() + " is cheerful.");
				break;
			case "4":
				petStore.tickAllPets();
				System.out.println("Which pet would you like to buy? ");
				for (Entry<String, VirtualPet> entry : petStore.pets.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue().getDescription());
				}
				String petPurchased = input.next();
				petPurchased = petPurchased.substring(0, 1).toUpperCase() + petPurchased.substring(1).toLowerCase();
				VirtualPet boughtPet = petStore.getAPet(petPurchased);
				System.out.println("Thanks for giving " + petPurchased + "a good home.");
				petStore.adoptAPet(boughtPet);
				break;
			case "5":
				petStore.tickAllPets();
				System.out.println("What is the name of the pet you want to donate?");
				String petName = input.next();
				System.out.println("What type of pet is this?" + "\nPress 1 for Organic Dog."
						+ "\nPress 2 for Robotic Dog." + "\nPress 3 for Organic Cat." + "\nPress 4 for Robotic Cat.");
				String inputUser = input.next();
				switch (inputUser) {
				case "1":
					VirtualPet newPet = new OrganicDog(petName, "OrganicDog", 50, 50);
					petStore.addPet(newPet);
					break;
				case "2":
					VirtualPet newPet1 = new RoboticDog(petName, "RoboticDog", 50, 50);
					petStore.addPet(newPet1);
					break;

				case "3":
					VirtualPet newPet2 = new OrganicCat(petName, "OrganicCat", 50, 50);
					petStore.addPet(newPet2);
					break;
				case "4":
					VirtualPet newPet3 = new RoboticCat(petName, "RoboticCat", 50, 50);
					petStore.addPet(newPet3);
					break;
				}
				System.out.println("Thanks for your donation.");
				break;
			case "6":
				System.out.println("Would you like to clean the litterbox or the cages?" + "\nPress 1 for litterbox"
						+ "\nPress 2 for cages.");

				String inputUser1 = input.next();
				switch (inputUser1) {
				case "1":
					petStore.cleanLitterBox();
					System.out.println("The litterbox has been cleaned.");
					break;
				case "2":
					petStore.cleanAllDogCages();
					System.out.println("The cages have been cleaned.");
					break;
				}
				break;
			case "7":
				petStore.oilRoboticPets();
				System.out.println("All of the Robotic Pets have been oiled.");
				break;
			case "8":
				petStore.walkAllDogs();
				System.out.println("All of the Dogs have been walked");
				break;
			case "9":
				System.out.println("Thanks for visiting the PetStore of the Future!");
				System.exit(0);
				break;
			default:
				System.out.println("Selection not availible, please choose a different selection");
				break;
			}
			
		}

		input.close();
	}
}

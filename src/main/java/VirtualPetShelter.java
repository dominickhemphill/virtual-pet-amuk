
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int litterBoxAmount;

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public int getPetCount() {

		return pets.size();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public void adoptAPet(VirtualPet pet) {
		pets.remove(pet.getName(), pet);

	}

	public void oilRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).oil();
			}
		}
	}

	public void cleanAllDogCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}

	public void feedPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();

			}
		}
	}

	public void water() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).waterPet();
				;
			}
		}
	}

	public void cleanLitterBox() {
		litterBoxAmount = 0;
	}

	public void playWithOnePet(String petName) {
		getAPet(petName).play();

	}

	public void tickAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicCat) {
				litterBoxAmount += 1;
				((OrganicCat) pet).tick();
			}
			if (!(pet instanceof OrganicCat))
				if (pet instanceof OrganicDog) {
					((OrganicDog) pet).tick();
				}
			if (pet instanceof Robotic) {
				((Robotic) pet).tick();
			}
		}
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).takeForAWalk(pet);
			}
			if (pet instanceof RoboticDog) {
				((RoboticDog) pet).takeForAWalk(pet);
			}
		}
	}
}

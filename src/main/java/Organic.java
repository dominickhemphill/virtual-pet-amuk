
public class Organic extends VirtualPet {

	private int hunger;
	private int thirst;

	public Organic(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void setHunger(int hunger) {
		this.hunger += hunger;
	}

	public void setThirst(int thirst) {
		this.thirst += thirst;
	}

	public void feedPet() {
		hunger -= 10;
		thirst += 5;

	}

	public void waterPet() {
		hunger += 5;
		thirst -= 10;

	}

}
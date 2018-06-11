
public abstract class VirtualPet {
	private String name;
	private String description;
	private int HEALTH_LEVEL = 100;
	private int health = HEALTH_LEVEL;
	private int happiness;

	public VirtualPet(String name, String description, int health, int happiness) {
		super();
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health += health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness += happiness;
	}

	public void play() {
		happiness += 10;
		health -= 3;
	}

	public void tick() {
		happiness -= 1;
		health -= 1;
	}

	public boolean myPetLives() {
		if (health > 0 && happiness > 0) {
			return true;
		}
		return false;

	}

}
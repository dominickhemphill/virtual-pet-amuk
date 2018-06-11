
public class OrganicCat extends Organic {
	private int litterBox;

	public OrganicCat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

		this.litterBox = litterBox;
	}

	public int getLitterBox() {
		return litterBox;
	}

	@Override
	public void tick() {
		super.setHunger(1);
		super.setThirst(1);
		super.tick();
	}

}

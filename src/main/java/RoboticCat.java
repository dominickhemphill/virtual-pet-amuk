
public class RoboticCat extends Robotic {

	public RoboticCat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

	}

	@Override
	public void tick() {
		super.setOilMaintainPet(-5);
		super.tick();
	}

}


public class RoboticDog extends Robotic implements TakeForAWalk{

	
	
	public RoboticDog(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
		
	}

	@Override
	public void takeForAWalk(VirtualPet virtualPet) {
		virtualPet.setHappiness(10);
		
	}
	
	@Override
	public void tick() {		
			super.setOilMaintainPet(-5);
			super.tick();
			
	}
	
}

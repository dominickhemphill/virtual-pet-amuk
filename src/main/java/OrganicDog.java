
public class OrganicDog extends Organic implements TakeForAWalk, Tick {

		private int cageFilth = 0;
		
		
		
		
	public OrganicDog(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

	}

	public int isCageClean() {
		return cageFilth;
	}

	public void cleanCage() {
		cageFilth = 0;
	}

	@Override
	public void takeForAWalk(VirtualPet virtualPet) {
		virtualPet.setHappiness(5);
		virtualPet.setHealth(5);
		
	}
	
	
	@Override
	public void tick() {		
			super.setHunger(1);
			super.setThirst(1);
			cageFilth += 1;
			super.tick();
	}
	

}

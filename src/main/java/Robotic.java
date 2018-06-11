
public class Robotic extends VirtualPet {

	private int oilMaintainPet;

	public Robotic(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

		oilMaintainPet = oilMaintainPet;

		this.oilMaintainPet = oilMaintainPet;
	}

	public void oil() {
		oilMaintainPet += 5;

	}

	public int getOilMaintainPet() {
		return oilMaintainPet;
	}

	public void setOilMaintainPet(int oilMaintainPet) {
		this.oilMaintainPet += oilMaintainPet;
	}
}
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {
	// private int litterBoxWaste;
	VirtualPet newPet = new Robotic("name", "discription", 10, 10);
	VirtualPetShelter testShelter = new VirtualPetShelter();
	// this.litterBoxWaste = litterBoxWaste;

	@Test
	public void shouldAddPetToShelter() {
		int numberOfPetsBeforeAdd = testShelter.getPetCount();
		testShelter.addPet(newPet);
		int numberOfPetsAfterAdd = testShelter.getPetCount();
		assertThat(numberOfPetsAfterAdd, is(equalTo(numberOfPetsBeforeAdd + 1)));
	}

	@Test
	public void removePetFromShelter() {
		int numberOfPetsBeforeRemove = testShelter.getPetCount();
		testShelter.adoptAPet(newPet);
		int numberOfPetsAfterRemove = testShelter.getPetCount();
		assertThat(numberOfPetsAfterRemove, is(equalTo(numberOfPetsBeforeRemove - 1)));
	}
	
	

}

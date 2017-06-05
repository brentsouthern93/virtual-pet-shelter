import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// making the map/hashmap for virtualpet/shelterpets

	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	// Tick for time passing
	public void tick() {
		for (VirtualPet current : shelterPets.values()) {
			current.hunger += 10;
			current.thirst += 10;
			current.boredom += 10;
		}
	}

	// add new pet to the map (method)

	public void addNewPet(VirtualPet pet) {
		shelterPets.put(pet.getName().toLowerCase(), pet);
	}

	// take pet off map when adopted (method)

	public void removePet(String pet) {
		shelterPets.remove(pet);
	}

	// putting the map information in a table

	public String shelterPets() {
		String rosterMenu = "Name        " + " Hunger    " + "     Thirst    " + "      Boredom ";
		String divider = "-----------------------------------------------------";
		String menuLine = "";
		for (VirtualPet entry : shelterPets.values()) {
			menuLine = entry.individualPetStats();
			rosterMenu = rosterMenu + "\n" + divider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	// allows single pet to get selected

	public VirtualPet getPet(String name) {
		return shelterPets.get(name);
	}

	// methods to give food and water to all pets with a loop

	public void feedAll() {
		for (VirtualPet current : shelterPets.values()) {
			current.giveFood();
		}
	}

	public void waterAll() {
		for (VirtualPet current : shelterPets.values()) {
			current.giveWater();
		}
	}

	public void playWithPet(String name) {
		getPet(name).playWithIt();
	}

	// method to call the main menu

	public String getMainMenu() {
		return "What do you want to do now:\n 1) Feed the pets\n 2) Give water to pets\n 3) Play with a pet\n 4) Adopt a pet\n 5) add a pet to roster\n ";
	}

	
	
	public String petOptions() {
		String selectedPet = "";
		for (VirtualPet current: shelterPets.values()) {
			selectedPet = selectedPet + current.toString();
			
		}
		return selectedPet;
	}

}
public class VirtualPet {

	// instance variables (attributes)

	int hunger;
	int thirst;
	int boredom;
	String name;
	String description;

	// this is the constructor for VirtualPet

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	// this is the constructor for introducing the other pets

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 10;
		this.thirst = 10;
		this.boredom = 10;
	}

	// Get methods

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	// what to with the pets (methods)

	void giveFood() {
		hunger -= 10;
	}

	void giveWater() {
		thirst -= 10;
	}

	void playWithIt() {
		boredom -= 10;
	}

	// Method for a menu of the individual pet's stats.

	public String individualPetStats() {
		return name + "\t|\t" + hunger + "\t|\t" + thirst + "\t|\t" + boredom + "  |";
	}

	//assigning a description for the pets (method)

	public String giveDescription(String description) {
		this.description = description;
		return this.description;
	}

	// Override for printing the strings correctly

	@Override
	public String toString() {
		return name + description;
	}

}

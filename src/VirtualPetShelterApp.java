import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter landOfMisfitPets = new VirtualPetShelter();

		VirtualPet Doofus = new VirtualPet("Doofus", 10, 10, 10);
		Doofus.giveDescription(": Not the sharpest tool in the shed, tongue hangs far out of his mouth, always drooling.\n");

		VirtualPet Scar = new VirtualPet("Scar", 20, 20, 30);
		Scar.giveDescription(": Natural born warrior. Proud and Dignified. Very protective of those he cares for. \n");

		VirtualPet Twitch = new VirtualPet("Twitch", 20, 20, 30);
		Twitch.giveDescription(":Problems sleeping due to twitching itself awake. Only sleeps when classical music is playing. \n");

		VirtualPet Dutchess  = new VirtualPet("Dutchess", 15, 15, 10);
		Dutchess.giveDescription(": The mother figure of the shelter pets. Huge Diva. Needs constant attention. \n");

		landOfMisfitPets.addNewPet(Doofus);
		landOfMisfitPets.addNewPet(Scar);
		landOfMisfitPets.addNewPet(Twitch);
		landOfMisfitPets.addNewPet(Dutchess);

		System.out.println("Welcome to the Land Of Misfit Pets! Thank you stopping by to help take care of these little rascals!");
				
		System.out.println("Type \"Quit\" at any time to leave the game.\n");
		
//		shelter game loop.
		
		do {

		System.out.println(landOfMisfitPets.shelterPets());

		System.out.println(landOfMisfitPets.getMainMenu());

		String choice = input.next();
		checkForQuit(choice);
		
		switch(choice.toLowerCase()) {
		
		case "1":
			landOfMisfitPets.feedAll();
			System.out.println("YUM! They had built up quite the appetite.");
			break;
			
		case "2":
			landOfMisfitPets.waterAll();
			System.out.println("ahhhhhhh! refreshing..");
			break;
			
		case "3":
			System.out.println("Pick a pet you want to play with.");
			System.out.println(landOfMisfitPets.petOptions());
			String playChoice = input.next().toString().toLowerCase();
			checkForQuit(playChoice);
			landOfMisfitPets.playWithPet(playChoice);
			System.out.println("Thank for playing with " + playChoice +"\n");
			break;
			
		case "4":
			System.out.println(landOfMisfitPets.petOptions());
			System.out.println("Which pet do you want to adopt?");
			String  petChoice = input.next();
			checkForQuit(petChoice);
			landOfMisfitPets.removePet(petChoice.toLowerCase());
			System.out.println("Thank you for adopting "+ petChoice + ", you were meant for eachother!");
			break;
			
		case "5":
			System.out.println("What is pets name that you want to donate to the shelter?");
			String donatedPet = input.next();
			checkForQuit(donatedPet);
			VirtualPet newDonatedPet= new VirtualPet(donatedPet, 10, 10, 10);
			landOfMisfitPets.addNewPet(newDonatedPet);
			System.out.println("Thank you for choosing Land Of Misfit Pets to donate this one");
			break;
			
		
			
		}
		
		
		} while(!input.equals("quit"));

	}

	public static void checkForQuit(String input) {
		if (input.equalsIgnoreCase("quit")) {
			System.out.println("Thanks for your help. Until next time!");
			System.exit(0);

		}

	}
}

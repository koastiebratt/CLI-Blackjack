package part1;

public class Main {

	public static void main(String[] args) {
		//Gameplay Logic goes here
		String userInput = "";
		do {
			userInput = Menu.GameMenu();
			if (userInput == "Y") {
				userInput = "";
				
			}
		} while (userInput == "Y");
		
		
	}

}

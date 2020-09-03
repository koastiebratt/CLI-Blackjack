package part1;

public class Main {

	public static void main(String[] args) {
		//Gameplay Logic goes here
		String userInput = "";
		
		do {
			
			int playerScore = 0;
			
			do {
				
			
			userInput = Menu.GameMenu();
			if (userInput == "Y") {
				userInput = "";
				
				}
			
			//Run players Turn while under
			}while(playerScore < 21);
		
		//While Player wants to play
		} while (userInput == "Y");
		
		
	}

}

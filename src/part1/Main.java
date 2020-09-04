package part1;

public class Main {

	public static void main(String[] args) {
		char userInput = 'Y';
		
		//When do runs, everything is reset
		do {
			int deck[] = NewDeck.NewDeck();
			//Player gets Max 4 splits
			int[][][][] playerHand = new int[11][11][11][11];
			//Dealer gets one hand
			int[] dealerHand = new int[11];
			int playerScore = 21;
			int dealerScore = 0;
			int cardIndex = 4;
			
			/**
			 * Create User and Dealer starting hand here
			 */
			do {
				
		
			
				
			//Run players Turn while under
			}while(playerScore < 21);
		
			
			//Will return a value to userInput. If it returns N it will exit
			userInput = Menu.GameMenu();
		} while (userInput == 'Y' || userInput == 'y');
		
		System.out.println();
		System.out.println("Thanks for playing!!!");
	}

}

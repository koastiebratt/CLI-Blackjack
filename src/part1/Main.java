package part1;

public class Main {

	public static void main(String[] args) {
		boolean want_Continue = true;
		
		//When do runs, everything is reset
		do {
			int player_Number_Of_Hands = 1;
			int deck[] = NewDeck.NewDeck();
			//Player gets Max 4 splits, each hand max 11 cards
			int[][] playerHand = new int[4][11];
			//Dealer gets one hand
			int[] dealerHand = new int[11];
			int playerScore = 0;
			int dealerScore = 0;
			int cardIndex = 4;
			char Menu_Input = ' ';	
			
			//Creates playerStarting
			playerHand[0][0] = deck[0];
			playerHand[0][1] = deck[2];
			
			dealerHand[0] = deck[1];
			dealerHand[1] = deck[3];
			
			do {
				
				int temp_Index = CardIndex.getCardIndex(player_Number_Of_Hands, playerHand, dealerHand);
				cardIndex = temp_Index;
				Menu_Input = Menu.Print_Menu();
				
				//If split && 
				if((Menu_Input == 'b' || Menu_Input == 'B')) {
					if(Score.getScore(playerHand[0][0]) == Score.getScore(playerHand[0][1])) {
						player_Number_Of_Hands = player_Number_Of_Hands + 1;
						int player_Scores[] = Split.Split(playerScore, deck, player_Number_Of_Hands, playerHand, cardIndex);
					}else{
						System.out.println("Can't split, cards dont match");
						Menu_Input = 'h';}
				//If stand
				}else if((Menu_Input == 's' || Menu_Input == 'S')) {
					dealerScore = DealersTurn.Dealer(deck, dealerHand, dealerScore, cardIndex);
				//If hit
				}else if((Menu_Input == 'h' || Menu_Input == 'H')) {
					playerScore = Hit.hit(playerScore, deck, cardIndex);
					cardIndex +=1;
				//If Double down
				}else if((Menu_Input == 'd' || Menu_Input == 'D')) {
					playerScore = Double.DoubldeDown(deck, playerHand[0], playerScore, cardIndex);
					cardIndex+=1;
					Menu_Input = 's';
				}
			
			//Run players Turn while under
			}while(playerScore < 21 && (Menu_Input != 's' || Menu_Input != 'S'));
		
			dealerScore = DealersTurn.Dealer(deck, dealerHand, dealerScore, cardIndex);
			
			Winner.checkWinner(playerScore, dealerScore);
			
			//Will return a boolean to want_Continue
			want_Continue = Continue.Continue();
		} while (want_Continue);
		
		System.out.println();
		System.out.println("Thanks for playing!!!");
	}

}

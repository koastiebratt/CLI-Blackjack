package part1;
/**
 * 
 * Dealers turn returns the dealers final score only. After Dealers turn is called you will use this new value and compare
 *   to players score to declare a winner.
 */





public class DealersTurn {
	
	public static int Dealer(int Deck[], int dealerHand[], int dealerScore, int cardIndex) {
		
		int[] temp_deck = Deck;
		int[] temp_Dealer = dealerHand;
		int temp_Dealer_Score = dealerScore;
		int index = cardIndex;
		
		//Cant deal more cards than deck has
		for(int i = 0; i < (52 - cardIndex); i++) {
			//While dealer is below thresholds
			if((dealerScore < 17 && dealerScore <21)) {
				temp_Dealer[i+2] = temp_deck[index];
				index+=1;
			}else {
				continue;
			}	
		}
		
		//Gets final score
		for(int j = 0; j < temp_Dealer.length; j++) {
			temp_Dealer_Score += Score.getScore(temp_Dealer[j]);
		}
		
		return temp_Dealer_Score;
	}
}

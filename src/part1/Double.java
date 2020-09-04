package part1;
/**
 * 
 * When double down is called, 1 additional card is added and that is the players final score. This method return a score only!!!!
 *
 */
public class Double {
	
	public static int DoubldeDown(int Deck[], int playerHand[], int playerScore, int cardIndex) {
		
		int[] temp_deck = Deck;
		int[] temp_player = playerHand;
		int temp_player_Score = playerScore;
		int index = cardIndex;
		
		playerHand[3] = temp_deck[cardIndex];
		
		for(int i = 0; i < 3; i++) {
			
			temp_player_Score += Score.getScore(temp_player[i]);
			
		}
		
		return temp_player_Score;
	}

}



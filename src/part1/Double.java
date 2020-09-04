package part1;
/**
 * 
 * When double down is called, 1 additional card is added and that is the players final score. This method return a score only!!!!
 *
 */
public class Double {
	
	public static int DoubldeDown(int Deck[], int playerHand[], int playerScore, int cardIndex) {
		
		int[] temp_deck = Deck;
		int[] temp_player = new int[playerHand.length];
		int temp_player_Score = playerScore;
		int index = cardIndex;
		
		for(int k = 0; k < temp_player.length ; k++) {
			int temp_val = playerHand[k];
			temp_player[k] = temp_val;
		}
		
		playerHand[2] = temp_deck[cardIndex];
		
		for(int i = 0; i < 3; i++) {
			
			temp_player_Score += Score.getScore(temp_player[i]);
			
		}
		
		return temp_player_Score;
	}

}



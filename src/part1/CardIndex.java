package part1;

public class CardIndex {

	public static int getCardIndex(int num_player_hands,int playerHands[][], int delearHand[]) {
		int total_cards = 0;
		
		//Cycle through all of player hands
		for(int i = 0; i < num_player_hands; i++) {
			//Number of cards in that hand
			for( int k = 0; k < playerHands[i].length; k++) {
				//if value, count it
				if(playerHands[i][k] != 0) {
					total_cards +=1;
				}else {
					continue;
				}
			}
		}
		
		//Cycle through dealersHand
		for(int d = 0; d < delearHand.length; d++) {
			//If a value, count it
			if(delearHand[d] != 0) {
			total_cards+=1;
			}
		}
		return total_cards;
	}

}

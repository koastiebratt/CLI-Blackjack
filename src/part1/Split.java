package part1;

public class Split {
	
	public static int Split(int player_Score, int deck[], int num_Hands, int player_hand[][], int card_index) {
		
		int temp_player_hand[][] = player_hand;
		
		int player_Scores[] = {player_Score, 0, 0, 0};
		int temp_Deck[] = deck;
		int temp_Index = card_index;
		
		//Cycle through number of hands available
		for(int i = 0; i < num_Hands; i++){
			
			//Sets current score to player score
			int temp_score = player_Scores[i];
			
			//If that individual hand it less tha 21
			if(player_Scores[i] < 21) {
				
				char user_input = Menu.Print_Menu();
				
				//Hit
				if((user_input == 'H' || user_input == 'h') && player_Scores[i] < 21) {
					//If that hand is less than 21, user can hit
					for(int j = 2; j < 11; j++) {
						int temp_Card = temp_Deck[temp_Index];
						temp_player_hand[i][j] = temp_Card;
						temp_Index +=1;
					}
					
					for(int k = 0; k < temp_player_hand[i].length; k++) {
						
						temp_score += Score.getScore(temp_player_hand[i][k]);
					}
					
					player_Scores[i] = temp_score;
					
				}else if((user_input == 'd' || user_input == 'D')) {
					
					player_Scores[i] = Double.DoubldeDown(temp_Deck, temp_player_hand[i], player_Scores[i], temp_Index);
					
				}else if((user_input == 's' || user_input == 'S')) {
					continue;
				}
			}
		}
	}
}
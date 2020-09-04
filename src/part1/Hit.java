package part1;

import java.util.Scanner;

public class Hit {

	public static int hit(int playerScore, int[] deck, int card_index) {
		
		int[] temp_deck = deck;
		int temp_index = card_index;
		int temp_Score = playerScore;
		
		temp_Score += temp_deck[temp_index +1];
		
		return temp_Score;
	}
}

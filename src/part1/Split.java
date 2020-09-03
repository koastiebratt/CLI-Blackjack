package part1;

import java.util.Scanner;

public class Split {
	
	public static void split(int playerScore, int dealerScore, boolean auto_lost, int[] new_deck) {
		
		
		public static void hit(int playerScore, int dealerScore, boolean auto_lost, int[] new_deck) {
			
			
			if (!Winner.checkWinner(playerScore, dealerScore, auto_lost)) {
				
				//Deck Starting point after dealing
				int j = 4;
				
				char userChoice = (Menu.Print_Menu());
				
				while(userChoice == 'h' || userChoice =='H') {
					
					playerScore += Score.getScore(new_deck[j]);
					
					if (!Winner.checkWinner(playerScore, dealerScore, auto_lost)) {
						
						j++;
						
						dealerScore += Score.getScore(new_deck[j]);
						
						if (!Winner.checkWinner(playerScore, dealerScore, auto_lost)) {
							
							j++;
							userChoice = (Menu.Print_Menu());
						}
						
					}else { 
						userChoice = 's';
					}
				}
			}
		}
}
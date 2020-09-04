package part1;

public class Winner {
	
	//If player wins return true
	//If dealer wins return false / If tie return false / if error return false (bool check in main for scores again)
	public static boolean checkWinner(int playerScore, int dealerScore){
		
		if (((playerScore > dealerScore) && (playerScore <=21)) && (dealerScore != playerScore)) {
			
			System.out.println("Player Wins");
			
			return true;
			
		} else if (((playerScore < dealerScore) && (dealerScore <=21)) && (dealerScore != playerScore)) {
			
			System.out.println("Dealer Wins");
			
			return false;
			
		}else if((dealerScore == playerScore)){
			
			System.out.println("PUSH");
			return false;
			
		}else {
			
			return false;
			
		}
	}
}

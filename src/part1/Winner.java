package part1;

public class Winner {
	
	public static boolean checkWinner(int playerScore, int dealerScore, boolean auto_lost){
		
		if ((playerScore > dealerScore && playerScore <=21) && !auto_lost) {
			System.out.println("Player Wins");
			return true;
		} else if ((playerScore < dealerScore && dealerScore <=21) && !auto_lost) {
			System.out.println("Dealer Wins");
			return true;
		} else {
			return false;
		}
	}
}

package part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	
	public static char Print_Menu() {
		
		Scanner input = new Scanner(System.in);
		char user_Choice = 's';
		boolean ExceptionThrown = false;
		
		do {
			try {
				//Print new Menu
				System.out.println();
				System.out.println("h : HIT");
				System.out.println("s : STAND");
				System.out.println("d : DOUBLE");
				System.out.println("b : SPLIT ");
				System.out.println();
				System.out.print("Please Enter Your Action : ");
				
				user_Choice = input.next().charAt(0);
				ExceptionThrown = false;
				
			}catch(InputMismatchException e) {
				
				System.out.println("Invalid response detected. Please Try again");
				System.out.println();
				ExceptionThrown = true;
				input.nextLine();
			}
			
		}while(ExceptionThrown);
		
		input.close();
		return user_Choice;
	}
	
	public static char GameMenu () {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter y to contine or n to exit : ");
		return input.next().charAt(0);
		
	}
}







		
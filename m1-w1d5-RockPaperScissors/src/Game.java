import java.util.Scanner;
import java.util.Random;

public class Game {
	
	static String title = "Rock, Paper, Scissors!";
	static String[] options = new String[] { "Rock", "Paper", "Scissors" };
	
	public static void main(String[] args) {
		
		boolean running = true;
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		int humanWins = 0;
		int computerWins = 0;
		int tie = 0;
		
		System.out.println("Welcome to " + title);
		
		while ( running) {
			
			System.out.println("Select (R)ock, (P)aper, (S)cissors, or (Q)uit");
			
			String choice = in.nextLine();
			int computerChoice = rand.nextInt(3);
			String result = "";
			
			System.out.println("The Computer Chooses " + options[computerChoice]);
			
			switch (choice.toUpperCase()) {
				case "Q":
					result  = "Thank you for playing " + title;
					running = false;
					break;
				case "R":
					switch(computerChoice) {
						case 0:  // Rock
							tie++;
							result = "It's a TIE!";
							break;
						case 1:  // Paper
							computerWins++;
							result = "Computer Wins!";
							break;
						case 2:  // Scissors
							humanWins++;
							result = "Player Wins!";
							break;
					}
					break;
				case "P":
					switch(computerChoice) {
						case 0:  // Rock
							humanWins++;
							result = "Player Wins!";
							break;
						case 1:  // Paper
							tie++;
							result = "It's a TIE!";
							break;
						case 2:  // Scissors
							computerWins++;
							result = "Computer Wins!";
							break;
					}
					break;
				case "S":
					switch(computerChoice) {
						case 0:  // Rock
							computerWins++;
							result = "Computer Wins!";
							break;
						case 1:  // Paper
							humanWins++;
							result = "Player Wins!";
							break;
						case 2:  // Scissors
							tie++;
							result = "It's a TIE!";
							break;
					}
					break;
				default:
					result = "Invalid Selection!";
					break;
			}
			
			System.out.println(result);
			System.out.println("Player: " + humanWins + 
					"  Computer: " + computerWins + "  Ties: " + tie );
		
		}
		

	}

}

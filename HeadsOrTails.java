package number14;

import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Player one = new Player();
		Player two = new Player();
		Coin coin;
		
		do {
			coin = new Coin();
			System.out.print("P1's Guess: ");
			char p1Guess = input.nextLine().toUpperCase().charAt(0);
			
			System.out.print("P2's Guess: ");
			char p2Guess = input.nextLine().toUpperCase().charAt(0);
			
			one.guessSide(p1Guess, coin);
			two.guessSide(p2Guess, coin);
			
			System.out.println("P1's Guess:  " + p1Guess + "\t\t"
					+ "P2's Guess: " + p2Guess);
			System.out.println("The coin landed " + coin.getSideUp());
			System.out.println("P1's points:  " + one.getPoints() + "\t\t"
					+ "P2's Points: " + two.getPoints());
			System.out.println("----------------------------------------");
			
		} while (one.getPoints() < 5 && two.getPoints() < 5);
		
		if (one.getPoints() == 5 && two.getPoints() == 5){
			System.out.println("This game is a tie!");
		}
		else if (one.getPoints() == 5){
			System.out.println("Player 1 is the winner!");
		}
		else if (two.getPoints() == 5){
			System.out.println("Player 2 is the winner!");
		}
		
		input.close();
	}

}

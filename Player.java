package number14;

public class Player {

	private int points;


	public Player(){
		points = 0;
	}

	public void guessSide(char guess, Coin coin){
		String userGuess;
		if (guess == 'T'){
			userGuess = "tails";
		}
		else if (guess == 'H'){
			userGuess = "heads";
		}
		else
			userGuess = "wrong";

		if (userGuess.equals(coin.getSideUp())){
			points++;
		}
		else {
			if (points > 0){
				points--;
			}
		}
	}


	public int getPoints(){
		return points;
	}
}

package number14;

import java.util.Random;

public class Coin {

	private String sideUp;
	
	public Coin(){
		toss();
	}
	
	public void toss(){
		Random rand = new Random();
		int number = rand.nextInt(2);
		
		if (number == 0)
			sideUp = "heads";
		else
			sideUp = "tails";
	}
	
	public String getSideUp(){
		return sideUp;
	}
	
}

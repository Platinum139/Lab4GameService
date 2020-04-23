package ws;

import java.util.Random;

public class GameWS {
	
    public boolean play(int minValue, int maxValue, int tryNumber) {
    	
		// guess random number in range (minnumber, maxnumber)
		Random r = new Random();
		
		int guessedNumber = r.nextInt((maxValue - minValue + 1) + minValue);
		System.out.println("Guessed number: " + guessedNumber);
		
		// check if trynumber equals guessed number
		return (tryNumber == guessedNumber);
    }
}
package launchGame;

import java.util.Scanner;

class Guesher {
	int guessNum;
	Scanner scan = new Scanner(System.in);
	public int guessNumber() {
		

		System.out.println("Gusser kindly guess the number.");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	public void closescan() {
		scan.close();
	}

}

class Player {

	int guessNum;
	Scanner scan = new Scanner(System.in);
	public int guessNumber() {
		System.out.println("Player plz guess the number.");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	public void closeScan() {
		scan.close();
	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumberFromGusser() {
		Guesher g = new Guesher();
		numFromGuesser = g.guessNumber();
	}

	public void collectNumberFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();

	}

	void compare() {
		
		if(numFromGuesser==numFromPlayer1 ) {
			
			if(numFromPlayer1==numFromPlayer2 && numFromPlayer2==numFromPlayer3)
			System.out.println("All winner won.");
			
			else if(numFromPlayer1==numFromPlayer2)
				System.out.println("Player 1 and 2 won the game.");
			else if(numFromPlayer1==numFromPlayer3)
				System.out.println("Player 1 and 3 won the game.");
			else
				System.out.println("only player 1 won the game.");
				
		}

		else if(numFromGuesser==numFromPlayer2) {
			if(numFromPlayer2==numFromPlayer3)
				System.out.println("Player 2 and 3 won the game.");
			else
				System.out.println("Player 2 won the game.");
			
			
		}
		
		else if(numFromGuesser==numFromPlayer3)
			System.out.println("Player 3 won the game.");
		
		else
			System.out.println("No one Won.");
		
		
	}
	}



public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u= new Umpire();
		Guesher g=new Guesher();
		Player p=new Player();
		u.collectNumberFromGusser();
		u.collectNumberFromPlayer();
		u.compare();
		g.closescan();
		p.closeScan();
		
		
	}

}

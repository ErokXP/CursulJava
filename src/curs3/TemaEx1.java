package curs3;

import java.util.Scanner;

public class TemaEx1 {
	int numar;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		scan.close();
	}
	
	public void checkNumberIsCorrect() {
		
		if(numar >=0 && numar <=65) {
			System.out.println("Ai picat. Mai incearca!");
		}
		else {
			System.out.println("Felicitari, ai trecut!");
		}
	}
}

package curs3;

import java.util.Scanner;

public class TemaEx2 {
	int numar;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		scan.close();
	}
	
	public void checkNumberIsCorrect() {
		askTheUserForANumber();
		
		if(numar >= 0 && numar <18) {
			System.out.println("Esti minor!");
		}
		else if (numar == 18 || numar == 65) {
			System.out.println("Esti adult!");
		}
		else {
			System.out.println("Esti batran!");
		}
	}
}

package curs3;

import java.util.Scanner;

/*
 * Program care citeste un numar de la tastatura
 * Si verifica daca este o zi lucratoare sau este weekend
 * Ex:  citeste 1 --> "Its a working day!"
 * 		citeste 7 --> "Its weekend!"
 * 		citeste 9 --> "Invalid day!"
 */

public class CheckWorkingDay {

	int zi;
	
	public void askTheUserForADay() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		scan.close();
	}
	
	public void checkDay() {
		// && --> AND
		// || --> OR
		askTheUserForADay();
		
		if(zi >= 1 && zi <=5 ) {
			System.out.println("Its a working day!");
		}
		else if (zi == 6 || zi == 7) {
			System.out.println("Its weekend!");
		}
		else {
			System.out.println("Invalid day!");
		}
	}
	
}

package curs3;

import java.util.Scanner;

public class TemaEx3 {
	int numar;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		scan.close();
	}
	
	public void checkNumberIsCorrect() {
		askTheUserForANumber();
		
		if(numar == 0) {
			System.out.println("Te rog sa introduci un numai mai mare ca 0!");
		}		
		else if(numar == 1) {
			System.out.println("Astazi este luni!");
		}
		else if (numar == 2) {
			System.out.println("Astazi este marti!");
		}
		else if (numar == 3) {
			System.out.println("Astazi este miercuri!");
		}
		else if (numar == 4) {
			System.out.println("Astazi este joi!");
		}
		else if (numar == 5) {
			System.out.println("Astazi este vineri!");
		}
		else if (numar == 6) {
			System.out.println("Astazi este sambata!");
		}
		else if (numar == 7) {
			System.out.println("Astazi este duminica!");
		}
		else {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid!");
		}
	}
}

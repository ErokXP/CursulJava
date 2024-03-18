package curs5;

import java.util.Scanner;

/* Facem un program care calculeaza impozitul global
 * Intrebam userul cate venituri are
 * Pentru fiecare venit in parte calculam impozit
 * Daca venitul este <=50000 atunci impozit este 0.1 daca nu este 0.15
 * La final printam impozitul total
 */

public class CalculImpozitVenit {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate surse de venit ai?");
		int numarVenituri = scan.nextInt();

		double impozitTotal = 0;
		
		for (int i=1; i <= numarVenituri; i++) {
		
			System.out.println("Introdu venitul nr " + i);
			double venit = scan.nextDouble();
			
			double impozit;
						
			if(venit <=50000) {
				impozit = venit*0.1;
			}else {
				impozit = venit*0.15;
			}
			
			impozitTotal = impozitTotal + impozit;
		}
		
		System.out.println("Impozitul total este: " + impozitTotal);
	}

}

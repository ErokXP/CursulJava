package curs4;

import java.util.Scanner;

/*
 * Program care citeste 2 numere si verifica:
 * Verifica fiecare numar daca este pozitiv si printeaza
 * Verifica ambele numere daca sunt pozitive
 * Verifica care numar este mai mic/mare sau daca sunt egale
 */

public class ConditionalOperator {

	public static void main(String[] args) {
		int nr1, nr2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		nr1 = scan.nextInt();
		System.out.println("Please enter second number: ");
		nr2 = scan.nextInt();
		
		//verificam daca nr1 este pozitiv
		if(nr1 >0) {
			System.out.println("Nr1 este pozitiv");
		}else {
			System.out.println("Nr1 este negativ");
		}
		
		//variabila = conditie ? expresie true : expresie false;
		String result = nr1 >0 ? "Nr1 este pozitiv" : "Nr1 este negativ";
		System.out.println(result);
		result = nr2 >0 ? "Nr2 este pozitiv" : "Nr2 este negativ";
		System.out.println(result);
		
		//verificam daca ambele numere sunt pozitive
		result = (nr1 >0) && (nr2 >0) ? "Ambele nr sunt pozitive" : "Un nr este negativ";
		System.out.println(result);
		
		//verificam care numar este mai mare sau daca sunt egale
		if(nr1 == nr2) {
			System.out.println("Sunt eglae");
		}else if(nr1 > nr2) {
			System.out.println("Nr1 este mai mare");
		}else {
			System.out.println("Nr2 este mai mare");
		}
		
		result = (nr1 == nr2) ? "Sunt egale": (nr1>nr2) ? "Nr1 este mai mare" : "Nr2 este mai mare";
		
	}

}

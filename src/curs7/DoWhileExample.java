package curs7;

import java.util.Scanner;

/*
 * Intrebam un username si validam ca nu este null
 * si ca nu este mai mic decat 6
 */

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Rezolvare cu while:");
		System.out.println("Introdu un username:");
		String username = scan.next();
		
		
		while(username.equals(null) || username.length()<6) {
			System.out.println("Introdu un username:");
			username = scan.next();
			
		}
		
		System.out.println("------------------------------------");
		
		do {
			System.out.println("Introdu un username:");
			 username = scan.next();
			 
		}while(username.equals(null) || username.length()<6);
		
	}
	
}

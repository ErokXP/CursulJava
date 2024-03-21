package curs6;

import java.util.Scanner;

/*
 * Facem un porgram care ii cere userului numere incontinuu
 * numerele le inmulteste cu 10 si printeaza rezultatul
 * daca userul introduce 0 facem exit din program
 */


public class ForVsWhile {

	public static void main(String[] args) {
		rezolvareCuFor();
		rezolvareCuWhile();
		rezolvareCuDoWhile();

	}
	
	public static void rezolvareCuFor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numar: ");
		int numar = scan.nextInt();
		int result;
		
		for(;numar != 0; ) {
			result = numar * 10;
			System.out.println("Result : " + result);
			System.out.println("Introdu numar : ");
			numar = scan.nextInt();
		}
	}
		
	public static void rezolvareCuWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numar: ");
		int numar = scan.nextInt();
		int result;
			
		while(numar != 0) {
			result = numar * 10;
			System.out.println("Result : " + result);
			System.out.println("Introdu numar : ");
			numar = scan.nextInt();
		}
	}
	
	public static void rezolvareCuDoWhile() {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Introdu numar: ");
		//int numar = scan.nextInt();
		int result;
		int numar = 0;
		do {
			System.out.println("Introdu numar : ");
			numar = scan.nextInt();
			if(numar == 0) {
				break;
			}else {
				result = numar * 10;
				System.out.println("Result : " + result);
			}
			
		}while(numar != 0);
	}

}

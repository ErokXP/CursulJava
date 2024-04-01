package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {

	try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu num1: ");
		int num1 = scan.nextInt();
		System.out.println("Introdu num2: ");
		int num2 = scan.nextInt();
		num2 = (Integer) null;
		int division = num1/num2;
		System.out.println("Division " + division);
	}catch(ArithmeticException e) {
		System.out.println("Nu mai imparti la 0 ca nu merge!");
	}catch(InputMismatchException e) {
		System.out.println("Introdu doar numere, nu merge cu altceva!");
	}catch(NullPointerException e) {
		System.out.println("A iesit cu Null pointer!");
	}catch(Exception e) {
		System.out.println("Something wrong happened!");
	}
	
	}
}

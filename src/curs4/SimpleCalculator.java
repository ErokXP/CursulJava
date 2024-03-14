package curs4;

import java.util.Scanner;

/*
 * Program care simuleaza un basic calculator
 * Avem operatiile de baza: +(adunare), -(scadere), * sau x(inmultire), / sau ;(impartire)
 * Intrebam userul numarul1, operatorul matematic, numarul2 si printam
 * Ex: 2 + 2 = 4
 */


public class SimpleCalculator {

	int nr1, nr2, result;
	char operator;
	
	public void askTheUser( ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pease enter first number: ");
		nr1 = scan.nextInt();
		System.out.println("Pease enter the math operator: ");
		operator = scan.next().charAt(0);
		System.out.println("Pease enter second number: ");
		nr2 = scan.nextInt();
		scan.close();

	}
	
	public void calculator() {
		askTheUser();
		
		if(operator == '+') {
			result = nr1 + nr2;
		}else if(operator == 'i') {
			result = nr1 - nr2;
		}else if (operator == '*' || operator == 'x') {
			result = nr1 * nr2;
		}else if (operator == '/' || operator == ':') {
			result = nr1 / nr2;
		}else {
			System.out.println("Unknown operator!");
		}
		
	}
	

	public void printResult() {
		System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
	}

}
		
	
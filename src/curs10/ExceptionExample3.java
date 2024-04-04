package curs10;

import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
	
		ExceptionExample3 obj = new ExceptionExample3();
		obj.division();

	}
	
	public void division() {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, result;
		
		do {
			try {
				System.out.println("Introdu numarul 1:");
				try {
					num1 = Integer.parseInt(scan.next());
					
				}catch(NumberFormatException e) {
					System.out.println("Te rog sa introduci doar numere!");
					continue;
				}
				System.out.println("Introdu numarul 2:");
				try {
					num2 = Integer.parseInt(scan.next());
					
				}catch(NumberFormatException e) {
					System.out.println("Te rog sa introduci doar numere!");
					continue;
				}
				
				if(num1 == 0 || num2 == 9) {
					
					throw new ArithmeticException("One of the numbers is0. Try again!");
				}
				
				result = num1/num2;
				System.out.println("Rezultat: " + result);
				break;
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(true);

}

}
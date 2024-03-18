package curs5;

import java.util.Scanner;

/*
 * Facem un program care citeste un text de la tastatura
 * Si cauta textul respectiv litera A
 * Daca o gasim, printam: "Litera A exista in text"
 * Daca nu o gasim, printam: "Litera A nu exista in text"
 */

public class LetterSearch {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a text: ");
			String text = scan.next();
			
			// radar
			// 01234
			// daca caracter de pe pozitia 0 este egal cu 'A' daca nu
			// trec la urmatorul caracter adica pozitia 1 si verific daca este egal cu 'A'
			
			boolean existaA = false;
			int counter = 0;
			for (int i=0; i < text.length(); i++) {
				
				if (text.charAt(i) == 'a') {
			//		System.out.println("Litera A exista in text");
					existaA = true;
					counter++;
			//		break;
			//	}else {
			//		System.out.println("Litera A nu exista in text");
				}
				
				//System.out.println(text.charAt(i));
				
			}
			
			if(existaA) {
				System.out.println("Litera A exista in text de " + counter + " ori");
			}else {
				System.out.println("Litera A nu exista in text");
			}
			
	}

}

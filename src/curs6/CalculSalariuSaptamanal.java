package curs6;

import java.util.Scanner;

/*
 * Facem un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * calculam doar daca a lucrat minim 1 ora sau maxim 40 ore
 * daca introduce nr invalid il rugam sa introduca nr valid de ore 
 * salariul il calculam cu formula:
 * oreLucrate * ratePerHour
 * RatePerHour = 25
 */

public class CalculSalariuSaptamanal {

	public static void main(String[] args) {
		int ratePerHour = 25;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu nr de ore:");
		int nrOreLucrate = scan.nextInt();
		
		while(nrOreLucrate < 1 || nrOreLucrate > 40) {
			System.out.println("Nr invalid de ore. Introdu nr intre 1 si 40");
			System.out.println("Introdu nr de ore valid: ");
			nrOreLucrate = scan.nextInt();
		}
		
		int salariu = nrOreLucrate * ratePerHour;
		System.out.println("Salariul tau este: " + salariu);
	}

}

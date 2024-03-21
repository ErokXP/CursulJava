package curs6;

/*
 * Scriem un program care calculeaza TVA la o suma
 * TVA poate avea multiple valori
 * vreau sa setez valoarea TVA pe obiect
 * vreau sa afisez nr total de calcule ale TVA pe care le-am facut
 */

public class CalculatorTVA {
	
	private double tvaDouble;
	private static int nrTotalDeCalcule;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100;
	}
	
	public double adunaTVA(double suma) {
		nrTotalDeCalcule++;
		return suma * (1 * tvaDouble);
	}
	
	public static int getNrTotalDeCalcul() {
		return nrTotalDeCalcule;
	}
}

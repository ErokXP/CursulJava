package curs1;

// comentariu pe o singura linie

/*
 * comentariu pe
 * mai multe linii
 */

	// Clasele le denumim folosing conventia UpperCamelCase -> ExempluClasa
	// Metode si variabile le folosim lowerCamelCase -> exemplu Variabila


public class FirstClass {

	public static void main(String[] args) {

		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		obiect.greetings();
		
	}
	
	public void greetings() {
		
		System.out.println("Salut");
	}

}

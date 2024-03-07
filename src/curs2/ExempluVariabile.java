package curs2;

public class ExempluVariabile {
	
	//variabila de instanta
	int varsta;
	String prenume;
	
	public static void main(String[] args) {
		//declarare si initializare variabila
		String nume = "Bob";
		//declarare variabila (variabila age are valoarea default pentru data type int)
		int age = 0; 
		
		ExempluVariabile obiect = new ExempluVariabile();

		System.out.println(nume);
		System.out.println(obiect.varsta);
		System.out.println(obiect.prenume);
		//System.out.println(obiect.prenume.length());


	}

}

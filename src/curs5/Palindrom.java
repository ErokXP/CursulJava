package curs5;

//palindrom ==> radar

public class Palindrom {

	public static void main(String[] args) {

		String cuvant = "radar";
		String cuvantIntors = "";
		
		for(int i = cuvant.length()-1; i <=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			System.out.println(cuvantIntors);
			
		}
		
		System.out.println(cuvantIntors);
		
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Este palindrom");
		}else {
			System.out.println("Nu este palindrom");
		}
			
	}

}

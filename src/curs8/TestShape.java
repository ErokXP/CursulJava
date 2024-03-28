package curs8;

public class TestShape {

	public static void main(String[] args) {
		
		Square patrat = new Square("Galben", "Patrat");
		
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume);
		
		patrat.printDetails();
		patrat.printNameLength();
		
		
	}

}

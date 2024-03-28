package curs8;

public class Square extends Shape {
	
	public Square(String culoare, String nume) {
		super(culoare, nume);
	}

	public void printDetails() {
		
		System.out.println("numele este : " + nume + " si culoarea este : " + culoare);
	}
	
	public void printNameLength() {
		
		System.out.println("lungimea numelui este : " + nume.length());
	}
	
}

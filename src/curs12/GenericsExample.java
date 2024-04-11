package curs12;

public class GenericsExample {

	public static void main(String[] args) {
		
		printCeva("123");
		printCeva(123);
		
		printGeneric("123");
		printGeneric(true);
		printGeneric(22.5);
		printGeneric(44);
		printCeva('x');
	}
	
	public static void printCeva(String text) {
		
		System.out.println(text);
	}
	
	public static void printCeva(int nr) {
		
		System.out.println(nr);
	}
	
/*	public static <T extends Number> void printGeneric(T obj) {
		System.out.println(obj);
		System.out.println("Clasa parinte a lui obj este : " + obj.getClass().getName());
	}*/
	public static <T> void printGeneric(T obj) {
		System.out.println(obj);
		System.out.println("Clasa parinte a lui obj este : " + obj.getClass().getName());
	}
}

package curs12;

public class VarargsExample {

	public static void main(String[] args) {
		
		printCeva("Alb", "Galben");
		printCeva("unu", "doi", "trei");
		printCeva("1", "2", "3", "4", "5");

		//JavascriptExecutor.executeScript(jsScript, element)
		//JavascriptExecutor.executeScript(jsScript, element, element2)
		
		printAltceva(123, "Bob");//zero argumente variabile
		printAltceva(123, "Bob", 300);//1 argument variabil
		printAltceva(123, "Bob", 300, 200, 4);//n argumente variabile
		
		printCevaGeneric(123.0, "text", true, 'x', 8);

	}
	
	public static <T> void printCevaGeneric(T...values) {
		for(T obj : values) {
			System.out.println(obj);
		}
	}
	
	/*public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}*/

	public static void printCeva(String...values) {
		
		for(String element : values) {
			System.out.println(element);
		}
	}
	
	public static void printAltceva(int number,String nume, int...numbers) {
		
	}
}

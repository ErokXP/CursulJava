package curs12;

public class StringBuilderExample {

	public static void main(String[] args) {

		reverseString("masina");
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
		//				   01234567891011
		deleteFromString("televizor", 4, 9);
		//				  012345678
		insertIntoString("Salut", 0, "Marian");
		//				  01234
		appendToString("Salut", " Marian");
		addSpacesToCamelCaseText("thisIsACamelCaseText");
	}
	
	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, int startIndex,int endIndex, String textToReplace) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.replace(startIndex, endIndex, textToReplace);
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text, int startIndex, int endIndex) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
	}
	
	public static void appendToString(String text, String textToAppend) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.append(textToAppend);
		System.out.println(sb);
	}
	
	//thisIsACamelCaseText --> this Is A Camel Case Text
	public static void addSpacesToCamelCaseText(String text) {
		StringBuilder sb = new StringBuilder(text);
		
		for(int i=0; i <sb.length(); i++) {
			
			if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
		}
		System.out.println(sb);
	}
	

}

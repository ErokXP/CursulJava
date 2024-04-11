package curs12;

public class StringExample {

	public static void main(String[] args) {
		
		//transform to string
		char ch = 'x';
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		System.out.println(chStr.getClass());
		System.out.println(chStr2.getClass());
		
		System.out.println("-------------------------------");
		
		boolean flag = true;
		String flagStr = Boolean.toString(flag);
		String flagStr2 = String.valueOf(flag);
		
		System.out.println(flagStr.getClass());
		System.out.println(flagStr2.getClass());

		System.out.println("-------------------------------");

		String str = null;
		System.out.println(str.toString());
		System.out.println(String.valueOf(str));

	}

}

package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		// [Oana, Ion, Gabriel, Maria]
		//   0     1      2       3
		
		System.out.println("---------------------------------");
		
		System.out.println("get element: " + list.get(0));
		
		for(String nume : list) {
			
			System.out.println(nume);
		}
		
		System.out.println("---------------------------------");
		
		list.add("Ioana");
		
		System.out.println(list);
		
		// [Oana, Ion, Gabriel, Maria, Ioana]
		//   0     1      2       3      4
		
		list.add(2, "Carmen");
		
		System.out.println(list);
		// [Oana, Ion, Carmen, Gabriel, Maria, Ioana]
		//   0     1      2       3      4       5
		
		list.add(6, "Bogdan");
		
		System.out.println(list);

		System.out.println("---------------------------------");

		System.out.println(list.size());	
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Gabriel");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("---------------------------------");

		list.add("Maria");
		System.out.println(list);
		
		System.out.println(list.subList(0, 3));
		list.subList(0, 3);
		
		System.out.println(list);
		
		System.out.println("---------------------------------");

		System.out.println(list.contains("Alina"));
		System.out.println(list.contains("Bogdan"));
		System.out.println(list.indexOf("Bogdan"));

		System.out.println("---------------------------------");

		// [Ion, Carmen, Ioana, Bogdan, Maria]
		//   0      1      2       3      4
		list.set(3, "Oana");
		System.out.println(list);
		// [Ion, Carmen, Ioana, Oana, Maria]
		//   0      1      2     3      4
		
		
	}

}

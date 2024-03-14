package curs4;


/*
 * operatori unar: au un singur operand (ex: numar++ aka numar = numar+1)
 * operatori binari: au doi operanzi (ex: var1 > var 2)
 * operatori ternar: au trei operanzi (operator conditional ex: ? :)   
 */


public class IncrementDecremnt {

	public static void main(String[] args) {
		
		//POST increment (ex: numar++)
		//PRE increment (ex: ++numar)
		
		//POST decrement (ex: numar--)
		//PRE decrement (ex: --numar)
		
		System.out.println("---POST---");
		int num1 = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num1);
		System.out.println("Valoarea lui num in POST increment: " + num1++);
		System.out.println("Valoarea lui num dupa POST increment: " + num1);
		
		System.out.println("---PRE---");
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num2);
		System.out.println("Valoarea lui num in PRE increment: " + ++num2);
		System.out.println("Valoarea lui num dupa PRE increment: " + num2);

	}

}

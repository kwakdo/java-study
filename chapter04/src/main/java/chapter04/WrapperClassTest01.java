package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10);		//deprecated
		Character c = new Character('C');   //deprecated
		Boolean b = new Boolean(true);      //deprecated
		
		// Auto Boxing
		Integer j1 = 10;
		Integer j2 = 10;

		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
		// Auto Unboxing
		// int m = j1.intValue() + 10;
		int m = j1 + 10;
	}
}
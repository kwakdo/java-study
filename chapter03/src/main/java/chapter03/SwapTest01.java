package chapter03;

public class SwapTest01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + ":" + b);
		
		/*swap*/
		int temp = 0;
		temp = a; 	//0:20
		a = b;	  	//20:20
		b = temp; 	//20:10
		
		
		System.out.println(a + ":" + b);
	}


}

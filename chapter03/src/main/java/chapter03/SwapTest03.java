package chapter03;

public class SwapTest03 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println(a.val + ":" + b.val);
		
		swap(a, b);
		
		System.out.println(a.val + ":" + b.val);
	}

	
	public static void swap(Value p, Value q) {
		/*swap*/
		int temp = p.val; 	//0:20
		p.val = q.val;	  	//20:20
		q.val = temp; 		//20:10
	
	}

}

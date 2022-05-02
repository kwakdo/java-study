package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result = str.toCharArray();

		int i = result.length / 2;
		for(int j = 0; j < i; j++) {
			char temp = result[j];
			result[j] = result[result.length - 1 - j];
			result[result.length - 1 - j] = temp;
		}

		return result;
	}

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}

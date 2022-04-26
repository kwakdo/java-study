package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		//printCharArray(c);
		String str = new String(c); 

		// 공백 문자 바꾸기
		//replaceSpace(c);
		String text = str.replace(' ', ',');


		// 수정된 배열 원소 출력
		//printCharArray(c);
		System.out.println(str);
		System.out.println(text);
	}

}

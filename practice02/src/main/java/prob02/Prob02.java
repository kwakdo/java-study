package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;

		System.out.println("5개의 숫자를 입력하세요.");
		intArray[0] = scanner.nextInt();
		intArray[1] = scanner.nextInt();
		intArray[2] = scanner.nextInt();
		intArray[3] = scanner.nextInt();
		intArray[4] = scanner.nextInt();
		
		
		/* 배열에 저장된 정수 값 더하기 */
		sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4];
		double av = sum/5;
		
		/* 출력 */
		System.out.println("평균은 " + av + " 입니다.");
		/* 자원정리 */
		scanner.close();
	}
}

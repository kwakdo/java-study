package prob3;

import java.util.Scanner;

public class Prob3 {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int sum = 0, a = 0, n = 0, temp;

      System.out.print("숫자를 입력하세요: ");
      temp = scanner.nextInt();

      while (n < temp) {

         if (temp % 2 == 1) {
            if (n % 2 == 1) {
               n += 2;
            } else {
               n += 1;
            }
            sum += n;
         } else {
            if (n % 2 == 0) {
               n += 2;
            } else {
               n += 1;
            }
            sum += n;
         }
      }

      System.out.println("결과 값: " + sum);

      scanner.close();

   }
}
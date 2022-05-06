package prob01;

public class Printer {

   public <T> void println(T t) {
      System.out.println(t);
   }

   public int sum(Integer... nums) {
      int sum = 0;
      for (Integer i : nums) {
         sum += i;
      }
      return sum;
   }

   public <T> void println(T... ts) {
      for (T t : ts) {
         System.out.println(t);
      }
   }

}
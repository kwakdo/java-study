package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// int[] a1 = {10, 20, 30, 40};
		// double[] d1 = ArrayUtil.intToDouble(a1);
		double[] d1 = ArrayUtil.intToDouble(new int[] {10, 20, 30, 40});
		// for(double d : d1) {
		// System.out.print(d + " ");
		// }
		System.out.println(Arrays.toString(d1));
		
		int[] a1 = ArrayUtil.DoubleToInt(new double[] {10, 20, 30, 40});
		int[] a2 = ArrayUtil.concat(new int[] {1, 2, 3}, new int[] {4, 5, 6});
	}

}

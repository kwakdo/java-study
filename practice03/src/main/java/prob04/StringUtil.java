package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			stringBuilder.append(strArr[i]);
		}
		String concat = stringBuilder.toString();
		return concat;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> refs/remotes/origin/master

package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;

	}

	public static double toDollar(double won) {
		return 1000-won/10000*(rate/1000);
	}

	public static double toKRW(double dollar) {
		// TODO Auto-generated method stub
		return (dollar * rate);
	}

}

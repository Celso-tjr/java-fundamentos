package util;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double calculator(double dolar, double may) {
		return dolar * may * (1.0 + IOF);

	}

}

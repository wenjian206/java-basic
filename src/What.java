
public class What {

	public static void main(String[] args) {
		double doubleNumber = 1342/144;
		String doubleAsString = String.valueOf(doubleNumber);
		int indexOfDecimal = doubleAsString.indexOf(".");
		System.out.println("Double Number: " + doubleNumber);
		System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
		System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal));

	}

}

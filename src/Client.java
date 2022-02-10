import finance.Fee;

public class Client {

	public static void main(String[] args) {
		maths.Calculator c = new maths.Calculator();
		System.out.println(c.addNumbers(12, 10));
		
		Fee f = new Fee();
		f.takeFee(4526);
	}

}

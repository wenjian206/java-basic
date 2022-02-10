package inheritance;
class Customer{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("FINALIZE CALLED");
	}
}
public class DemoFinzlize {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = c2;
		c1 = null;
		Customer c4 = new Customer();
		c4 = null;
		c2 = null;
		c3 = null;
		System.gc();
	}

}

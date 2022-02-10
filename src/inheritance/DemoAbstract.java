package inheritance;

abstract class Vehicle{
	int price;
	abstract void start();
	abstract void stop();
	public void applyingBreak() {
		System.out.println("Aooly break should ..");
	}
	
}
//concrete class
class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike start by  self or by...");
	}
	@Override
	void stop() {
		System.out.println("Bike switches off by using...");
	}
}
public class DemoAbstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.applyingBreak();
		b.stop();

	}

}

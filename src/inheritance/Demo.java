package inheritance;

interface Beverages{
	int cost=5;
	void prepareTea();
	default void mix() {
		System.out.println("Mix the beverages properly");
	}
	static void ratings() {
		System.out.println("rating for beverages");
	}
}
interface Games{
	void play();
	void pause();
}
interface ModernGames extends Games{
	void graphics();
	void animation();
}

abstract class Animal{
	int age;
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Animal should sleep");
	}
}

class Men extends Animal implements Beverages,ModernGames{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat extends Animal{
	//method overriding
	@Override    // Used to check override or not
	public void eat() {
		System.out.println("Cat eats fish");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eats meat");
	}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println("1st way");
		Cat c = new Cat();
		c.eat();
		Dog d = new Dog();
		d.eat();
		
		System.out.println("2nd way");
		Animal a = new Cat();
		a.eat();
		a = new Dog();
		a.eat();
		
		Men m = new Men();
		m.eat();
		m.sleep();
		m.play();
	}
}

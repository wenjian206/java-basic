package abstratexercise;

public abstract class Animal {

	abstract void makeNoise();
	abstract void eat();
	abstract void sleep();
	abstract void roam();
	
}

abstract class Feline extends Animal{

	@Override
	void roam() {

	}
	
}

abstract class Hippo extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Canine extends Animal{

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
package day7;

//Method overloading

public class Demo1 {
		public void add(int num1, int num2) {
			System.out.println("Adding two numbers: "+(num1+num2));
		}
		public void add(String num1, int num2) {
			System.out.println("Adding one string and one number: "+(num1+num2));
		}
		public void add(int num2,String num1) {
			System.out.println("Adding one num and one String: "+(num1+num2));
		}
		public void add(String fName, String sName) {
			System.out.println("Adding two String "+(fName+sName));
		}

		public static void main(String[] args) {
			Demo1 d = new Demo1();
			d.add(10, 20);
			d.add("N", 21);
			d.add(20, "WoW");
			d.add("Richard", "Kim");
		}

}

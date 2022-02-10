package inheritance;

class Order{
	int i;
	static {
		System.out.println("1.Order class static block");
	}
	Order(){
		i=10;
		System.out.println("4.Irder class constrctor,i= "+ i); //10
	}{
		System.out.println("3.Order class instance block,i= "+i); //0
	}
}
public class SubOrder extends Order {
	int j=9;
	static {
		System.out.println("2.Suborder class static block");
	}
	SubOrder(){
		j=15;
		System.out.println("6.SubOrder class constructor, j= "+j); //15
	}{
		System.out.println("5.SubOrder class instance block,j=9"+j); //9
	}
	public static void main(String[] str) {
		SubOrder subOrder = new SubOrder();

	}

}


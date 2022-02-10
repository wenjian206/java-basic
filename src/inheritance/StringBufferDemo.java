package inheritance;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Mohammad");

		System.out.println("Length: "+data.length());    //8
		System.out.println("Capacity: "+data.capacity());//16+8=24
	
		data.append("qwertyuikfdsfddb");
		System.out.println("Length: "+data.length());    //8+16=24
		System.out.println("Capacity: "+data.capacity());//24 (still inside the range of capacity)
		
		data.append("sf");
		System.out.println("Length: "+data.length());    //24+2=26
		System.out.println("Capacity: "+data.capacity());//(24+1)*2=50 (out of range: (capacity+1)*2
	
	}

}

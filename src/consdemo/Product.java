package consdemo;

public class Product {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int star;

	//Default constructor - used to initialize
	public Product() {
		productId=1;
		productName="Lakme";
		quantityOnHand=100;
		price=99;
		
		System.out.println("PRODUCT CONSTRUCTOR CALLED");
	}
	
	public Product(int productId, String productName, int quantityOnHand, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public void printProductDetails() {
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Quantity On Hand: "+quantityOnHand);
		System.out.println("Price: "+price);
	}
	
	public static void main(String[] args)
	{
		Product product1 = new Product();
		System.out.println("Printing the details about product1");
		product1.printProductDetails();
		
		Product product2 = new Product();
		System.out.println("Printing the details about product2");
		product1.printProductDetails();
		
		new Product().printProductDetails();
		
		Product product3 = new Product();
		
	}
}

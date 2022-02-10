package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review r1 = new Review(21,"Daniel",5);
		r1.reviewCount++;
		
		System.out.println(r1.getReviewGivenBy());
		System.out.println(r1.getRating());

	}

}

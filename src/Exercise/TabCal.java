package Exercise;

import java.util.Scanner;

public class TabCal {
	
	public static void main(String[] args) {
		double tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your gender:");
		String gender = sc.nextLine();
		
		System.out.println("Please enter your income:");
		double income = sc.nextDouble();
		
		if (gender.equalsIgnoreCase("male")) {
			if(income <= 180000) {
				System.out.println("No tax payable");
			}
			else if(income >180000 & income <= 500000) {
				tax = income* 0.1;
				System.out.println("Your tax is: "+tax);
			}
			else if(income >500000 & income <= 800000) {
				tax =  income* 0.2;
				System.out.println("Your tax is: "+tax);
			}
			else{
				tax = income* 0.3;
				System.out.println("Your tax is: "+tax);
			}
		}
		else if (gender.equalsIgnoreCase("female")) {
			if(income <= 190000) {
				System.out.println("No tax payable");
			}
			else if(income >190000 & income <= 500000) {
				tax = income* 0.1;
				System.out.println("Your tax is: "+tax);
			}
			else if(income >500000 & income <= 800000) {
				tax =  income* 0.2;
				System.out.println("Your tax is: "+tax);
			}
			else{
				tax = income* 0.3;
				System.out.println("Your tax is: "+tax);
			}
		}
	}

}


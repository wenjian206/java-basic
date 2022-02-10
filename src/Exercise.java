/*1.	Print the character at the 12th index. 

2.	Check whether the String contains the word “is”. 
3.	Add the string “and killed it” to the existing string. 
4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. System.out.println("String lower case is "+ str1.toLowerCase());
		System.out.println("String upper case is "+ str1.toUpperCase());
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”.
*/

public class Exercise {
	
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		//1
		System.out.println(s.charAt(12));
		//2
		System.out.println(s.contains("is"));
		//3
		System.out.println(s.concat("and killed it"));
		//4
		System.out.println(s.endsWith("dogs"));
		//5
		System.out.println(s.contentEquals("The quick brown Fox jumps over the lazy Dog"));
		//6
		System.out.println(s.contentEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		//7
		System.out.println(s.length());
		//8
		System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
		//9
		System.out.println(s.replace("The", "A"));
		//10
		System.out.println(s.split(s, 16));
		//11
		System.out.println(s.substring(16, 19));
		System.out.println(s.substring(40,43));
		//12
		System.out.println(s.toLowerCase());
		//13
		System.out.println(s.toUpperCase());
		//14
		System.out.println(s.indexOf("a"));
		//15
		System.out.println(s.lastIndexOf("e"));
	}

}

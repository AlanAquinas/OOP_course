package practice1;

import java.util.Scanner;

public class problem_6 {

	public static void main(String[] args) {
		System.out.println("Input text: ");
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();  
		StringBuilder reversed = new StringBuilder(original).reverse();
		if (reversed.toString().equals(original)) {
			System.out.println(original + " is polyndrome");
		} else {
			System.out.println(original + " is not polyndrome");
			
		}
		in.close();
	}
}

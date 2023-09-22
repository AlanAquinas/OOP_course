package practice1;

import java.util.Scanner;

public class problem_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the coefficients of the quadratic equation:");
		
		System.out.println("a:");
		double a = in.nextDouble();
		
		System.out.println("b:");
		double b = in.nextDouble();
		
		System.out.println("c:");
		double c = in.nextDouble();
		
		
		double discriminant = b * b - 4 * a * c;
		if (discriminant<0) {
			System.out.println("There's no solutions!");
		}else if(discriminant == 0) {
			System.out.println(-b / 2 * a);
		}else {
			System.out.println("First root: " + (-b + Math.sqrt(discriminant))/ 2 * a);
			System.out.println("Second root: " + (-b - Math.sqrt(discriminant))/ 2 * a);
		}
		in.close();
	}
}
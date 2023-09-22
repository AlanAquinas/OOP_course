package practice1;

import java.util.Scanner;

class Square {
	private double side;
	
	public Square(double side) 
	{
		this.side = side;
	}
	
	public double getArea() 
	{
		return side*side;
	}
	public double getPerimiter() 
	{
		return 4*side;
	}
	public double getDioganal() 
	{
		return Math.sqrt(2) * side;
	}
}

public class problem_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		
		Square square = new Square(a);
		
		double area = square.getArea();
		double perimitr = square.getPerimiter();
		double dioganal = square.getDioganal();
		
		System.out.println("Area of the square: " + area);
		System.out.println("Perimitr of the square: " + perimitr);
		System.out.println("Dioganal of the square: " + dioganal);
		in.close();
	}
}

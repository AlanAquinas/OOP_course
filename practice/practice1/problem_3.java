package practice1;

import java.util.Scanner;

public class problem_3 {
	public static void alfaGrade(double intGrade) {
		if (intGrade == 4.0) {
			System.out.print("A");
		} else if (intGrade > 3.67) {
			System.out.print("A-");
		} else if(intGrade > 3.33) {
			System.out.print("B+");
		} else if(intGrade > 3.0) {
			System.out.print("B");
		} else if(intGrade > 2.67) {
			System.out.print("B-");
		} else if(intGrade > 2.33) {
			System.out.print("C+");
		} else if(intGrade > 2.0) {
			System.out.print("C");
		} else if(intGrade > 1.67) {
			System.out.print("C-");
		} else if(intGrade > 1.33) {
			System.out.print("D+");
		} else if(intGrade > 1.0) {
			System.out.print("D");
		} else {
			System.out.print("Fail");
		}
	}

	public static void main(String[] args) {
		System.out.println("Please, print GPA in range(0-4, e.g. '3,3')");
		Scanner in = new Scanner(System.in);
		double int_grade = in.nextDouble();
		
		alfaGrade(int_grade);
		in.close();
	}

}

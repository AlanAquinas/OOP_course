package lab.lab_1;

import java.util.Scanner;

import practice2.Student;

public class TestGradeBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeBook gradebook = new GradeBook();
		
		Course course = new Course("OOP", "CS101", 6, "PP2");
		System.out.println(gradebook.displayMessage(course));
        
		
		System.out.print("Input data of students(name, grade): ");
        while (scanner.hasNext()) {     
			String name = scanner.next();
			if (name.equals("exit")) break;
			int grade = scanner.nextInt();
			
			gradebook.addStudent(name, grade);
		}
		scanner.close();
		
		System.out.println(gradebook.gradeReport());
		gradebook.printBarChart();
	}

}

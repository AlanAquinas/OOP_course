package practice1;

import java.util.Scanner;

public class TaskOne {
	
	public static void printLines(int length) {
		System.out.print("+");
		for(int i=0; i < length; ++i) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void printMyName(String name) {
		int text_len = name.length();
		
		printLines(text_len);
		
		System.out.print("|");
		System.out.print(name);
		System.out.println("|");
		
		printLines(text_len);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();

		printMyName(text);
		
		in.close();
	}

}

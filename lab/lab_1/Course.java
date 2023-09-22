package lab.lab_1;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private String description;
	private int credits;
	private String prerequesites;
	
	public Course(String name, String description, int credits) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequesites = "No prerequisite";
	}
	
	public Course(String name, String description, int credits, String prerequesites) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequesites = prerequesites;
	}
	
	
	@Override
	public String toString() {
		String ans = description + " " + name + "!" + "\n"+ "Number of credits: "+ credits + "\n"+"Prerequisites: " + prerequesites;
		return ans;
	}
}

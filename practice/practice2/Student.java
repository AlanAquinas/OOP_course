package practice2;

public class Student {
	String name;
	String id;
	int curYear;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		this.curYear = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void curYearIncrement() {
		this.curYear++;
	}
	
	public int getCurYear() {
		return this.curYear;
	}
}



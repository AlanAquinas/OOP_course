package practice2;

public class Student {
	public String name;
	public int id;
//	public int curYear;
	public int score;
	
	public Student(String name, int score, int id) {
		this.name = name;
		this.score = score;
		this.id = id;
	}
	
//	public Student(String name, int id) {
//		this.name = name;
//		this.id = id;
//		this.curYear = 1;
//	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore () {
		return score;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setValue (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName (String name ) {
		this.name = name;
	}
	
//	public void curYearIncrement() {
//		this.curYear++;
//	}
//	
//	public int getCurYear() {
//		return this.curYear;
//	}
}



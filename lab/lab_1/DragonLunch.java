package lab.lab_1;

import java.util.Vector;

public class DragonLunch {
	private Vector<Person> kidnappedStudentes = new Vector<>();
	private int couples = 0;
	public void kidnap(Person p) {
		kidnappedStudentes.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int studentsNum = 0;
		for(Person person: kidnappedStudentes) {
			if(person.getGender() == Gender.BOY) {
				studentsNum++;
			}else {
				if(studentsNum == 0) {
					return true;
				}else {
					studentsNum--;
					couples++;
				}
			}
		}
		if(couples * 2 == kidnappedStudentes.size()) return false;
		else return true;
		
	}
	
	public String toString() {
		if (willDragonEatOrNot()) {
			return "Winter has already come, none of the students survived";
		} else {
			return "All students survived!!! this day will go down in history as the day of the power of love and day when Alan get full point!!!";
		}
	}
	
	public static void main(String[] args) {
		
		DragonLunch dragonlunch = new DragonLunch();
		Person Student1 = new Person(Gender.BOY);
		Person Student2 = new Person(Gender.BOY);
		Person Student3 = new Person(Gender.GIRL);
		Person Student4 = new Person(Gender.GIRL);
		
		dragonlunch.kidnap(Student1);
		dragonlunch.kidnap(Student2);
		dragonlunch.kidnap(Student3);
		dragonlunch.kidnap(Student4);
		
		System.out.print(dragonlunch.toString());
	}

}

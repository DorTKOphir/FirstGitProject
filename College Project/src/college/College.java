package college;

import java.util.Vector;

public class College {
	private Vector<Student> students;
	
	public College() {
		this.students = new Vector<Student>();
	}
	
	public void addStudent(Student s) {
		Student temp = new Student(s);
		this.students.add(temp);
	}
	
	public boolean isStudentInCollege(Student s) {
		return this.students.contains(s);
	}
}

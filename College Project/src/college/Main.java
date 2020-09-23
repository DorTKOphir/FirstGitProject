package college;

public class Main {

	public static void main(String[] args) {
		College c = new College();
		Student dor = new Student("Dor", 184, 1);
		c.addStudent(dor);
		System.out.println(c.isStudentInCollege(dor));
	}

}

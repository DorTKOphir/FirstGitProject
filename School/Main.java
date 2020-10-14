package schoolPackage;

public class Main {

	public static void main(String[] args) {
		ClassOfStudents c =new ClassOfStudents();
		c.add(new Student("ariel", "amosi", "123456"));
		Student s = new Student("amosi","ariel","1234567887776");
		c.add(s);
		System.out.println(c.contains(s));
		c.remove(s);
		System.out.println(c.contains(s));
	}

}

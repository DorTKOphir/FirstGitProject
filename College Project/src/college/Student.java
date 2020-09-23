package college;

public class Student {
	private String name;
	private int height;
	private int id;
	
	public Student(String name, int height, int id) {
		this.name = name;
		this.height = height;
		this.id = id;
	}
	
	public Student(Student s) {
		this(s.name, s.height, s.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (height != other.height)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		return false;
	}
	
}

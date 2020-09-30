package schoolPackage;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private String id;
	private Vector <Integer> grades;
	
	public Student(String firstName, String lastName, String id) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.grades=new Vector <Integer>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vector<Integer> getGrades() {
		return grades;
	}

	public void setGrades(Vector<Integer> grades) {
		this.grades = grades;
	}
}

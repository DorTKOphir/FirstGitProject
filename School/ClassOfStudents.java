package schoolPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class ClassOfStudents  implements Set{
	private  Vector<Student>students;
	
	public ClassOfStudents(){
		students=new Vector<Student>();
	}
	
	private class MyIterator implements Iterator<Student>{
		private Vector<Student>arr;
		private int current;
		
		public MyIterator(Vector<Student>arr){
			this.arr=arr;
			current=0;
		}
		
		@Override
		public boolean hasNext() {
			return current<arr.size();
		}

		@Override
		public Student next() {
			return(arr.get(current++));
		}
	}
	
	public Vector<Student> getStudents() {
		return students;
	}

	public void setStudents(Vector<Student> students) {
		this.students = students;
	}
	
	@Override
	public int size() {
		return this.students.size();
	}

	@Override
	public boolean isEmpty() {
		return this.students.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		Student temp;
		if(o instanceof Student) {
			temp=(Student)o;
			return this.students.contains(temp);
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		return new MyIterator(this.students);
	}

	@Override
	public boolean add(Object e) {
		Student temp;
		if(e instanceof Student) {
			temp=(Student)e;
			return 	this.students.add(temp);
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		Student temp;
		if(o instanceof Student) {
			temp=(Student)o;
			return this.students.remove(temp);
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		Vector <Student> temp;
		if(c instanceof Vector && ((Vector) c).get(0) instanceof Student){
			temp=(Vector)c;
			while(!c.isEmpty()) {
				if(this.students.contains(temp.get(0)))
					temp.remove(0);
				else return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		Vector <Student> temp;
		if(c instanceof Vector && ((Vector) c).get(0) instanceof Student) {
			temp=(Vector)c;
			while (!temp.isEmpty()) {
				this.students.add(temp.get(0));
				temp.remove(0);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		Vector <Student> temp;
		if(c instanceof Vector && ((Vector) c).get(0) instanceof Student){
			temp=(Vector)c;
			while(!c.isEmpty()) {
				if(this.students.contains(temp.get(0)))
					this.students.remove(temp.get(0));
				temp.remove(0);
			}
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		this.students.clear();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
}


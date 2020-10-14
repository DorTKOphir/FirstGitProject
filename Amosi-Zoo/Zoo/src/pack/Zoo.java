package pack;
import java.util.*;

public class Zoo {
	private Vector <Animal> arr;
	
	public Zoo() {
		this.arr=new Vector<Animal>();
	}
	
	public boolean addAnimal(Animal a) {
		for (int i = 0; i < this.arr.size(); i++) {
			if(this.equal(a, this.arr.get(i))){
				return false;
			}
		}
		this.arr.add(a);
		return true;
	}
	
	public Animal resembleAnimal() {
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = 0; j < this.arr.size(); j++) {
				if(this.resemble(this.arr.get(i),this.arr.get(i) )){
					return this.arr.get(i);
				}
			}
		}
		return null;
	}
	
	private boolean resemble(Animal a, Animal b) {
		if(a instanceof Dragon||b instanceof Dragon) {
			Dragon da=(Dragon)a;
			Dragon db=(Dragon)b;
			return a instanceof Dragon && b instanceof Dragon && da.resemble(db);
		}
		else if(a instanceof Dinosaur||b instanceof Dinosaur) {
			Dinosaur da=(Dinosaur)a;
			Dinosaur db=(Dinosaur)b;
			return a instanceof Dinosaur && b instanceof Dinosaur && da.resemble(db);
		}
		else if(a instanceof CarryBear||b instanceof CarryBear) {
			CarryBear da=(CarryBear)a;
			CarryBear db=(CarryBear)b;
			return a instanceof CarryBear && b instanceof CarryBear && da.resemble(db);
		}
		else return a.resemble(b);
	}
	
	private boolean equal(Animal a, Animal b) {
		if(a instanceof Dragon||b instanceof Dragon) {
			Dragon da=(Dragon)a;
			Dragon db=(Dragon)b;
			return a instanceof Dragon && b instanceof Dragon && da.equals(db);
		}
		else if(a instanceof Dinosaur||b instanceof Dinosaur) {
			Dinosaur da=(Dinosaur)a;
			Dinosaur db=(Dinosaur)b;
			return a instanceof Dinosaur && b instanceof Dinosaur && da.equals(db);
		}
		else if(a instanceof CarryBear||b instanceof CarryBear) {
			CarryBear da=(CarryBear)a;
			CarryBear db=(CarryBear)b;
			return a instanceof CarryBear && b instanceof CarryBear && da.equals(db);
		}
		else return a.equals(b);
	}
}
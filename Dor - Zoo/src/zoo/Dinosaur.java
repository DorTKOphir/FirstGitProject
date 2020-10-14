package zoo;

public class Dinosaur extends Animal {
	private int height;

	public Dinosaur(String name, int height) {
		super(name, false, 4);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinosaur other = (Dinosaur) obj;
		if (height != other.height)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dinosaur [name=" + this.getName() + ", isVegan=" + this.isVegan() + ", numOfLegs=" + this.getNumOfLegs() + ", height="+ this.height + "]";
	}
	
	
}

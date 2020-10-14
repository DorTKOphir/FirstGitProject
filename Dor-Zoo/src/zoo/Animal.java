package zoo;

public class Animal {
	private String name;
	private boolean isVegan;
	private int numOfLegs;
	
	public Animal(String name, boolean isVegan, int numOfLegs) {
		this.name = name;
		this.isVegan = isVegan;
		this.numOfLegs = numOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (isVegan != other.isVegan)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfLegs != other.numOfLegs)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", isVegan=" + isVegan + ", numOfLegs=" + numOfLegs + "]";
	}
	
	
	
	
}

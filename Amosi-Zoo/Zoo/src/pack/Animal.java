package pack;

public class Animal {
	protected String name;
	protected boolean isVegetrian;
	protected int numOfLegs;
	
	public Animal(String name, boolean isVegetrian, int numOflegs) {
		this.name=name;
		this.isVegetrian=isVegetrian;
		this.numOfLegs=numOflegs;
	}
	
	public boolean equals(Animal a) {
		return this.name==a.name && this.isVegetrian==a.isVegetrian && this.numOfLegs== a.numOfLegs;
	}
	
	public boolean resemble(Animal a) {
		return this.isVegetrian==a.isVegetrian && this.numOfLegs== a.numOfLegs;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetrian() {
		return isVegetrian;
	}

	public void setVegetrian(boolean isVegetrian) {
		this.isVegetrian = isVegetrian;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}

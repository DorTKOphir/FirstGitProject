package zoo;

public class Dragon extends Animal {
	private double flameDistance;
	private int numOfHeads;

	public Dragon(String name, double flameDistance, int numOfHeads) {
		super(name, false, 4);
		this.flameDistance = flameDistance;
		this.numOfHeads = numOfHeads;
	}

	public double getFlameDistance() {
		return flameDistance;
	}

	public void setFlameDistance(double flameDistance) {
		this.flameDistance = flameDistance;
	}

	public int getNumOfHeads() {
		return numOfHeads;
	}

	public void setNumOfHeads(int numOfHeads) {
		this.numOfHeads = numOfHeads;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dragon other = (Dragon) obj;
		if (Double.doubleToLongBits(flameDistance) != Double.doubleToLongBits(other.flameDistance))
			return false;
		if (numOfHeads != other.numOfHeads)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dragon [name=" + this.getName() + ", isVegan=" + this.isVegan() + ", numOfLegs=" + this.getNumOfLegs() + ", flameDistance=" + this.flameDistance + ", numOfHeads=" + this.numOfHeads + "]";
	}
	
	
	
	
}

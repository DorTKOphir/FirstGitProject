package zoo;

public class CareBear extends Animal {
	private CareBearSign sign;

	public CareBear(String name, CareBearSign sign) {
		super(name, true, 2);
		this.sign = sign;
	}

	public CareBearSign getSign() {
		return sign;
	}

	public void setSign(CareBearSign sign) {
		this.sign = sign;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CareBear other = (CareBear) obj;
		if (sign != other.sign)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CareBear [name=" + this.getName() + ", isVegan=" + this.isVegan() + ", numOfLegs=" + this.getNumOfLegs() + ", sign=" + this.sign + "]";
	}
	
	
	
	
}

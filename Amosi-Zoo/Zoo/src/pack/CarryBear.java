package pack;

public class CarryBear extends Animal {
	private Sign sign;
	public CarryBear(String name, Sign sign) {
		super(name, true, 2);
		this.setSign(sign);
	}
	
	public Sign getSign() {
		return sign;
	}
	public void setSign(Sign sign) {
		this.sign = sign;
	}
	
	public boolean resemble(CarryBear c) {
		return this.sign==c.sign;
	}
	
	public boolean equals(CarryBear c) {
		return this.name==c.name && this.sign==c.sign;
	}
}

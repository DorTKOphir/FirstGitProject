package carList;

public class Car {
	private int num, times;
	
	public Car(int num) {
		this.num = num;
		this.times = 0;
	}
	
	public int GetNum() {
		return this.num;
	}
	
	public int GetTimes() {
		return this.times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
}

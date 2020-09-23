package carList;
import java.util.HashMap;

public class CarWash {
	private HashMap<Integer, Integer> data;
	
	public CarWash() {
		this.data = new HashMap<Integer, Integer>();
	}
	
	public boolean carExists(int num) {
		if (data.containsKey(num)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addWashForCar(int num) {
		if (carExists(num)) {
			data.replace(num, data.get(num) + 1);
		}
		else {
			data.put(num, 1);
		}
	}
	
	public int computePrice(int num, int type) {
		System.out.println(data.get(num));
		if (data.get(num) > 5) {
			if (type == 1) {
				return 18;
			}
			else {
				return 24;
			}
		}
		else {
			if (type == 1) {
				return 20;
			}
			else {
				return 30;
			}
		}
	}
}

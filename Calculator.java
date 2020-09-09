package gimatry;

import java.util.Random;

public class Calculator {
	private int times;
	
	public Calculator(int times)
	{
		this.times = times;
	}
	
	public double Result()
	{
		int count = 0;
		Random r = new Random();
		for (int i = 0; i < this.times; i++) {
			double x = -0.5 + (0.5 - -0.5) * r.nextDouble();
			double y = -0.5 + (0.5 - -0.5) * r.nextDouble();
			if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 0.25) {
				count++;
			}
		}
		return ((double)count / times) * 4;
	}
	
}
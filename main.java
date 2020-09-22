package gimatry;
package pack;

import java.util.Random;

public class main {
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(100000000);
		double pi = c.Result();
		System.out.println(pi);
		Guitar save= new Guitar(GuitarKind.classic,"",0);
		Guitar g= new Guitar(GuitarKind.classic,"ffffff",0);
		save=g;
		System.out.println(save.toString());
	}

}

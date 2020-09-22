package pack;

public class Main {

	public static void main(String[] args) {
		Guitar save= new Guitar(GuitarKind.classic,"",0);
		Guitar g= new Guitar(GuitarKind.classic,"ffffff",0);
		save=g;
		System.out.println(save.toString());
	}

}

package MyZoo;

public class Dinosaur extends Animal {
	private int hight;
	public Dinosaur(String name, int hight) {
		super(name, false, 4);
		this.hight=hight;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public boolean resemble(Dinosaur d) {
		return this.hight==d.hight;
	}
	
	public boolean equals(Dinosaur d) {
		return this.name==d.name && this.hight==d.hight;
	}
}

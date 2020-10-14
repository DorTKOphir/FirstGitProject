package MyZoo;

public class Dragon extends Animal {
	private int fireRange;
	private int numOfHeads;
	public Dragon(String name,int fireRange,int numOfHeads) {
		super(name, false, 4);
		this.fireRange=fireRange;
		this.numOfHeads=numOfHeads;
	}
	public int getNumOfHeads() {
		return numOfHeads;
	}
	public void setNumOfHeads(int numOfHeads) {
		this.numOfHeads = numOfHeads;
	}
	public int getFireRange() {
		return fireRange;
	}
	public void setFireRange(int fireRange) {
		this.fireRange = fireRange;
	}
	
	public boolean resemble(Dragon d) {
		return this.fireRange==d.fireRange && this.numOfHeads==d.numOfHeads;
	}
	
	public boolean equals(Dragon d) {
		return this.fireRange==d.fireRange && this.numOfHeads==d.numOfHeads && this.name==d.name;
	}
}

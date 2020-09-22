package pack;

public class Drums {
	private static int count=1000;
	private int id;
	private int numOfDrums;
	private String company;
	private int price;
	
	public Drums(int numOfDrums, String company, int price)
	{
		this.id=count;
		count++;
		this.numOfDrums=numOfDrums;
		this.company=company;
		this.price=price;
	}
	
	public String toString()
	{
		String to="num of drums: "+this.numOfDrums+" ; company: "+this.company+" ; price: "+this.price+" ; id: "+this.id+"\n";
		return to;
	}
	
	public int counter()
	{
		return count;
	}
	
	
	public int get_kind()
	{
		return this.numOfDrums;
	}
	
	public int get_price()
	{
		return this.price;
	}
	
	public String get_company()
	{
		return this.company;
	}

	public int getId() {
		return this.id;
	}
}

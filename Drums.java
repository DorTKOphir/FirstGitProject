package pack;

public class Drums {
	private static int count=1000;
	private int id;
	private int kind;
	private String company;
	private int price;
	
	public Drums(int kind, String company, int price)
	{
		this.id=count;
		count++;
		this.kind=kind;
		this.company=company;
		this.price=price;
	}
	
	public String toString()
	{
		String to="";
		if(this.kind==1)
			to+="real drums ; ";
		else
			to+="electric drums ; ";
		to+="company: "+this.company+" ; price: "+this.price+" ; id: "+this.id+"\n";
		return to;
	}
	
	public int counter()
	{
		return count;
	}
	
	
	public int get_kind()
	{
		return this.kind;
	}
	
	public int get_price()
	{
		return this.price;
	}
	
	public String get_company()
	{
		return this.company;
	}

	public int get_id() {
		return this.id;
	}
}

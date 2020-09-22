package pack;
	
public class Guitar {
	private static int count=1000;
	private int id;
	private GuitarKind kind;
	private String company;
	private int price;
	
	public Guitar(GuitarKind kind, String company, int price)
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
		if(this.kind==GuitarKind.classic)
			to+="classic guitar ; ";
		else if(this.kind==GuitarKind.acoustic)
			to+="acustic guitar ; ";
		else
			to+="electric guitar ; ";
		to+="company: "+this.company+" ; price: "+this.price+" ; id: "+this.id+"\n";
		return to;
	}
	
	public int counter()
	{
		return count;
	}
	
	
	public GuitarKind getKind()
	{
		return this.kind;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int nPrice)
	{
		this.price=nPrice;
	}
	
	public String getCompany()
	{
		return this.company;
	}

	public int getId() {
		return this.id;
	}
}

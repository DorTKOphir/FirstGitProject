package pack;

public class Guitar_shop {
	private Guitar [] guitars;
	private static int guitarCreated=0;
	private static int guitarSold=0;
	
	private Drums [] drumArr;
	private static int drumsCreated=0;
	private static int drumsSold=0;
	
	private Piano [] pianoArr;
	private static int pianoCreated=0;
	private static int pianoSold=0;
	
	private Guitar cFlag;
	private Guitar aFlag;
	private Guitar eFlag;
	
	public Guitar_shop()
	{
		this.guitars=new Guitar[103];
		this.drumArr=new Drums[100];
		this.pianoArr=new Piano[100]; 
		this.cFlag=new Guitar(GuitarKind.classic, "flag", 0);
		this.aFlag=new Guitar(GuitarKind.acoustic, "flag", 1);
		this.eFlag=new Guitar(GuitarKind.electric, "flag", 2);
		guitars[0]=cFlag;
		guitars[1]=aFlag;
		guitars[2]=eFlag;
	}
	
	public void addDrums(int numOfDrums, String company, int price)
	{
		if(drumsCreated-drumsSold<100)
		{
			int i=0;
			while(i<drumArr.length && drumArr[i]!=null)i++;
			drumArr[i]=new Drums(numOfDrums,company, price);
			drumsCreated++;
		}
	}
	
	public Drums sellDrumsById(int id)
	{
		Drums save=new Drums(0,"",0);
		if(drumsCreated-drumsSold>5)
		{
			int i=0;
			while (i<drumArr.length && drumArr[i].getId()!=id ) i++;
			save=drumArr[i];
			drumArr[i]=null;
			drumsSold++;
			for (; i < drumArr.length; i++) {
				drumArr[i]=drumArr[i+=1];
			}
		}
		return save;
	}
	
	public void addPiano(int octave, String company, int price)
	{
		if(pianoCreated-pianoSold>5)
		{
			int i=0;
			while(i<pianoArr.length && pianoArr[i]!=null)i++;
			pianoArr[i]=new Piano(octave,company, price);
			pianoCreated++;
		}
	}
	
	public Piano sellPianoById(int id)
	{
		Piano save=new Piano(0,"",0);
		if(pianoCreated-pianoSold>5)
		{
			int i=0;
			while (i<pianoArr.length && pianoArr[i].getId()!=id ) i++;
			save=pianoArr[i];
			pianoArr[i]=null;
			pianoSold++;
			for (; i < drumArr.length; i++) {
				pianoArr[i]=pianoArr[i+=1];
			}
		}
		return save;
		
	}
	
	public void addGuitar(GuitarKind kind, String company, int price)
	{
		int i;
		if(kind == this.cFlag.getKind()&&(guitarCreated-guitarSold)<100)
		{
			for (i = 102; i >= this.aFlag.getPrice() ; i++) {
				this.guitars[i]=this.guitars[i-1];
			}
			guitars[this.aFlag.getPrice()]=new Guitar (kind, company, price);
			this.aFlag.setPrice(this.aFlag.getPrice()+1);
		}
		else if(kind == this.aFlag.getKind()&&(guitarCreated-guitarSold)<100)
		{
			for (i = 102; i >= this.eFlag.getPrice() ; i++) {
				this.guitars[i]=this.guitars[i-1];
			}
			guitars[this.eFlag.getPrice()]=new Guitar (kind, company, price);
			this.eFlag.setPrice(this.eFlag.getPrice()+1);
		}
		else if((guitarCreated-guitarSold)<100)
		{
			i=102;
			while(guitars[i]==null){
				i++;
			}
			guitars[i+1]=new Guitar (kind, company, price);
		}
	}

	public void print_guitars()
	{
		for (int i = 0; i < this.guitars.length; i++) {
			if(this.guitars[i]!=null)
				System.out.println(this.guitars[i].toString());
		}
	}
	
	public Guitar sellGuiutarById(int id)
	{
		Guitar save= new Guitar(GuitarKind.classic,"",0);
		if (guitarCreated-guitarSold>5)
		{
			int i;
			for (  i = 0; i < this.guitars.length; i++) {
				if(this.guitars[i].getId()==id)
				{
					save=this.guitars[i];
					this.guitars[i]=null;
					guitarSold = getHow_many_sold() + 1;
					break;
				}
			}
			for (;i<this.guitars.length; i++)
			{
				this.guitars[i]=this.guitars[i+1];
			}
		}
		return save;
	}
	public static int getHow_many_sold() {
		return guitarSold;
	}
	public static int getHow_many_created() {
		return guitarCreated;
	}
}

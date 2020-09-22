package guitarshop;
package pack;

public class Piano {
	private int id;
	private int octave;
	private String manufacturer;
	private int price;
	private static int count = 1000;
	
	public Piano(int octave, String manufacturer, int price)
	{
		this.id = count;
		count++;
		this.octave = octave;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public int getOctave() {
		return octave;
	}

	public void setOctave(int octave) {
		this.octave = octave;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Piano - Id = " + id + ", Octave = " + octave + ", Manufacturer = " + manufacturer + ", Price = " + price;
	}
	
	
}
